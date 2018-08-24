package bad.apple;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URI;
import java.net.URL;

public class Music extends Thread{

    @Override
    public void run() {
        try {
            URL music = Music.class.getClassLoader().getResource("badApple1.wav");
            File musicFile = new File(music.getFile());
            URI uri = musicFile.toURI();
            URL url = uri.toURL();
            AudioClip clip= Applet.newAudioClip(url);
            clip.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
