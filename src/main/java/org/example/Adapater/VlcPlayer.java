package org.example.Adapater;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Do nothing, as this player does not support MP4 format
        System.out.println("VlcPlayer does not support MP4 format.");
    }
}
