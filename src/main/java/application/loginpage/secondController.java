package application.loginpage;


import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class secondController implements Initializable {
    @FXML
    TextField bookField, memberField, usernameDialog;
    @FXML
    ImageView logoImage, bookImage, memberImage, setting, account;
    @FXML
    Button borrowBar, returnBar, detailsBar, statisticsBar, borrowButton, confirm, cancel,back;
    @FXML
    Label bookLabel, memberLabel, available, author, memberName, bookName, contact, member_x,book_x,periodSett,userlabDialog, passlabDialog, newpasslabDialog, extensionLabel,daysLabel, bookName1, memberName1,confirmLab, wantto, tomember, borrowofthe,tothe,success,borrowdone,bookName11,memberName11 ;
    @FXML
    AnchorPane second,confirmDialog,confirmDialog1;
    @FXML
    DialogPane settDialog, userDialog;
    @FXML
    PasswordField passDialog, newpassDialog;

    private static final double INITIAL_SCALE_FACTOR = 1.0;
    private static final double ENLARGED_SCALE_FACTOR = 1.2;
  /**  private Mvc mvc;
    private String password,userName;**/
    private Stage stage,stage1,stage2;
    private Scene scene,scene1,scene2;
    private Parent root,root1,root2;

    Image userWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/whiteuser.png").toURI().toString());
    Image userBlue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/blueuser.png").toURI().toString());
    Image userRed = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/reduser.png").toURI().toString());
    Image bookWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/book=Neutral.png").toURI().toString());
    Image bookBlue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/book=Colored.png").toURI().toString());
    Image bookRed = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/book=Wrong.png").toURI().toString());
    Image logo = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Logo.png").toURI().toString());
    Image settNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/state=Default3.png").toURI().toString());
    Image settWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Vector.png").toURI().toString());
    Image accountNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Default2.png").toURI().toString());
    Image accountWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Layer 3.png").toURI().toString());





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //polidexa
        confirmDialog1.setVisible(false);
        confirmDialog.setVisible(false);
        bookName.setStyle("-fx-text-fill:black;");
        author.setStyle("-fx-text-fill:black;");
        memberName.setStyle("-fx-text-fill:black;");
        contact.setStyle("-fx-text-fill:#002147;");
        available.setStyle("-fx-text-fill:#002147;");
        daysLabel.setStyle("-fx-text-fill:#002147;");
        settDialog.setVisible(false);
        periodSett.setVisible(false);
        daysLabel.setVisible(false);
        extensionLabel.setVisible(false);
        userDialog.setVisible(false);
        usernameDialog.setVisible(false);
        passDialog.setVisible(false);
        newpassDialog.setVisible(false);
        userlabDialog.setVisible(false);
        passlabDialog.setVisible(false);
        newpasslabDialog.setVisible(false);
        returnBar.setText("Extension / Return");
        borrowBar.setText("Borrow");
        borrowBar.setStyle("-fx-border-width: 0 0 2px 0;" +
        "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
        " -fx-font-size:15px; -fx-text-fill: #002147;");
        detailsBar.setText("Details");
        statisticsBar.setText("Statistics");
        logoImage.setImage(logo);
        memberImage.setImage(userWhite);
        account.setImage(accountNeut);
        setting.setImage(settNeut);
        bookImage.setImage(bookWhite);

        bookField.setOnMouseEntered(event -> {
                    bookImage.setImage(bookBlue);
                    bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                    bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                    bookField.setPromptText("Enter the book ID or name");

                }
        );
        bookField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue){
                bookImage.setImage(bookBlue);
                bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                bookField.setPromptText("Enter the book ID or name ");


            }
            else if (bookField.getText().isEmpty()){
                bookImage.setImage(bookWhite);
                bookLabel.setStyle("-fx-translate-y: 0;");
                bookField.setStyle("-fx-border-color: transparent transparent black transparent;");
                bookField.setPromptText(" ");
                bookName.setText("Book Name");

            }
            else{
                bookImage.setImage(bookBlue);
                bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                bookField.setPromptText(" ");

            }

        });

        bookField.setOnMouseExited(event -> {

            if (bookField.getText().isEmpty() ){
                bookName.setText("Book Name");
                if (bookField.isFocused()){
                    bookImage.setImage(bookBlue);
                    bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                    bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                    bookField.setPromptText("Enter the book ID or name ");
                }
                else{
                    bookImage.setImage(bookWhite);
                    bookLabel.setStyle("-fx-translate-y: 0;");
                    bookField.setStyle("-fx-border-color: transparent transparent black transparent;");
                    bookField.setPromptText(" ");

                }
            }
            else if (!bookField.isFocused()){
                bookImage.setImage(bookBlue);
                bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                bookField.setPromptText(" ");


            }

        });
        bookField.setOnMouseClicked(event -> {
            bookImage.setImage(bookBlue);
            bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
            bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
            bookField.setPromptText("Enter the book ID or name ");
        });
        memberField.setOnMouseEntered(event -> {
            memberImage.setImage(userBlue);
            memberLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
            memberField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
            memberField.setPromptText("Enter the member ID ");
                }
        );
        memberField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue){
                memberImage.setImage(userBlue);
                memberLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                memberField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                memberField.setPromptText("Enter the member ID ");

            }
            else if (memberField.getText().isEmpty()){
                memberImage.setImage(userWhite);
                memberLabel.setStyle("-fx-translate-y: 0;");
                memberField.setStyle("-fx-border-color: transparent transparent black transparent;");
                memberField.setPromptText(" ");
                memberName.setText("Member Name");
            }
            else{
                memberImage.setImage(userBlue);
                memberLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                memberField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                memberField.setPromptText(" ");

            }

        });

        memberField.setOnMouseExited(event -> {

            if (memberField.getText().isEmpty() ){
                memberName.setText("Member Name");

                if (memberField.isFocused()){
                    memberImage.setImage(userBlue);
                    memberLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                    memberField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                    memberField.setPromptText("Enter the member ID ");
                }
                else{
                    memberImage.setImage(userWhite);
                    memberLabel.setStyle("-fx-translate-y: 0;");
                    memberField.setStyle("-fx-border-color: transparent transparent black transparent;");
                    memberField.setPromptText(" ");

                }
            }
            else if (!memberField.isFocused()){
                memberImage.setImage(userBlue);
                memberLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                memberField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                memberField.setPromptText(" ");

            }

        });


        memberField.setOnMouseClicked(event -> {
            memberImage.setImage(userBlue);
            memberLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
            memberField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
            memberField.setPromptText("Enter the member ID");


        });
        ChangeListener<String> textChangeListener = new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.isEmpty()){
                    book_x.setText("x");
                    book_x.setStyle("-fx-text-fill:#002147;");

                }
                else {
                    book_x.setText(" ");
                }
            }
        };
        bookField.textProperty().addListener(textChangeListener);
        ChangeListener<String> textChangeListener2 = new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.isEmpty()){
                    member_x.setText("x");
                    member_x.setStyle("-fx-text-fill:#002147;");

                }
                else {
                    member_x.setText(" ");
                }
            }
        };
        memberField.textProperty().addListener(textChangeListener2);
        member_x.setOnMouseClicked(event ->{
            memberField.setText("");
        });
        book_x.setOnMouseClicked(event ->{
            bookField.setText("");
        });
        Scale scaleTransform1 = new Scale(INITIAL_SCALE_FACTOR, INITIAL_SCALE_FACTOR);
        Scale scaleTransform2 = new Scale(INITIAL_SCALE_FACTOR, INITIAL_SCALE_FACTOR);

        setting.getTransforms().add(scaleTransform1);
        account.getTransforms().add(scaleTransform2);
        setting.setOnMouseClicked(event ->{
            if (scaleTransform1.getX() == INITIAL_SCALE_FACTOR) {
                scaleTransform1.setX(ENLARGED_SCALE_FACTOR);
                scaleTransform1.setY(ENLARGED_SCALE_FACTOR);
                setting.setImage(settWhite);
                settDialog.setVisible(true);
                periodSett.setVisible(true);
                daysLabel.setVisible(true);
                extensionLabel.setVisible(true);
            } else {
                scaleTransform1.setX(INITIAL_SCALE_FACTOR);
                scaleTransform1.setY(INITIAL_SCALE_FACTOR);
                setting.setImage(settNeut);
                settDialog.setVisible(false);
                periodSett.setVisible(false);
                daysLabel.setVisible(false);
                extensionLabel.setVisible(false);
            }
        } );

        account.setOnMouseClicked(event ->{
            if (scaleTransform2.getX() == INITIAL_SCALE_FACTOR) {
                scaleTransform2.setX(ENLARGED_SCALE_FACTOR);
                scaleTransform2.setY(ENLARGED_SCALE_FACTOR);
                account.setImage(accountWhite);
                userDialog.setVisible(true);
                usernameDialog.setVisible(true);
                passDialog.setVisible(true);
                newpassDialog.setVisible(true);
                userlabDialog.setVisible(true);
                passlabDialog.setVisible(true);
                newpasslabDialog.setVisible(true);
            } else {
                scaleTransform2.setX(INITIAL_SCALE_FACTOR);
                scaleTransform2.setY(INITIAL_SCALE_FACTOR);
                account.setImage(accountNeut);
                userDialog.setVisible(false);
                usernameDialog.setVisible(false);
                passDialog.setVisible(false);
                newpassDialog.setVisible(false);
                userlabDialog.setVisible(false);
                passlabDialog.setVisible(false);
                newpasslabDialog.setVisible(false);

            }

        } );
        passDialog.setText("22222");
        usernameDialog.setText("John_Doe");


        memberField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                showAlert("Error", "Member ID should not be empty!", memberField);
            }
            memberName.setText(newValue);
            try{
                if (Integer.valueOf(newValue) == 9251){
                    memberName.setText("Yacine Belouz");
                    contact.setText("y_belouz@enst.dz");
                }
           }
            catch (NumberFormatException e){
                System.out.println("Error, it's empty!!");
            }
        });
        bookField.textProperty().addListener((observable, oldValue, newValue) -> {

            if (newValue.isEmpty()){
                showAlert("Error", "Book ID/ Name should not be empty!", bookField);
                bookName.setText("Book Name");
            }
            bookName.setText(newValue);
            try{
            if ( Integer.valueOf(newValue) == 8100) {
                bookName.setText("The design of everyday things");
                author.setText("Donald Norman");
                available.setText("Available");

            }}
            catch (NumberFormatException e){
                System.out.println("Error, it's empty!!");
            }

                });

        TranslateTransition translateTransition1 = new TranslateTransition(Duration.millis(500),confirmDialog);
        TranslateTransition translateTransition2 = new TranslateTransition(Duration.millis(500),confirmDialog1);
        TranslateTransition translateTransition11 = new TranslateTransition(Duration.millis(500),confirmDialog);
        TranslateTransition translateTransition22 = new TranslateTransition(Duration.millis(500),confirmDialog1);


        translateTransition1.setByY(430);
        translateTransition2.setByY(-430);
        translateTransition11.setByY(-430);
        translateTransition22.setByY(430);
        borrowButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                    if (!memberField.getText().isEmpty() &&  !bookField.getText().isEmpty()) {
                        confirmDialog.setVisible(true);
                        borrowButton.setDisable(true);
                        bookName1.setText(bookName.getText());
                        memberName1.setText(memberName.getText());
                        translateTransition1.play();

                    }
            }
    });
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                borrowButton.setDisable(false);
                translateTransition11.play();
            }
        });
        confirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                confirmDialog1.setVisible(true);
                confirmDialog.setVisible(false);
                bookName11.setText(bookName.getText());
                memberName11.setText(memberName.getText());
                translateTransition11.play();


            }
        });
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                bookName11.setText(bookName.getText());
                memberName11.setText(memberName.getText());
                translateTransition2.play();
                borrowButton.setDisable(false);
                translateTransition2.setOnFinished(event1 -> {
                    confirmDialog1.setVisible(false);
                    translateTransition22.play();
                });

            }
        });

       returnBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("third.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage=(Stage)((Node)event.getSource()).getScene().getWindow();
                scene= new Scene(root);
                scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                stage.setScene(scene);
                stage.show();
                returnBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                        "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:15px; -fx-text-fill: #002147;");
                borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                statisticsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                detailsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
            }
        });
        detailsBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    root1= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fourth.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage1=(Stage)((Node)event.getSource()).getScene().getWindow();
                scene1= new Scene(root1);
                scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                stage1.setScene(scene1);
                stage1.show();
                detailsBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                        "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:15px; -fx-text-fill: #002147;");
                borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                returnBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                statisticsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
            }
        });
        statisticsBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    root2= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fifth.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage2=(Stage)((Node)event.getSource()).getScene().getWindow();
                scene2= new Scene(root2);
                scene2.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                stage2.setScene(scene2);
                stage2.show();
                statisticsBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                        "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:15px; -fx-text-fill: #002147;");
                borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                returnBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                detailsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
            }
        });
    /**    public void settingUser(Mvc mvc){
        this.mvc=mvc;
    }
 public String assignUser(){
        userName= mvc.getMyUserName();
        usernameDialog.setText(userName);
        return userName;
    }
    public String assignPass(){
        password= mvc.getMyPassword();
        passDialog.setText(password);
        return password;
    }**/
}


    private void showAlert(String title, String message, TextField textField) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.setOnCloseRequest(event -> {
            textField.clear();
            textField.setDisable(false);
        });
        textField.setDisable(true);
        alert.show();

    }

}