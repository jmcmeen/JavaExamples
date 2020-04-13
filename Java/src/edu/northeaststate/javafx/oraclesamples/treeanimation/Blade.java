
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

import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.paint.Color;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.transform.Transform;

import static java.lang.Math.*;


public class Blade extends Path {

    public final Color SPRING_COLOR = Color.color(random() * 0.5, random() * 0.5 + 0.5, 0.).darker();
    public final Color AUTUMN_COLOR = Color.color(random() * 0.4 + 0.3, random() * 0.1 + 0.4, random() * 0.2);
    private final double x = RandomUtil.getRandom(170); // width of grass ground
    private final double y = RandomUtil.getRandom(20) + 20; // height of grass ground
    private final static double w = 3; // width of blade
    private final double h = (50 * 1.5 - y / 2) * RandomUtil.getRandom(0.3);   // height of blade
    public final SimpleDoubleProperty phase = new SimpleDoubleProperty(); //phase of blade movement

    public Blade() {

        getElements().add(new MoveTo(0, 0));
        final QuadCurveTo curve1;
        final QuadCurveTo curve2;
        getElements().add(curve1 = new QuadCurveTo(-10, h, h / 4, h));
        getElements().add(curve2 = new QuadCurveTo(-10, h, w, 0));

        setFill(AUTUMN_COLOR); //autumn color of blade
        setStroke(null);

        getTransforms().addAll(Transform.translate(x, y));

        curve1.yProperty().bind(new DoubleBinding() {

            {
                super.bind(curve1.xProperty());
            }

            @Override
            protected double computeValue() {

                final double xx0 = curve1.xProperty().get();
                return Math.sqrt(h * h - xx0 * xx0);
            }
        }); //path of top of blade is circle

        //code to bend blade
        curve1.controlYProperty().bind(curve1.yProperty().add(-h / 4));
        curve2.controlYProperty().bind(curve1.yProperty().add(-h / 4));

        curve1.xProperty().bind(new DoubleBinding() {

            final double rand = RandomUtil.getRandom(PI / 4); // to separate blade movement

            {
                super.bind(phase);
            }

            @Override
            protected double computeValue() {
                //calculating shift x for top of blade
                return (h / 4) + ((cos(phase.get() + (x + 400.) * PI / 1600 + rand) + 1) / 2.) * (-3. / 4) * h;
            }
        });
    }
}
