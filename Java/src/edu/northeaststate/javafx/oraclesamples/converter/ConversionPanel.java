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


import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;

import java.text.NumberFormat;
import java.text.ParseException;


public class ConversionPanel extends TitledPane {

    final static int MAX = 10000;

    private ComboBox<Unit> comboBox;
    private Slider slider;
    private TextField textField;
    private DoubleProperty meters;
    private NumberFormat numberFormat;

    private InvalidationListener fromMeters = t -> {
        if (!textField.isFocused()) {
            textField.setText(numberFormat.format(meters.get() / getMultiplier()));
        }
    };

    private InvalidationListener toMeters = t -> {
        if (!textField.isFocused()) {
            return;
        }
        try {
            meters.set(numberFormat.parse(textField.getText()).doubleValue() * getMultiplier());
        } catch (ParseException | Error | RuntimeException ignored) {
        }
    };

    public ConversionPanel(String title, ObservableList<Unit> units, DoubleProperty meters) {
        setText(title);
        setCollapsible(false);

        numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);

        textField = new TextField();
        slider = new Slider(0, MAX, 0);
        comboBox = new ComboBox(units);
        comboBox.setConverter(new StringConverter<Unit>() {

            @Override
            public String toString(Unit t) {
                return t.description;
            }

            @Override
            public Unit fromString(String string) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        VBox vbox = new VBox(textField, slider);
        HBox hbox = new HBox(vbox, comboBox);
        setContent(hbox);
        this.meters = meters;

        comboBox.getSelectionModel().select(0);
        meters.addListener(fromMeters);
        comboBox.valueProperty().addListener(fromMeters);
        textField.textProperty().addListener(toMeters);
        fromMeters.invalidated(null);

        slider.valueProperty().bindBidirectional(meters);
    }

    /**
     * Returns the multiplier (units/meter) for the currently
     * selected unit of measurement.
     *
     * @return
     */
    public double getMultiplier() {
        return comboBox.getValue().multiplier;
    }
}