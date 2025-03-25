package app.tappywings;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage = stage;
        stage.setTitle("TappyWings");
        stage.setScene(scene);
        stage.setResizable(false);

        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Icon/Icon.png")));
        stage.getIcons().add(icon);
        stage.setOnCloseRequest(_ -> {
            System.exit(0);
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}