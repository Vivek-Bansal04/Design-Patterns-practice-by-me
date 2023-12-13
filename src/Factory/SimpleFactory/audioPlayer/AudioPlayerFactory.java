package Factory.SimpleFactory.audioPlayer;

import javax.print.DocFlavor;

import static Factory.SimpleFactory.audioPlayer.AudioFormat.*;

public class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(AudioFormat audioFormat){
        switch (audioFormat){
            case MP3:
                return new MP3AudioPlayer();
            case WAV:
                return new WAVAudioPlayer();
            case FLAC:
                return new FLACAudioPlayer();
        }
        throw new RuntimeException("Invalid Audio Player");
    }
}
