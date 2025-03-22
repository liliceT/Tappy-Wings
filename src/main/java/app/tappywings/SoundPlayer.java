package app.tappywings;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundPlayer {

    public SoundPlayer(String fileName) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File soundFile = new File("src/main/resources/Audio/" + fileName);
        AudioInputStream audioSteam = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioSteam);

        clip.start();
    }
}
