module app.tappywings {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens app.tappywings to javafx.fxml;
    exports app.tappywings;
}