package app.tappywings;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class GameController implements Runnable {

    public static Thread GameThread;

    @FXML
    private void initialize() {
        GameThread = new Thread(this);
        GameThread.start();

        loadBird();

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
                System.out.println("Test");
                GameLoop();
                delta--;
            }
            if (timer >= 1000000000) {
                timer = 0;
            }
        }
    }

    public ArrayList<ImageView> Pipes = new ArrayList<>();

    public void GameLoop() {



    }

    public void loadBird(){



    }

    public void loadPipes(){



    }

}


