package Adaptor.adaptor1;


import Adaptor.adaptor1.adapters.MediaPlayerAdapter;
import Adaptor.adaptor1.inferfaces.NewMediaPlayer;
import Adaptor.adaptor1.inferfaces.OldMediaPlayer;
import Adaptor.adaptor1.modelsImpl.NewMediaPlayerImpl;
import Adaptor.adaptor1.modelsImpl.OldMediaPlayerImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OldMediaPlayer oldPlayer = new OldMediaPlayerImpl();
        oldPlayer.play("mp3", "song.mp3");

        NewMediaPlayer newPlayer = new NewMediaPlayerImpl();
        OldMediaPlayer oldPlayerAdapter = new MediaPlayerAdapter(newPlayer);
        oldPlayerAdapter.play("mp4", "video.mp4");
    }
}