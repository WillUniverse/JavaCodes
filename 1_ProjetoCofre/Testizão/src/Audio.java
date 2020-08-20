
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Audio {

    ue sonido = new ue();
    URL som = Audio.class.getResource(sonido);
    AudioClip Som = Applet.newAudioClip(som);

    public static void main(String[] args) {
        Audio tocar = new Audio();
        tocar.Som.play();

    }

    public class ue() {
        this.sonido = "C:\\Users\\wills\\Desktop\\PROJETOCOFRE\\som\\will.wav";
    }
}
