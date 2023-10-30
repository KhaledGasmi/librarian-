package application.loginpage;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.Observable;
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

public class thirdController implements Initializable {
    @FXML
    Button returnButton,extendButton,borrowBar,returnBar,detailsBar,statisticsBar,member1Button,member2Button,confirm,back,cancel,back1,confirm1,cancel1;
    @FXML
    Label bookLabel,book_x,extensionLabel,periodSett,daysLabel,userlabDialog,passlabDialog,newpasslabDialog,bookName,author,stock,daysBook,daysLeft,memberName,bookName1,memberName1,bookName2,bookName21,memberName11,memberName2,bookName11,numDays;
    @FXML
    AnchorPane third,left,center,right,confirmextDialog,extdoneDialog,returndoneDialog,confirmreturnDialog;
    @FXML
    TextField bookField,usernameDialog;
    @FXML
    ImageView account,setting,bookImage,logoImage,memberImage,exclamImage;
    @FXML
    DialogPane userDialog,settDialog;
    @FXML
    PasswordField passDialog,newpassDialog;

    private static final double INITIAL_SCALE_FACTOR = 1.0;
    private static final double ENLARGED_SCALE_FACTOR = 1.2;
    boolean focus=false,focus1=false;
    private double diff;
    private Parent root1,root2, root3;
    private Stage stage1,stage2,stage3;
    private Scene scene1,scene2,scene3;


    Image userBlue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/blueuser.png").toURI().toString());
    Image bookBlue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/book=Colored.png").toURI().toString());
    Image logo = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Logo.png").toURI().toString());
    Image settNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/state=Default3.png").toURI().toString());
    Image settWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Vector.png").toURI().toString());
    Image accountNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Default2.png").toURI().toString());
    Image accountWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Layer 3.png").toURI().toString());
    Image exclam = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Default.png").toURI().toString());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        confirmreturnDialog.setVisible(false);
        returndoneDialog.setVisible(false);
        confirmextDialog.setVisible(false);
        extdoneDialog.setVisible(false);
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
        returnBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                " -fx-font-size:15px; -fx-text-fill: #002147;");
        detailsBar.setText("Details");
        statisticsBar.setText("Statistics");
        logoImage.setImage(logo);
        setting.setImage(settNeut);
        account.setImage(accountNeut);
        bookImage.setImage(bookBlue);
        memberImage.setImage(userBlue);
        exclamImage.setImage(exclam);
        left.setVisible(false);
        center.setVisible(false);
        right.setVisible(false);
        bookName.setAlignment(javafx.geometry.Pos.CENTER);
        author.setAlignment(javafx.geometry.Pos.CENTER);
        stock.setAlignment(javafx.geometry.Pos.CENTER);
        member1Button.setAlignment(javafx.geometry.Pos.CENTER);
        member2Button.setAlignment(javafx.geometry.Pos.CENTER);
        daysBook.setAlignment(javafx.geometry.Pos.CENTER);
        daysLeft.setAlignment(javafx.geometry.Pos.CENTER);


        bookField.setOnMouseEntered(event -> {
                    bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                    bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                    bookField.setPromptText("Enter the book ID or name");

                }
        );
        bookField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue){
                bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                bookField.setPromptText("Enter the book ID or name ");


            }
            else if (bookField.getText().isEmpty()){
                bookLabel.setStyle("-fx-translate-y: 0;");
                bookField.setStyle("-fx-border-color: transparent transparent black transparent;");
                bookField.setPromptText(" ");


            }
            else{
                bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                bookField.setPromptText(" ");

            }

        });

        bookField.setOnMouseExited(event -> {

            if (bookField.getText().isEmpty() ){
                if (bookField.isFocused()){
                    bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                    bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                    bookField.setPromptText("Enter the book ID or name ");
                }
                else{
                    bookLabel.setStyle("-fx-translate-y: 0;");
                    bookField.setStyle("-fx-border-color: transparent transparent black transparent;");
                    bookField.setPromptText(" ");

                }
            }
            else if (!bookField.isFocused()){
                bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
                bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
                bookField.setPromptText(" ");


            }

        });
        bookField.setOnMouseClicked(event -> {
            bookLabel.setStyle("-fx-translate-y: -20; -fx-text-fill: #002147; -fx-font-size: 10px;");
            bookField.setStyle("-fx-border-width: 2px; -fx-border-color: transparent transparent #002147 transparent;");
            bookField.setPromptText("Enter the book ID or name ");
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

        bookField.textProperty().addListener((bbservable,oldValue,newValue) -> {

                if (!newValue.isEmpty()){
                    left.setVisible(true);
                    center.setVisible(true);
                    right.setVisible(true);
                    bookName.setText(bookField.getText());
                    if (Integer.valueOf(newValue)==8100) {
                        bookName.setText("The design of everyday things");
                        author.setText("Donald Norman");

                    }
                    author.setText("author");
                    stock.setText("03 book(s) available(s)");
                    member1Button.setText("Zeghdar Seif El Islam");
                    member2Button.setText("Sebaa Hicham");
                    daysBook.setText("Days to book return");
                    daysLeft.setText("day(s)");
                    numDays.setText("03");

                }   else  {
                    left.setVisible(false);
                    center.setVisible(false);
                    right.setVisible(false);

                }

            });
        diff=member1Button.getLayoutY()-member2Button.getLayoutY();
        TranslateTransition translateTransition1 = new TranslateTransition(Duration.millis(500),confirmextDialog);
        TranslateTransition translateTransition2 = new TranslateTransition(Duration.millis(500),extdoneDialog);
        TranslateTransition translateTransition11 = new TranslateTransition(Duration.millis(500),confirmextDialog);
        TranslateTransition translateTransition22 = new TranslateTransition(Duration.millis(500),extdoneDialog);
        TranslateTransition translateTransition3 = new TranslateTransition(Duration.millis(500),confirmreturnDialog);
        TranslateTransition translateTransition4 = new TranslateTransition(Duration.millis(500),returndoneDialog);
        TranslateTransition translateTransition33 = new TranslateTransition(Duration.millis(500),confirmreturnDialog);
        TranslateTransition translateTransition44 = new TranslateTransition(Duration.millis(500),returndoneDialog);
        TranslateTransition diffTransition= new TranslateTransition(Duration.millis(500),member2Button);
        translateTransition1.setByY(430);
        translateTransition2.setByY(-430);
        translateTransition11.setByY(-430);
        translateTransition22.setByY(430);

        translateTransition3.setByY(430);
        translateTransition4.setByY(-430);
        translateTransition33.setByY(-430);
        translateTransition44.setByY(430);

        diffTransition.setByY(diff);


        member1Button.focusedProperty().addListener((observable,oldValue,newValue) ->{
            if (newValue){
                focus=true;
            }
            else{
                focus=false;
            }
            if (focus==true){
                extendButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        confirmextDialog.setVisible(true);
                        memberName.setText("Zeghdar Seif El Islam");
                        bookName1.setText(bookName.getText());
                        translateTransition1.play();
                        extendButton.setDisable(true);
                        returnButton.setDisable(true);


                }});

                returnButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        confirmreturnDialog.setVisible(true);
                        memberName2.setText("Zeghdar Seif El Islam");
                        bookName11.setText(bookName.getText());
                        translateTransition3.play();
                        returnButton.setDisable(true);
                        extendButton.setDisable(true);
                    }});

            }
    });


        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                extendButton.setDisable(false);
                extendButton.setOnAction(null);
                translateTransition11.play();
                returnButton.setDisable(false);
                returnButton.setOnAction(null);
            }
        });
        cancel1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                returnButton.setDisable(false);
                returnButton.setOnAction(null);
                translateTransition33.play();
                extendButton.setDisable(false);
                extendButton.setOnAction(null);
            }
        });
        confirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionevent) {
                extendButton.setOnAction(null);
                extdoneDialog.setVisible(true);
                confirmextDialog.setVisible(false);
                numDays.setText(String.valueOf(Integer.valueOf(numDays.getText())+7));
                bookName2.setText(bookName.getText());
                memberName1.setText("zeghdar Seif El Islam");
                translateTransition11.play();



            }
        });

        confirm1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                returnButton.setOnAction(null);
                returndoneDialog.setVisible(true);
                confirmreturnDialog.setVisible(false);
                center.getChildren().remove(member1Button);
                diffTransition.play();
                bookName21.setText(bookName.getText());
                memberName11.setText("zeghdar Seif El Islam");
                translateTransition33.play();


            }
        });
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                extendButton.setDisable(false);
                returnButton.setDisable(false);
                returnButton.setOnAction(null);
                translateTransition2.play();
                translateTransition2.setOnFinished(event1 -> {
                    extdoneDialog.setVisible(false);
                    translateTransition22.play();
                });

            }
        });

        back1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                returnButton.setDisable(false);
                extendButton.setDisable(false);
                extendButton.setOnAction(null);
                translateTransition4.play();
                translateTransition4.setOnFinished(event1 -> {
                    returndoneDialog.setVisible(false);
                    translateTransition44.play();
                });

            }
        });
        member2Button.focusedProperty().addListener((observable,oldValue,newValue) ->{
            if (newValue){
                focus1=true;
            }
            else{
                focus1=false;
            }
            if (focus1==true){
                extendButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        confirmextDialog.setVisible(true);
                        memberName.setText("Sebaa Hicham");
                        bookName1.setText(bookName.getText());
                        translateTransition1.play();
                        extendButton.setDisable(true);
                        returnButton.setDisable(true);


                }});

                returnButton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        confirmreturnDialog.setVisible(true);
                        memberName2.setText("Sebaa Hicham");
                        bookName11.setText(bookName.getText());
                        translateTransition3.play();
                        returnButton.setDisable(true);
                        extendButton.setDisable(true);
                    }});

            }
    });


        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                extendButton.setDisable(false);
                extendButton.setOnAction(null);
                translateTransition11.play();
                returnButton.setDisable(false);
                returnButton.setOnAction(null);
            }
        });
        cancel1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                returnButton.setDisable(false);
                returnButton.setOnAction(null);
                translateTransition33.play();
                extendButton.setDisable(false);
                extendButton.setOnAction(null);
            }
        });
        confirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionevent) {
                extendButton.setOnAction(null);
                extdoneDialog.setVisible(true);
                confirmextDialog.setVisible(false);
                numDays.setText(String.valueOf(Integer.valueOf(numDays.getText())+7));
                bookName2.setText(bookName.getText());
                memberName1.setText(memberName.getText());
                translateTransition11.play();



            }
        });

        confirm1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                returnButton.setOnAction(null);
                returndoneDialog.setVisible(true);
                confirmreturnDialog.setVisible(false);
                center.getChildren().remove(member2Button);
                bookName21.setText(bookName.getText());
                memberName11.setText(memberName2.getText());
                translateTransition33.play();


            }
        });
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                extendButton.setDisable(false);
                returnButton.setDisable(false);
                returnButton.setOnAction(null);
                translateTransition2.play();
                translateTransition2.setOnFinished(event1 -> {
                    extdoneDialog.setVisible(false);
                    translateTransition22.play();
                });

            }
        });

        back1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                returnButton.setDisable(false);
                extendButton.setDisable(false);
                extendButton.setOnAction(null);
                translateTransition4.play();
                translateTransition4.setOnFinished(event1 -> {
                    returndoneDialog.setVisible(false);
                    translateTransition44.play();
                });

            }
        });
        TranslateTransition lefttr= new TranslateTransition(Duration.millis(1000),left);
        lefttr.setByX(-500);
        TranslateTransition righttr= new TranslateTransition(Duration.millis(1000),right);
        righttr.setByX(500);
        TranslateTransition centertr= new TranslateTransition(Duration.millis(1000),center);
        centertr.setByY(500);
        RotateTransition leftr= new RotateTransition(Duration.millis(1000),left);
        leftr.setByAngle(-60);
        RotateTransition rightr= new RotateTransition(Duration.millis(1000),right);
        rightr.setByAngle(60);

        detailsBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                leftr.play();
                rightr.play();
                centertr.play();
                righttr.play();
                lefttr.play();
                try {
                    root2= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fourth.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage2=(Stage)((Node)event.getSource()).getScene().getWindow();
                lefttr.setOnFinished(actionEvent ->{
                scene2= new Scene(root2);
                scene2.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                stage2.setScene(scene2);
                stage2.show();
                detailsBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                        "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:15px; -fx-text-fill: #002147;");
                returnBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");});
                statisticsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
            }
        });

        borrowBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                try {
                    root1= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("second.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage1=(Stage)((Node)event.getSource()).getScene().getWindow();

                    scene1= new Scene(root1);
                    scene1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                    stage1.setScene(scene1);
                    stage1.show();
                    borrowBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                            "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:15px; -fx-text-fill: #002147;");
                    returnBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:13px; -fx-text-fill: black;");
                    detailsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:13px; -fx-text-fill: black;");
                    statisticsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");

            }
        });
        statisticsBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                try {
                    root3= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fifth.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage3=(Stage)((Node)event.getSource()).getScene().getWindow();

                scene3= new Scene(root3);
                scene3.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                stage3.setScene(scene3);
                stage3.show();
                statisticsBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                        "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:15px; -fx-text-fill: #002147;");
                returnBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                detailsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");
                borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                        " -fx-font-size:13px; -fx-text-fill: black;");

            }
        });







    }
}
