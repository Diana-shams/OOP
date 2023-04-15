package com.example.javafx_assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage PrimaryStage)  {
        Pane pane=new Pane();
        Circle circle=new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerXProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        Scene scene=new Scene(pane,200,200);
        PrimaryStage.setTitle("show circle centred");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}