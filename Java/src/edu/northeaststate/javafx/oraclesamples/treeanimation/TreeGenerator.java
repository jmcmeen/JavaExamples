/*
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package edu.northeaststate.javafx.oraclesamples.treeanimation;

import javafx.scene.Group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static edu.northeaststate.javafx.oraclesamples.treeanimation.RandomUtil.getRandomIndex;
import static edu.northeaststate.javafx.oraclesamples.treeanimation.Util.addChildToParent;

public class TreeGenerator {

    public static final int FLOWERS_COUNT = 100;
    public final Group content;
    private final int treeDepth;

    public TreeGenerator(Group content, int treeDepth) {
        this.content = content;
        this.treeDepth = treeDepth;
    }

    public Tree generateTree() {
        Tree tree = new Tree(treeDepth);
        addChildToParent(content, tree);

        Branch root = new Branch();
        addChildToParent(tree, root);
        tree.generations.get(0).add(root); //root branch

        for (int i = 1; i < treeDepth; i++) {
            for (Branch parentBranch : tree.generations.get(i - 1)) {
                List<Branch> newBranches = generateBranches(parentBranch, i);
                if (newBranches.isEmpty()) {
                    tree.crown.add(parentBranch);
                }
                tree.generations.get(i).addAll(generateBranches(parentBranch, i));
            }
        }
        for (Branch crownBranch : tree.generations.get(treeDepth - 1)) {
            tree.crown.add(crownBranch);
        }
        tree.leafage.addAll(generateLeafage(tree.crown));
        tree.flowers.addAll(generateFlowers(tree.crown));
        return tree;
    }

    private List<Branch> generateBranches(Branch parentBranch, int depth) {
        List<Branch> branches = new ArrayList<>();
        if (parentBranch == null) { // add root branch
            branches.add(new Branch());
        } else {
            if (parentBranch.length < 10) {
                return Collections.emptyList();
            }
            branches.add(new Branch(parentBranch, Branch.Type.LEFT, depth)); //add side left branch
            branches.add(new Branch(parentBranch, Branch.Type.RIGHT, depth)); // add side right branch
            branches.add(new Branch(parentBranch, Branch.Type.TOP, depth)); //add top branch
        }

        return branches;
    }

    private List<Leaf> generateLeafage(List<Branch> crown) {
        List<Leaf> leafage = new ArrayList<>();
        for (Branch branch : crown) {
            Leaf leaf = new Leaf(branch);
            leafage.add(leaf);
            addChildToParent(branch, leaf);
        }
        return leafage;
    }

    private List<Flower> generateFlowers(List<Branch> crown) {
        List<Flower> flowers = new ArrayList<>(FLOWERS_COUNT);
        for (int i = 0; i < FLOWERS_COUNT; i++) {
            Branch branch = crown.get(getRandomIndex(0, crown.size() - 1));
            final Flower flower = new Flower(branch);
            addChildToParent(branch, flower);
            flowers.add(flower);
        }
        return flowers;
    }
}
