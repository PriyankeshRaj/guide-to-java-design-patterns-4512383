package com.example;

public class MediaPlayerPausedState implements MediaPlayerState {

  @Override
  public void pressButton(MediaPlayer player) {
    play(player);
    player.setState(new MediaPlayerPlayingState());
  }

  @Override
  public void play(MediaPlayer player) {
    System.out.println("Playing");
    System.out.println("Displaying pause icon");
  }

  @Override
  public void pause(MediaPlayer player) {
    System.out.println("Already paused");
  }

}
