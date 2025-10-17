package com.example.bankingappproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static  Stage mainstage;
    @Override
    public void start(Stage stage) throws IOException {
        mainstage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setTitle("Hello!");
        mainstage.setScene(scene);
        mainstage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}