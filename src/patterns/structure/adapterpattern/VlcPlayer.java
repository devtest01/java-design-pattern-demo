package patterns.structure.adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc file. Name:" + fileName);
    }
}
