package com.example;

public class MediaPlayerPlayingState implements MediaPlayerState {

    @Override
    public void pressButton(MediaPlayer player) {
        pause(player);
        player.setState(new MediaPlayerPausedState());
    }

    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing");
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }
  
}
