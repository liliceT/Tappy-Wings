package app.tappywings;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class GameController implements Runnable {

    public AnchorPane GamePane;

    public ImageView Bird;

    public Thread GameThread;

    @FXML
    private void initialize() {
        GameThread = new Thread(this);
        GameThread.start();

        loadBird();

//        loadPipes();

    }

    @Override
    public void run() {
        int FPS = 60;
        double drawInterval = (double) 1000000000 / FPS; //Nanosekunder div med ønsket FPS
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;

        while (GameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {

                GameLoop();

                delta--;
            }
            if (timer >= 1000000000) {
                timer = 0;
            }
        }
    }



    public void GameLoop() {



    }

    public void loadBird(){

        Bird.setLayoutX((double) 500 / 2 - Bird.getImage().getWidth() / 2);
        Bird.setLayoutY(425);
        Bird.setScaleX(2); Bird.setScaleY(2);

        GamePane.getChildren().add(Bird);

    }

    private ArrayList<ImageView> Pipes = new ArrayList<>();

    public void loadPipes() {

        Random random = new Random();

        ImageView lowerpipe = new ImageView();
        lowerpipe.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Misc/pipe.png"))));
        lowerpipe.setLayoutX(50);
        lowerpipe.setLayoutY(random.nextInt(200));

        ImageView upperpipe = new ImageView();
        upperpipe.rotateProperty().set(180);
        upperpipe.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Misc/pipe.png"))));
        upperpipe.setLayoutX(50);
        upperpipe.setLayoutY(random.nextInt(200));


    }

}


