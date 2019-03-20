package com.willkernel.designpattern.command.audioplayer;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class AudioPlayer {
    public void play() {
        System.out.println("play..");
    }

    public void stop() {
        System.out.println("stop..");
    }

    public void rewind() {
        System.out.println("rewind..");
    }
}
