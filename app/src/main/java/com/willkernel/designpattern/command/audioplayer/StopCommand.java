package com.willkernel.designpattern.command.audioplayer;

import com.willkernel.designpattern.command.Command;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class StopCommand implements Command {
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
