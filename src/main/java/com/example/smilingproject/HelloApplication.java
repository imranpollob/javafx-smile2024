package com.example.smilingproject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle face = new Circle(125, 125, 80);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.RED);

        Circle rightEye = new Circle(86, 100, 10);
        rightEye.setFill(Color.YELLOW);
        rightEye.setStroke(Color.BLUE);

        Circle leftEye = new Circle(162, 100, 10);
        leftEye.setFill(Color.YELLOW);
        leftEye.setStroke(Color.BLUE);

        Arc mouth = new Arc(125, 150, 45, 35, 0, -180);
        mouth.setFill(Color.YELLOW);
        mouth.setStroke(Color.BLUE);
        mouth.setType(ArcType.OPEN);

        Button smileButton = new Button("Smile");
        Button frownButton = new Button("Frown");
        Button straightButton = new Button("Straight");

        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);

        buttonBox.getChildren().addAll(smileButton, frownButton, straightButton);

        Group group = new Group(face, rightEye, leftEye, mouth);

        VBox root = new VBox(20);

        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(group, buttonBox);

        // First way
        Smile smileObject = new Smile(mouth);
        smileButton.setOnAction(smileObject);
        // Other way to do the same thing
//        smileButton.setOnAction(e -> {
//            mouth.setLength(-180);
//            mouth.setRadiusY(35);
//        });

        frownButton.setOnAction(e -> {
            mouth.setLength(180);
            mouth.setRadiusY(35);
        });

        straightButton.setOnAction(e -> {
           mouth.setRadiusY(0);
        });


        Scene scene = new Scene(root, 250, 250);
        stage.setTitle("Smiling Project");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}