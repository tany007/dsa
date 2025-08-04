package org.example.Adapater;

//Client code that uses the MediaPlayer interface to play different types of audio files.
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equals("vlc") || audioType.equals("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type: " + audioType + ". Supported types are mp3, vlc, and mp4.");
        }
    }
}
