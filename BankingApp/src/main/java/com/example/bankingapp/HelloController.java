package com.example.bankingapp;

import com.example.bankingapp.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.bankingapp.HelloApplication.mainstage;


public class HelloController {

    @FXML
    private Button loginButton;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Label errorChecking;
    @FXML
    private Label welcomeName;



    public void buttonClicked() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegistrationPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }
    public void loginAction() throws IOException {
        String user = "Henry";
        String pasword= "1234";
        if(username.getText().equals(user) && password.getText().equals(pasword)) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DashBaord.fxml"));
            //welcomeName.setText("Welcome "+ username.getText());
            Scene scene = new Scene(fxmlLoader.load());
            mainstage.setScene(scene);
            mainstage.show();
        }
        else{
            errorChecking.setText("Incorrect Crediatials");
            password.clear();
            username.clear();
        }
    }


    public void logOut() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }


    public void toDashBoard() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AccountInformation.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }

    public void backToDashBoard() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DashBaord.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }

    public void toSavings() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Savings.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }
    public void toDash() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DashBaord.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }

    public void toInvestmentAccount() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Investment.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }

    public void backToDashIn() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DashBaord.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }
    public void toCheckAccount() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CheckAccount.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }
    /*check account BAACK BUTTON*/
    public void toDashBoardc() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DashBaord.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainstage.setScene(scene);
        mainstage.show();
    }




}






