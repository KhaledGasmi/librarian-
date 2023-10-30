module application.loginpage {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens application.loginpage to javafx.fxml;
    exports application.loginpage;
}