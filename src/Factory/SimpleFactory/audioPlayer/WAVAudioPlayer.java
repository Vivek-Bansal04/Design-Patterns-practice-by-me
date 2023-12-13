package Factory.SimpleFactory.audioPlayer;

public class WAVAudioPlayer extends AudioPlayer{


    public WAVAudioPlayer() {
        this.volume = 80;
        this.playbackRate = 2.0;
    }

    @Override
    public void play() {
        System.out.println(
                "PLaying song by karma in WAVAudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }

    @Override
    public void pause() {
        System.out.println(
                "Pausing song by karma in WAVAudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }

    @Override
    public void stop() {
        System.out.println(
                "Stopping song by karma in WAVAudioPlayer at volume " + this.volume +
                        " and playback rate: " + this.playbackRate
        );
    }
}
