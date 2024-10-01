package Adaptor.adaptor1.adapters;

import Adaptor.adaptor1.inferfaces.NewMediaPlayer;
import Adaptor.adaptor1.inferfaces.OldMediaPlayer;

public class MediaPlayerAdapter implements OldMediaPlayer {

    private NewMediaPlayer newMediaPlayer;

    public MediaPlayerAdapter(NewMediaPlayer newMediaPlayer) {
        this.newMediaPlayer = newMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        // Código para adaptar os métodos de reprodução
    }
}