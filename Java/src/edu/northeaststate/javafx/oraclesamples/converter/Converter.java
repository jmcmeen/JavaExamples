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
 *  - Neither the name of Oracle Corporation nor the names of its
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

package edu.northeaststate.javafx.oraclesamples.converter;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Converter extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private final ObservableList<Unit> metricDistances;
    private final ObservableList<Unit> usaDistances;
    private final DoubleProperty meters = new SimpleDoubleProperty(1);


    public Converter() {
        //Create Unit objects for metric distances, and then
        //instantiate a ConversionPanel with these Units.
        metricDistances = FXCollections.observableArrayList(
                new Unit("Centimeters", 0.01),
                new Unit("Meters", 1.0),
                new Unit("Kilometers", 1000.0));

        //Create Unit objects for U.S. distances, and then
        //instantiate a ConversionPanel with these Units.
        usaDistances = FXCollections.observableArrayList(
                new Unit("Inches", 0.0254),
                new Unit("Feet", 0.305),
                new Unit("Yards", 0.914),
                new Unit("Miles", 1613.0));
    }

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(
                new ConversionPanel(
                        "Metric System", metricDistances, meters),
                new ConversionPanel(
                        "U.S. System", usaDistances, meters));
        Scene scene = new Scene(vbox);

        stage.setTitle("Converter");
        stage.setScene(scene);
        stage.show();
    }
}
