package application.loginpage;

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
import javafx.scene.layout.HBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class fifthController implements Initializable {


    @FXML
    Button borrowBar,returnBar,detailsBar,statisticsBar;
    @FXML
    Label extensionLabel,periodSett,daysLabel,userlabDialog,passlabDialog,newpasslabDialog,booksIn,booksOut,membersWith,membersWithout;
    @FXML
    AnchorPane fifth;
    @FXML
    TextField usernameDialog;
    @FXML
    ImageView account,setting,logoImage,statImage1,blueImage1,whiteImage1,statImage2,blueImage2,whiteImage2;
    @FXML
    DialogPane userDialog,settDialog;
    @FXML
    PasswordField passDialog,newpassDialog;

    private Parent root1,root2, root3;
    private Stage stage1,stage2,stage3;
    private Scene scene1,scene2,scene3;

    private static final double INITIAL_SCALE_FACTOR = 1.0;
    private static final double ENLARGED_SCALE_FACTOR = 1.2;


    Image logo = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Logo.png").toURI().toString());
    Image settNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/state=Default3.png").toURI().toString());
    Image settWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Vector.png").toURI().toString());
    Image accountNeut = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Property 1=Default2.png").toURI().toString());
    Image accountWhite = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Layer 3.png").toURI().toString());
    Image stat1 = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Pie chart.png").toURI().toString());
    Image stat2 = new Image(new File("/home/yacine/IdeaProjects/loginpage/src/main/java/application/loginpage/Images/Pie chart2.png").toURI().toString());
    public void initialize(URL url, ResourceBundle resourceBundle) {
        statImage1.setImage(stat1);
        statImage2.setImage(stat2);
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
        statisticsBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                " -fx-font-size:15px; -fx-text-fill: #002147;");
        borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                " -fx-font-size:13px; -fx-text-fill: black;");
        detailsBar.setText("Details");
        statisticsBar.setText("Statistics");
        logoImage.setImage(logo);
        setting.setImage(settNeut);
        account.setImage(accountNeut);

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
        detailsBar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    root3= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fourth.fxml")));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                stage3=(Stage)((Node)event.getSource()).getScene().getWindow();
                    scene3= new Scene(root3);
                    scene3.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
                    stage3.setScene(scene3);
                    stage3.show();
                    detailsBar.setStyle("-fx-border-width: 0 0 2px 0;" +
                            "-fx-border-color: transparent transparent #002147 transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:15px; -fx-text-fill: #002147;");
                    returnBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:13px; -fx-text-fill: black;");
                    borrowBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:13px; -fx-text-fill: black;");
                    statisticsBar.setStyle("-fx-border-color: transparent transparent transparent transparent; -fx-font-family:'Arial'; " +
                            " -fx-font-size:13px; -fx-text-fill: black;");
            }
        });



    }
}
