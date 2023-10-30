package application.loginpage;

import javafx.animation.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class fourthController implements Initializable {
    @FXML
    Button borrowBar,returnBar,detailsBar,statisticsBar,cancelButton,saveButton,cancelButton1,saveButton1;
    @FXML
    Label extensionLabel,periodSett,daysLabel,userlabDialog,passlabDialog,newpasslabDialog,bookDetails,memberDetails,IDLabel,titleLabel,authorLabel,IDLabel1,nameLabel,classLabel,emailLabel;
    @FXML
    AnchorPane fourth,bookdetailsAnchor,memberdetailsAnchor,addBook,addMember;
    @FXML
    TextField usernameDialog,IDField,authorField,titleField,IDField1,nameField,classField,emailField;
    @FXML
    ImageView account,setting,bookImage,logoImage,memberImage,search,plus,delete,write,search1,plus1,delete1,write1,up1,up2;
    @FXML
    DialogPane userDialog,settDialog;
    @FXML
    PasswordField passDialog,newpassDialog;
    @FXML
    HBox member,book;
    @FXML
    private TableColumn<Book,Integer> ID;

    @FXML
    private TableColumn<Book,String> author;
    @FXML
    private TableView<Book> bookTable;
    @FXML
    private TableColumn<Book, String> title;
    @FXML
    private TableColumn<Member,Integer> ID1;
    @FXML
    private TableColumn<Member,String> name;
    @FXML
    private TableColumn<Member,String> classm;
    @FXML
    private TableColumn<Member,String> email;
    @FXML
    private TableView<Member> memberTable;

    private Parent root1,root2, root3;
    private Stage stage1,stage2,stage3;
    private Scene scene1,scene2,scene3;

    ObservableList<Book> list= FXCollections.observableArrayList(
            new Book(8100,"The design of every day things","Donald Norman"),
            new Book(8125,"How to","Michael Beirut")

    );
    ObservableList<Member> list1= FXCollections.observableArrayList(
            new Member(9251,"Yacine Belouz","STR2, GEII","y_belouz@enst.dz"),
            new Member(9522,"Hicham Sebaa","STR2, GEII","h_sebaa@enst.dz")

    );



    private static final double INITIAL_SCALE_FACTOR = 1.0;
    private static final double ENLARGED_SCALE_FACTOR = 1.2;

    Image userBlue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/blueuser.png").toURI().toString());
    Image bookBlue = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/book=Colored.png").toURI().toString());
    Image logo = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Logo.png").toURI().toString());
    Image settNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/state=Default3.png").toURI().toString());
    Image settWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Vector.png").toURI().toString());
    Image accountNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Default2.png").toURI().toString());
    Image accountWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Layer 3.png").toURI().toString());
    Image searchImage = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Variant2.png").toURI().toString());
    Image writeImage = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Variant26.png").toURI().toString());
    Image plusImage = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Variant24.png").toURI().toString());
    Image deleteImage = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Variant25.png").toURI().toString());
    Image upImage = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/down.png").toURI().toString());



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ID.setCellValueFactory(new PropertyValueFactory<Book,Integer>("ID"));
        author.setCellValueFactory(new PropertyValueFactory<Book,String>("author"));
        title.setCellValueFactory(new PropertyValueFactory<Book,String>("title"));
        bookTable.setItems(list);

        ID1.setCellValueFactory(new PropertyValueFactory<Member,Integer>("ID1"));
        name.setCellValueFactory(new PropertyValueFactory<Member,String>("name"));
        classm.setCellValueFactory(new PropertyValueFactory<Member,String>("classm"));
        email.setCellValueFactory(new PropertyValueFactory<Member,String>("email"));
        memberTable.setItems(list1);

        bookDetails.setText("Books details");
        memberDetails.setText("Members Details");
        search.setImage(searchImage);
        delete.setImage(deleteImage);
        plus.setImage(plusImage);
        write1.setImage(writeImage);
        search1.setImage(searchImage);
        delete1.setImage(deleteImage);
        plus1.setImage(plusImage);
        write.setImage(writeImage);
        up1.setImage(upImage);
        up2.setImage(upImage);

        book.setSpacing(7);
        member.setSpacing(3);
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
        detailsBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                " -fx-font-size:15px; -fx-text-fill: #002147;");
        borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                " -fx-font-size:13px; -fx-text-fill: black;");
        detailsBar.setText("Details");
        statisticsBar.setText("Statistics");
        logoImage.setImage(logo);
        setting.setImage(settNeut);
        account.setImage(accountNeut);
        bookImage.setImage(bookBlue);
        memberImage.setImage(userBlue);
        addBook.setVisible(false);
        addMember.setVisible(false);

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

        Timeline timeline1=new Timeline();
        timeline1.setCycleCount(1);
        KeyFrame widthFrame1 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookdetailsAnchor.prefWidthProperty(), 700));
        KeyFrame heightFrame1 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookdetailsAnchor.prefHeightProperty(), 400));
        timeline1.getKeyFrames().addAll(widthFrame1, heightFrame1);

        Timeline timeline2=new Timeline();
        timeline2.setCycleCount(1);
        KeyFrame widthFrame2 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookdetailsAnchor.prefWidthProperty(), 706));
        KeyFrame heightFrame2 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookdetailsAnchor.prefHeightProperty(), 126));
        timeline2.getKeyFrames().addAll(widthFrame2, heightFrame2);

        Timeline timelinebook1=new Timeline();
        timelinebook1.setCycleCount(1);
        KeyFrame widthFrame3 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookTable.prefWidthProperty(), 643));
        KeyFrame heightFrame3 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookTable.prefHeightProperty(), 250));
        timelinebook1.getKeyFrames().addAll(widthFrame3, heightFrame3);

        Timeline timelinebook2=new Timeline();
        timelinebook1.setCycleCount(1);
        KeyFrame widthFrame4 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookTable.prefWidthProperty(), 643));
        KeyFrame heightFrame4 = new KeyFrame(Duration.millis(1000),
                new KeyValue(bookTable.prefHeightProperty(), 40));
        timelinebook2.getKeyFrames().addAll(widthFrame4, heightFrame4);

        FadeTransition bookfadeoutTransitionbook=new FadeTransition(Duration.millis(10),bookTable);
        bookfadeoutTransitionbook.setFromValue(1);
        bookfadeoutTransitionbook.setToValue(0);
        bookfadeoutTransitionbook.play();

        FadeTransition bookfadeinTransitionbook=new FadeTransition(Duration.millis(1000),bookTable);
        bookfadeinTransitionbook.setFromValue(0);
        bookfadeinTransitionbook.setToValue(1);




        TranslateTransition memberDown=new TranslateTransition(Duration.millis(1000),memberdetailsAnchor);
        memberDown.setByY(300);
        TranslateTransition memberUp=new TranslateTransition(Duration.millis(1000),memberdetailsAnchor);
        memberUp.setByY(-300);



        RotateTransition up1Rotate=new RotateTransition(Duration.millis(1000),up1);
        up1Rotate.setByAngle(180);

        TranslateTransition bookTransition1= new TranslateTransition(Duration.millis(1000),book);
        bookTransition1.setByX(-160);
        TranslateTransition bookTransition2= new TranslateTransition(Duration.millis(1000),book);
        bookTransition2.setByX(160);

        FadeTransition bookfadeoutTransition=new FadeTransition(Duration.millis(10),book);
        bookfadeoutTransition.setFromValue(1);
        bookfadeoutTransition.setToValue(0);
        bookfadeoutTransition.play();

        FadeTransition bookfadeinTransition=new FadeTransition(Duration.millis(1000),book);
        bookfadeinTransition.setFromValue(0);
        bookfadeinTransition.setToValue(1);

        TranslateTransition up1Transition1= new TranslateTransition(Duration.millis(1000),up1);
        up1Transition1.setByX(25);
        TranslateTransition up1Transition2= new TranslateTransition(Duration.millis(1000),up1);
        up1Transition2.setByX(-25);

        TranslateTransition bookDetailsTransition1= new TranslateTransition(Duration.millis(1000),bookDetails);
        bookDetailsTransition1.setByX(-50);
        TranslateTransition bookDetailsTransition2= new TranslateTransition(Duration.millis(1000),bookDetails);
        bookDetailsTransition2.setByX(50);

        TranslateTransition memberhUp = new TranslateTransition(Duration.millis(1000),member);
        memberhUp.setByY(-300);
        TranslateTransition memberhDown = new TranslateTransition(Duration.millis(1000),member);
        memberhDown.setByY(300);

        TranslateTransition tablememberUp = new TranslateTransition(Duration.millis(1000),memberTable);
        tablememberUp.setByY(-300);
        TranslateTransition tablememberDown = new TranslateTransition(Duration.millis(1000),memberTable);
        tablememberDown.setByY(300);

        up1.setOnMouseClicked(event ->{
            timeline1.play();
            memberDown.play();
            memberhDown.play();
            tablememberDown.play();
            up1Rotate.play();
            bookfadeinTransition.play();
            bookTransition1.play();
            bookDetailsTransition1.play();
            up1Transition1.play();
            timelinebook1.play();
            bookfadeinTransitionbook.play();
            timeline1.setOnFinished(actionEvent -> {
                up1.setOnMouseClicked(actionEvent1 -> {
                    timeline2.play();
                    memberUp.play();
                    memberhUp.play();
                    tablememberUp.play();
                    up1Rotate.play();
                    bookfadeoutTransition.play();
                    bookTransition2.play();
                    bookDetailsTransition2.play();
                    up1Transition2.play();
                    timelinebook2.play();
                    bookfadeoutTransitionbook.play();
                });
            });

            timeline2.setOnFinished(actionEvent -> {
                up1.setOnMouseClicked(actionEvent2 -> {
                    timeline1.play();
                    memberDown.play();
                    memberhDown.play();
                    tablememberDown.play();
                    up1Rotate.play();
                    bookfadeinTransition.play();
                    bookTransition1.play();
                    bookDetailsTransition1.play();
                    up1Transition1.play();
                    timelinebook1.play();
                    bookfadeinTransitionbook.play();
                });
            });

        });
        TranslateTransition addbookTransition1= new TranslateTransition(Duration.millis(500),addBook);
        addbookTransition1.setByY(430);
        TranslateTransition addbookTransition2= new TranslateTransition(Duration.millis(500),addBook);
        addbookTransition2.setByY(-430);
        plus.setOnMouseClicked(event ->{
            addBook.setVisible(true);
            addbookTransition1.play();
            plus.setDisable(true);
            up1.setDisable(true);

        });
        cancelButton.setOnAction(event ->{
            addbookTransition2.play();
            plus.setDisable(false);
            up1.setDisable(false);
            addbookTransition2.setOnFinished(actionEvent ->{
                addBook.setVisible(false);
            });

        });
        saveButton.setOnAction(event-> {
            if (!IDField.getText().isEmpty() && !titleField.getText().isEmpty() && !authorField.getText().isEmpty()){

            addbookTransition2.play();
            addbookTransition2.setOnFinished(actionEvent ->{
                addBook.setVisible(false);
            });
            plus.setDisable(false);
            up1.setDisable(false);
            Book newBook= new Book(Integer.valueOf(IDField.getText()),titleField.getText(),authorField.getText());
            bookTable.getItems().add(newBook);}
        });


        Timeline timeline3=new Timeline();
        timeline3.setCycleCount(1);
        KeyFrame widthFrame5 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberdetailsAnchor.prefWidthProperty(), 700));
        KeyFrame heightFrame5 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberdetailsAnchor.prefHeightProperty(), 400));
        timeline3.getKeyFrames().addAll(widthFrame5, heightFrame5);

        Timeline timeline4=new Timeline();
        timeline4.setCycleCount(1);
        KeyFrame widthFrame6 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberdetailsAnchor.prefWidthProperty(), 706));
        KeyFrame heightFrame6 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberdetailsAnchor.prefHeightProperty(), 126));
        timeline4.getKeyFrames().addAll(widthFrame6, heightFrame6);

        Timeline timelinemember1=new Timeline();
        timelinemember1.setCycleCount(1);
        KeyFrame widthFrame7 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberTable.prefWidthProperty(), 643));
        KeyFrame heightFrame7 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberTable.prefHeightProperty(), 250));
        timelinemember1.getKeyFrames().addAll(widthFrame7, heightFrame7);

        Timeline timelinemember2=new Timeline();
        timelinemember2.setCycleCount(1);
        KeyFrame widthFrame8 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberTable.prefWidthProperty(), 643));
        KeyFrame heightFrame8 = new KeyFrame(Duration.millis(1000),
                new KeyValue(memberTable.prefHeightProperty(), 40));
        timelinemember2.getKeyFrames().addAll(widthFrame8, heightFrame8);

        FadeTransition memberfadeoutTransitionmember=new FadeTransition(Duration.millis(10),memberTable);
        memberfadeoutTransitionmember.setFromValue(1);
        memberfadeoutTransitionmember.setToValue(0);
        memberfadeoutTransitionmember.play();

        FadeTransition memberfadeinTransitionmember=new FadeTransition(Duration.millis(1000),memberTable);
        memberfadeinTransitionmember.setFromValue(0);
        memberfadeinTransitionmember.setToValue(1);




        TranslateTransition bookDown=new TranslateTransition(Duration.millis(1000),bookdetailsAnchor);
        bookDown.setByY(350);
        TranslateTransition bookUp=new TranslateTransition(Duration.millis(1000),bookdetailsAnchor);
        bookUp.setByY(-350);



        RotateTransition up2Rotate=new RotateTransition(Duration.millis(1000),up2);
        up2Rotate.setByAngle(180);

        TranslateTransition memberTransition1= new TranslateTransition(Duration.millis(1000),member);
        memberTransition1.setByX(-160);
        TranslateTransition memberTransition2= new TranslateTransition(Duration.millis(1000),member);
        memberTransition2.setByX(160);

        FadeTransition memberfadeoutTransition=new FadeTransition(Duration.millis(10),member);
        memberfadeoutTransition.setFromValue(1);
        memberfadeoutTransition.setToValue(0);
        memberfadeoutTransition.play();

        FadeTransition memberfadeinTransition=new FadeTransition(Duration.millis(1000),member);
        memberfadeinTransition.setFromValue(0);
        memberfadeinTransition.setToValue(1);

        TranslateTransition up2Transition1= new TranslateTransition(Duration.millis(1000),up2);
        up2Transition1.setByX(25);
        TranslateTransition up2Transition2= new TranslateTransition(Duration.millis(1000),up2);
        up2Transition2.setByX(-25);

        TranslateTransition memberDetailsTransition1= new TranslateTransition(Duration.millis(1000),memberDetails);
        memberDetailsTransition1.setByX(-50);
        TranslateTransition memberDetailsTransition2= new TranslateTransition(Duration.millis(1000),memberDetails);
        memberDetailsTransition2.setByX(50);

        TranslateTransition memberdetailUp = new TranslateTransition(Duration.millis(1000),memberdetailsAnchor);
        memberdetailUp.setByY(-197);
        TranslateTransition memberdetailDown = new TranslateTransition(Duration.millis(1000),memberdetailsAnchor);
        memberdetailDown.setByY(197);

        TranslateTransition bookhUp = new TranslateTransition(Duration.millis(1000),book);
        bookhUp.setByY(-350);
        TranslateTransition bookhDown = new TranslateTransition(Duration.millis(1000),book);
        bookhDown.setByY(350);

        TranslateTransition tablebookUp = new TranslateTransition(Duration.millis(1000),bookTable);
        tablebookUp.setByY(-350);
        TranslateTransition tablebookDown = new TranslateTransition(Duration.millis(1000),bookTable);
        tablebookDown.setByY(350);





        up2.setOnMouseClicked(event ->{
            timeline3.play();
            bookUp.play();
            up2Rotate.play();
            memberfadeinTransition.play();
            memberTransition1.play();
            memberDetailsTransition1.play();
            up2Transition1.play();
            timelinemember1.play();
            memberdetailUp.play();
            tablebookUp.play();
            bookhUp.play();
            memberfadeinTransitionmember.play();
            timeline3.setOnFinished(actionEvent -> {
                up2.setOnMouseClicked(actionEvent1 -> {
                    timeline4.play();
                    bookDown.play();
                    up2Rotate.play();
                    memberfadeoutTransition.play();
                    memberTransition2.play();
                    memberDetailsTransition2.play();
                    up2Transition2.play();
                    timelinemember2.play();
                    memberdetailDown.play();
                    tablebookDown.play();
                    bookhDown.play();
                    memberfadeoutTransitionmember.play();
                });
            });

            timeline4.setOnFinished(actionEvent -> {
                up2.setOnMouseClicked(actionEvent2 -> {
                    timeline3.play();
                    bookUp.play();
                    up2Rotate.play();
                    memberfadeinTransition.play();
                    memberTransition1.play();
                    memberDetailsTransition1.play();
                    up2Transition1.play();
                    timelinemember1.play();
                    memberdetailUp.play();
                    tablebookUp.play();
                    bookhUp.play();
                    memberfadeinTransitionmember.play();
                });
            });

        });
        TranslateTransition addmemberTransition1= new TranslateTransition(Duration.millis(500),addMember);
        addmemberTransition1.setByY(400);
        TranslateTransition addmemberTransition2= new TranslateTransition(Duration.millis(500),addMember);
        addmemberTransition2.setByY(-400);
        plus1.setOnMouseClicked(event ->{
            addMember.setVisible(true);
            addmemberTransition1.play();
            plus1.setDisable(true);
            up2.setDisable(true);

        });
        cancelButton1.setOnAction(event ->{
            addmemberTransition2.play();
            plus1.setDisable(false);
            up2.setDisable(false);
            addmemberTransition2.setOnFinished(actionEvent -> {
                addMember.setVisible(false);
            });

        });
        saveButton1.setOnAction(event-> {
            if (!IDField1.getText().isEmpty() && !nameField.getText().isEmpty() && !classField.getText().isEmpty() && !emailField.getText().isEmpty()){

                addmemberTransition2.play();
                addmemberTransition2.setOnFinished(actionEvent -> {
                    addMember.setVisible(false);
                });
                plus1.setDisable(false);
                up2.setDisable(false);
                Member newMember= new Member(Integer.valueOf(IDField1.getText()),nameField.getText(),classField.getText(),emailField.getText());
                memberTable.getItems().add(newMember);}
        });

        returnBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                    root2= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("third.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage2=(Stage)((Node)event.getSource()).getScene().getWindow();

                    scene2= new Scene(root2);
                    scene2.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                    stage2.setScene(scene2);
                    stage2.show();
                    returnBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                            "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:15px; -fx-text-fill: #002147;");
                    detailsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:13px; -fx-text-fill: black;");
                    borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:13px; -fx-text-fill: black;");
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
