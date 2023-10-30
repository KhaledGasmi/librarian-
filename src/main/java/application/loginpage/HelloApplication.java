package application.loginpage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Mvc mvc = new Mvc();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        //FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("second.fxml"));

        // Load the FXML files and initialize the controller instances
        Parent root1 = fxmlLoader1.load();
        //Parent root2 = fxmlLoader2.load();

        HelloController controller = fxmlLoader1.getController();
        //secondController controller2 = fxmlLoader2.getController();

        // Set the shared model
      /**  controller.settingUser(mvc);

        controller2.settingUser(mvc);
        controller.saveUser("yacine","belouz");
        controller2.assignUser();
        System.out.println(controller2.assignPass()); **/


        Scene scene = new Scene(root1);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("LIBRARIAN ENSTA");
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}

