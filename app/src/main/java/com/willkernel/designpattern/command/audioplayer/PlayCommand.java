package com.willkernel.designpattern.command.audioplayer;

import com.willkernel.designpattern.command.Command;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class PlayCommand implements Command {
    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
