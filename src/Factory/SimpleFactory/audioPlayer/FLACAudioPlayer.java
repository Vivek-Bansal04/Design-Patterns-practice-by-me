package Factory.SimpleFactory.audioPlayer;

public class FLACAudioPlayer extends AudioPlayer{


    public FLACAudioPlayer() {
        this.volume = 60;
        this.playbackRate = 1.5;
    }

    @Override
    public void play() {
        System.out.println(
                "PLaying song by karma in FLACAudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }

    @Override
    public void pause() {
        System.out.println(
                "Pausing song by karma in FLACAudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }

    @Override
    public void stop() {
        System.out.println(
                "Stopping song by karma in FLACAudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }
}
