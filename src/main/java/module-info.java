module app.tappywings {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.tappywings to javafx.fxml;
    exports app.tappywings;
}