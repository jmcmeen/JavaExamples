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

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    private static final String SOURCE = Main.class.getResource("Ronkorb_etenraku_ryuteki.wav").toExternalForm();
    private static final int SCENE_WIDTH = 1000;
    private static final int SCENE_HEIGHT = 800;
    private static final int NUMBER_OF_BRANCH_GENERATIONS = 8;
    private static final int NUM_BLADES = 200;
    private Group rootContent;
    private Group grassContent;
    private Group treeContent;

    @Override
    public void start(final Stage stage) {
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.sizeToScene();
        stage.setScene(new AppScene());

        //close application
        final Text close = new Text("Click to close");
        close.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        close.setStyle("-fx-background-color:transparent;-fx-text-fill:gray;");
        close.setOpacity(0);
        close.setOnMouseClicked(e -> {
            Platform.exit();
            System.exit(0);
        });
        StackPane stackPane = new StackPane(close);
        stackPane.setTranslateY(stage.getScene().getHeight() - 80);
        stackPane.getTransforms().add(new Rotate(180));
        stackPane.translateXProperty().bind(stackPane.widthProperty().divide(2));
        rootContent.getChildren().add(stackPane);

        FadeTransition fadeIn = new FadeTransition(Duration.millis(500), close);
        fadeIn.setToValue(0.5);
        stage.getScene().setOnMouseEntered(e -> fadeIn.playFromStart());
        FadeTransition fadeOut = new FadeTransition(Duration.millis(500), close);
        fadeOut.setToValue(0);
        stage.getScene().setOnMouseExited(e -> fadeOut.play());
        stage.show();

        // close application
        stage.setOnCloseRequest(t -> {
            Platform.exit();
            System.exit(0);
        });

        new Animator(new TreeGenerator(treeContent, NUMBER_OF_BRANCH_GENERATIONS), new GrassGenerator(grassContent, NUM_BLADES)).run();

        //output FPS
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("FPS " + com.sun.javafx.perf.PerformanceTracker.getSceneTracker(stage.getScene()).getInstantFPS());
            }
        }, 0, 1000);

        MediaPlayer sound = new MediaPlayer(new Media(SOURCE));
        sound.setCycleCount(MediaPlayer.INDEFINITE);
        sound.play();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private class AppScene extends Scene {

        public AppScene() {
            super(rootContent = new Group(), SCENE_WIDTH, SCENE_HEIGHT, Color.TRANSPARENT);
            rootContent.setClip(new Ellipse(0, SCENE_HEIGHT / 2, SCENE_WIDTH / 3, SCENE_HEIGHT / 2)); //Scene shape and size

            Rectangle background = new Rectangle(-SCENE_WIDTH / 2, 0, SCENE_WIDTH, SCENE_HEIGHT);
            background.setFill(new LinearGradient(0, 0, 0, SCENE_HEIGHT, false, CycleMethod.NO_CYCLE, new Stop(0, Color.YELLOWGREEN), new Stop(0.3, Color.LIGHTBLUE),
                    new Stop(1., new Color(1, 1, 1, 0)))); //background color
            rootContent.getChildren().add(background);
            rootContent.getChildren().add(treeContent = new Group()); // tree layout
            rootContent.getChildren().add(grassContent = new Group()); // grass layout
            rootContent.getTransforms().addAll(new Translate(SCENE_WIDTH / 2, SCENE_HEIGHT), new Rotate(180));
        }
    }
}
