package com.example;

public class MediaPlayer {
    private MediaPlayerState state;

    public MediaPlayer() {
        this.state = new MediaPlayerPausedState();
    }

    public void setState(MediaPlayerState state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressButton(this);
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}
