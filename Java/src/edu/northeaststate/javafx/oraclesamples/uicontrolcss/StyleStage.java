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
package edu.northeaststate.javafx.oraclesamples.uicontrolcss;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * @author Alexander Kouznetsov
 */
public class StyleStage {

    private final StylePanel stylePanel;
    private final Stage stage;
    private Stage demoStage;

    public StyleStage(Stage stage) {
        this.stage = stage;
        stylePanel = new StylePanel();

        Scene scene = new Scene(stylePanel);

        stage.setScene(scene);
        stage.setTitle("Choose style");

        stage.setOnCloseRequest((WindowEvent t) -> {
            demoStage.close();
        });
    }

    public void add(String name, String styleSheetName) {
        stylePanel.add(name, styleSheetName);
    }

    public void setSceneCreator(final SceneCreator sceneCreator) {
        if (demoStage == null) {
            demoStage = new Stage();
            demoStage.setTitle("Demo");
            demoStage.setX(stage.getX());
            demoStage.setY(stage.getY() + stage.getHeight());
        }
        demoStage.setScene(sceneCreator.createScene());
        demoStage.show();
        stylePanel.selected.addListener((ObservableValue<? extends String> ov,
                                         String t, String t1) -> {
            demoStage.setScene(sceneCreator.createScene());

            if (t1 != null) {
                demoStage.getScene().getStylesheets().setAll(
                        UIControlCSS.class.getResource(t1).toString());
            }
        });
    }

    public interface SceneCreator {
        Scene createScene();
    }
}

class StylePanel extends HBox {

    public StringProperty selected = new SimpleStringProperty();

    ToggleGroup stylesheetToggleGroup = new ToggleGroup();

    public StylePanel() {
        super(5);

        StyleButton defaultStylesheetButton = new StyleButton("Default", null);
        defaultStylesheetButton.setSelected(true);
        defaultStylesheetButton.setToggleGroup(stylesheetToggleGroup);

        setPadding(new Insets(0, 0, 30, 0));
        setAlignment(Pos.BOTTOM_LEFT);
        getChildren().addAll(defaultStylesheetButton);
    }

    public void add(String name, String styleSheetName) {
        StyleButton styleButton = new StyleButton(name, styleSheetName);
        styleButton.setToggleGroup(stylesheetToggleGroup);
        getChildren().addAll(styleButton);
    }

    class StyleButton extends ToggleButton {

        public StyleButton(String text, final String styleSheetName) {
            super(text);
            selectedProperty().addListener((Observable ov) -> {
                selected.set(styleSheetName);
            });
        }
    }
}
