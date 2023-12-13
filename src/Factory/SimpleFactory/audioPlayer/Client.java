package Factory.SimpleFactory.audioPlayer;
//https://github.com/Vivek-Bansal04/design-patterns-and-questions-scaler/tree/master/src/main/java/com/scaler/lld/design/assignments/factory

public class Client {
    public static void main(String[] args) {
        AudioPlayer Mp3Player = AudioPlayerFactory.createAudioPlayer(AudioFormat.MP3);
        Mp3Player.play();
        Mp3Player.pause();
        Mp3Player.stop();
    }
}
