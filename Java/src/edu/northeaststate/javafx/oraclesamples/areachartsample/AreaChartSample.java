/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates.
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

package edu.northeaststate.javafx.oraclesamples.areachartsample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class AreaChartSample extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Area Chart Sample");
        final NumberAxis xAxis = new NumberAxis(1, 30, 1);
        final NumberAxis yAxis = new NumberAxis(-5, 27, 5);
        final AreaChart<Number, Number> ac =
                new AreaChart<>(xAxis, yAxis);
        xAxis.setForceZeroInRange(true);

        ac.setTitle("Temperature Monitoring (in Degrees C)");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("March");
        series1.getData().add(new XYChart.Data(0, -2));
        series1.getData().add(new XYChart.Data(3, -4));
        series1.getData().add(new XYChart.Data(6, 0));
        series1.getData().add(new XYChart.Data(9, 5));
        series1.getData().add(new XYChart.Data(12, -4));
        series1.getData().add(new XYChart.Data(15, 6));
        series1.getData().add(new XYChart.Data(18, 8));
        series1.getData().add(new XYChart.Data(21, 14));
        series1.getData().add(new XYChart.Data(24, 4));
        series1.getData().add(new XYChart.Data(27, 6));
        series1.getData().add(new XYChart.Data(30, 6));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("April");
        series2.getData().add(new XYChart.Data(0, 4));
        series2.getData().add(new XYChart.Data(3, 10));
        series2.getData().add(new XYChart.Data(6, 15));
        series2.getData().add(new XYChart.Data(9, 8));
        series2.getData().add(new XYChart.Data(12, 5));
        series2.getData().add(new XYChart.Data(15, 18));
        series2.getData().add(new XYChart.Data(18, 15));
        series2.getData().add(new XYChart.Data(21, 13));
        series2.getData().add(new XYChart.Data(24, 19));
        series2.getData().add(new XYChart.Data(27, 21));
        series2.getData().add(new XYChart.Data(30, 21));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("May");
        series3.getData().add(new XYChart.Data(0, 20));
        series3.getData().add(new XYChart.Data(3, 15));
        series3.getData().add(new XYChart.Data(6, 13));
        series3.getData().add(new XYChart.Data(9, 12));
        series3.getData().add(new XYChart.Data(12, 14));
        series3.getData().add(new XYChart.Data(15, 18));
        series3.getData().add(new XYChart.Data(18, 25));
        series3.getData().add(new XYChart.Data(21, 25));
        series3.getData().add(new XYChart.Data(24, 23));
        series3.getData().add(new XYChart.Data(27, 26));
        series3.getData().add(new XYChart.Data(30, 26));

        Scene scene = new Scene(ac, 800, 600);
        scene.getStylesheets().add(AreaChartSample.class.getResource("Chart.css").toExternalForm());
        ac.setHorizontalZeroLineVisible(true);
        ac.getData().addAll(series1, series2, series3);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

