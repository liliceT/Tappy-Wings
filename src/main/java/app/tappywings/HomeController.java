package app.tappywings;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.awt.*;


public class HomeController {

    public AnchorPane MenuPane;
    public ChoiceBox<String> ColorChoice;
    public ImageView Start;
    public static String birdColor;

    @FXML
    private void initialize() {

        ColorChoice.getItems().addAll("Blue", "Red", "Yellow");
        ColorChoice.setValue("Blue");

    }

    public void StartGame() {

        birdColor = ColorChoice.getValue();

        new SkiftScene("Game.fxml");
        Main.stage.setX((double) Toolkit.getDefaultToolkit().getScreenSize().width / 2 - Main.stage.getWidth() / 2);
    }
}
