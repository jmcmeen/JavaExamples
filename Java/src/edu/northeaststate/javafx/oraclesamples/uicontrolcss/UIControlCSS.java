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


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * @author Alexander Kouznetsov
 */
public class UIControlCSS extends Application implements StyleStage.SceneCreator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        StyleStage styleStage = new StyleStage(stage);
        styleStage.add("controlStyle1", "controlStyle1.css");
        styleStage.add("controlStyle2", "controlStyle2.css");
        stage.show();
        styleStage.setSceneCreator(this);
    }

    @Override
    public Scene createScene() {

        ToggleGroup toggleGroup = new ToggleGroup();

        RadioButton radioButton1 = new RadioButton("High");
        radioButton1.setToggleGroup(toggleGroup);
        radioButton1.setSelected(true);

        RadioButton radioButton2 = new RadioButton("Medium");
        radioButton2.setToggleGroup(toggleGroup);

        RadioButton radioButton3 = new RadioButton("Low");
        radioButton3.setToggleGroup(toggleGroup);

        VBox vBox1 = new VBox(2);
        vBox1.getChildren().addAll(radioButton1, radioButton2, radioButton3);

        TextField textField = new TextField();
        textField.setPrefColumnCount(10);
        textField.setPromptText("Your name");

        PasswordField passwordField = new PasswordField();
        passwordField.setPrefColumnCount(10);
        passwordField.setPromptText("Your password");

        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(textField, passwordField);

        ChoiceBox<String> choiceBox = new ChoiceBox<>(
                FXCollections.observableArrayList("English", "Русский",
                        "Fran\u00E7ais"));
        choiceBox.setTooltip(new Tooltip("Your language"));
        choiceBox.getSelectionModel().select(0);

        HBox hBox1 = new HBox(5);
        hBox1.setAlignment(Pos.BOTTOM_LEFT);
        hBox1.getChildren().addAll(vBox1, vBox2, choiceBox);

        final Label label1 = new Label("Not Available");
        label1.getStyleClass().add("borders");

        Button button1 = new Button("Accept");
        button1.getStyleClass().add("button1");
        button1.setOnAction((ActionEvent t) -> {
            label1.setText("Accepted");
        });

        Button button2 = new Button("Decline");
        button2.getStyleClass().add("button2");
        button2.setOnAction((ActionEvent t) -> {
            label1.setText("Declined");
        });

        HBox hBox2 = new HBox(10);
        hBox2.setAlignment(Pos.CENTER_LEFT);
        hBox2.getChildren().addAll(button1, button2, label1);

        CheckBox checkBox1 = new CheckBox("Normal");

        Separator separator = new Separator(Orientation.VERTICAL);
        separator.setPrefSize(1, 15);

        CheckBox checkBox2 = new CheckBox("Checked");
        checkBox2.setSelected(true);

        CheckBox checkBox3 = new CheckBox("Undefined");
        checkBox3.setIndeterminate(true);
        checkBox3.setAllowIndeterminate(true);

        HBox hBox3 = new HBox(12);
        hBox3.getChildren().addAll(checkBox1, separator, checkBox2, checkBox3);

        Label label2 = new Label("Progress:");
        label2.getStyleClass().add("borders");

        Slider slider = new Slider();

        ProgressIndicator progressIndicator = new ProgressIndicator(0);
        progressIndicator.progressProperty().bind(Bindings.divide(
                slider.valueProperty(), slider.maxProperty()));

        HBox hBox4 = new HBox(10);
        hBox4.getChildren().addAll(label2, slider, progressIndicator);

        final VBox vBox = new VBox(20);
        vBox.setPadding(new Insets(30, 10, 30, 10));
        vBox.setAlignment(Pos.TOP_LEFT);
        vBox.getChildren().setAll(hBox1, hBox2, hBox3, hBox4);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vBox);

        return new Scene(scrollPane, 500, 350);
    }
}

