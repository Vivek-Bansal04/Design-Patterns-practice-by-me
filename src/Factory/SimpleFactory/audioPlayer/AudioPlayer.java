package Factory.SimpleFactory.audioPlayer;

public abstract class AudioPlayer {
    int volume;
    double playbackRate;

    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}
