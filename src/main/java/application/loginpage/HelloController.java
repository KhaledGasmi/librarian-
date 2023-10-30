package application.loginpage;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

public class HelloController {
    @FXML
    BorderPane firstBorderPane;
    @FXML
    AnchorPane leftAnchor;
    @FXML
    AnchorPane rightAnchor;
    @FXML
    TextField nameField;
    @FXML
    PasswordField password;
    @FXML
    Button loginButton;
    @FXML
    Label userlabel, passwordLabel, err_user, err_pass;
    @FXML
    ImageView logo, logoView, logoView2, lock;

    private Scene scene;
    private Stage stage;
    private  Parent root;
   /** private Mvc mvc;
    private String pass,user;**/

    Image logo2 = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Logo-login(2).png").toURI().toString());
    Image userwhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/whiteuser.png").toURI().toString());
    Image userred = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/reduser.png").toURI().toString());
    Image userblue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/blueuser.png").toURI().toString());
    Image keywhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/whitekey.png").toURI().toString());
    Image keyred = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/redkey.png").toURI().toString());
    Image keyblue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/bluekey.png").toURI().toString());
    Image lockwhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/whitelock.png").toURI().toString());
    Image lockred = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/redlock.png").toURI().toString());



    public void initialize() {
        logo.setImage(logo2);
        logoView.setImage(userwhite);
        logoView2.setImage(keywhite);
        lock.setImage(lockwhite);

        nameField.setOnMouseEntered(event -> {
                    logoView.setImage(userblue);
                    userlabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                    nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");

                }
        );
        nameField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue){
                logoView.setImage(userblue);
                userlabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");


            }
            else if (nameField.getText().isEmpty()){
                logoView.setImage(userwhite);
                userlabel.setStyle("-fx-translate-y: 0;");
                nameField.setStyle("-fx-border-color: transparent transparent black transparent;");
            }
            else{
                logoView.setImage(userblue);
                userlabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
            }

        });

        nameField.setOnMouseExited(event -> {

            if (nameField.getText().isEmpty() ){
                if (nameField.isFocused()){
                    logoView.setImage(userblue);
                    userlabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                    nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                }
                else{
                    logoView.setImage(userwhite);
                    userlabel.setStyle("-fx-translate-y: 0;");
                    nameField.setStyle("-fx-border-color: transparent transparent black transparent;");

                }
            }
            else if (!nameField.isFocused()){
                logoView.setImage(userblue);
                userlabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");

            }

        });
        nameField.setOnMouseClicked(event -> {
            logoView.setImage(userblue);
            userlabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
            nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
        });
        password.setOnMouseEntered(event -> {
            logoView2.setImage(keyblue);
            passwordLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
            password.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");

                }
        );
        password.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue){
                logoView2.setImage(keyblue);
                passwordLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                password.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");

            }
            else if (password.getText().isEmpty()){
                logoView2.setImage(keywhite);
                passwordLabel.setStyle("-fx-translate-y: 0;");
                password.setStyle("-fx-border-color: transparent transparent black transparent;");
            }
            else{
                logoView2.setImage(keyblue);
                passwordLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                password.setStyle("-fx-border-width: 2px;-fx-border-color: transparent transparent #002147 transparent;");
            }

        });

        password.setOnMouseExited(event -> {

                if (password.getText().isEmpty() ){
                    if (password.isFocused()){
                        logoView2.setImage(keyblue);
                        passwordLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                        password.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                    }
                    else{
                        logoView2.setImage(keywhite);
                        passwordLabel.setStyle("-fx-translate-y: 0;");
                        password.setStyle("-fx-border-color: transparent transparent black transparent;");

                    }
                }
                else if (!password.isFocused()){
                    logoView2.setImage(keyblue);
                    passwordLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
                    password.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                }

        });


        password.setOnMouseClicked(event -> {
            logoView2.setImage(keyblue);
            passwordLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147;");
            password.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");


        });
        TranslateTransition translateTransitionr = new TranslateTransition(Duration.seconds(1), rightAnchor);
        TranslateTransition translateTransitionl = new TranslateTransition(Duration.seconds(1),leftAnchor);
        translateTransitionr.setToX(250);
        translateTransitionl.setToX(-250);
        FadeTransition fadeTransitionr = new FadeTransition(Duration.seconds(1), rightAnchor);
        FadeTransition fadeTransitionl= new FadeTransition(Duration.seconds(1), leftAnchor);
        fadeTransitionr.setToValue(0.1);
        fadeTransitionl.setToValue(0.1);

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                /**nameField.textProperty().addListener((observable, oldValue, newValue) ->{
                    if (!newValue.isEmpty()){
                        user=user+nameField.getText();}
                });
                password.textProperty().addListener((observable, oldValue, newValue) ->{
                    if (!newValue.isEmpty()){
                        pass=pass+password.getText();}
                });**/

                if (nameField.getText().isEmpty()) {
                    err_user.setText("add your user_name!");
                    err_user.setStyle("-fx-text-fill:red; ");
                    logoView.setImage(userred);
                    lock.setImage(lockred);
                    userlabel.setStyle("-fx-text-fill:red; -fx-translate-y: -20;");
                    nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent red transparent;");
                } else if (password.getText().isEmpty()) {
                    err_pass.setText("add your password!");
                    err_pass.setStyle("-fx-text-fill:red; ");
                    logoView2.setImage(keyred);
                    lock.setImage(lockred);
                    passwordLabel.setStyle("-fx-text-fill:red; -fx-translate-y: -20;");
                    password.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent red transparent;");

                } else if (password.getText().length()<5) {
                    err_pass.setText("Password must be longer than 4 letters!");
                    err_pass.setStyle("-fx-text-fill:red;");
                    logoView2.setImage(keyred);
                    lock.setImage(lockred);
                    passwordLabel.setStyle("-fx-text-fill:red; -fx-translate-y: -20;");
                    password.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent red transparent;");

                } else if (nameField.getText().length()<4) {
                    err_user.setText("user_name must be longer than 3 letters!");
                    err_user.setStyle("-fx-text-fill:red;");
                    logoView.setImage(userred);
                    lock.setImage(lockred);
                    userlabel.setStyle("-fx-text-fill:red; -fx-translate-y: -20;");
                    nameField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent red transparent;");
                }
                else{


                    translateTransitionr.play();
                    translateTransitionl.play();
                    fadeTransitionr.play();
                    fadeTransitionl.play();
                    try {
                        root = FXMLLoader.load(getClass().getResource("second.fxml"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

                    fadeTransitionl.setOnFinished(event -> {
                        scene = new Scene(root);
                        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                        stage.setScene(scene);
                        stage.show();

                    });



                }
            }
            });

        }
        /**public void settingUser(Mvc mvc){
            this.mvc=mvc;

        }

        public void saveUser(String a, String b){
            mvc.setMyUserName(a);
            mvc.setMyPassword(b);
    } **/

}
