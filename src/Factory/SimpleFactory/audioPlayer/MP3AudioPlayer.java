package Factory.SimpleFactory.audioPlayer;

public class MP3AudioPlayer extends AudioPlayer{


    public MP3AudioPlayer() {
        this.volume = 50;
        this.playbackRate = 1.0;
    }

    @Override
    public void play() {
        System.out.println(
                "PLaying song by karma in MP3AudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }

    @Override
    public void pause() {
        System.out.println(
                "Pausing song by karma in MP3AudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }

    @Override
    public void stop() {
        System.out.println(
                "Stopping song by karma in MP3AudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }
}
