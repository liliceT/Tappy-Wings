package app.tappywings;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.awt.*;


public class HomeController {

    public AnchorPane MenuPane;
    public ChoiceBox<String> Color;
    public ImageView Start;

    @FXML
    private void initialize() {

        Color.getItems().addAll("Blue", "Red", "Yellow");
        Color.setValue("Blue");

    }

    public void StartGame() {

        new SkiftScene("Game.fxml");
        Main.stage.setX((double) Toolkit.getDefaultToolkit().getScreenSize().width / 2 - Main.stage.getWidth() / 2);

        new GameController();
    }

}
