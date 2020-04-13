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
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.transform.Translate;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;


public class Flower extends Group {

    private final int N = 5;
    private final List<Ellipse> petals = new ArrayList<>(2 * N + 1);

    public Flower() {
        Color color = Color.color(1, random() * 0.4 + 0.6, 1);
        final int petalsNum = 2 * N;
        for (int i = 0; i < petalsNum; i++) {
            Ellipse petal = new Ellipse(2, 5);

            if (i % 2 == 0) {
                petal.setFill(color);
            } else {
                petal.setFill(color.saturate());
            }

            petal.getTransforms().add(new Translate(0, 5));
            petal.setRotate(360 / petalsNum * i);
            getChildren().add(petal);
            petals.add(petal);
        }
        Ellipse center = new Ellipse(2, 2);
        center.setFill(Color.PINK);
        getChildren().add(center);
        petals.add(center);

        for (Ellipse petal : petals) {
            petal.setOpacity(0); //trick to hide flowers
        }
    }

    public Flower(final Branch branch) {
        this();
        setTranslateY(branch.length / 2);
    }

    public List<Ellipse> getPetals() {
        return petals;
    }
}
