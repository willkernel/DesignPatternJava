package com.willkernel.designpattern.command.audioplayer;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Client {
    public static void main(String[] args){

        AudioPlayer audioPlayer=new AudioPlayer();
        PlayCommand playCommand=new PlayCommand(audioPlayer);
        RewindCommand rewindCommand=new RewindCommand(audioPlayer);
        StopCommand stopCommand=new StopCommand(audioPlayer);

        Keypad keypad=new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        keypad.play();
        keypad.stop();
        keypad.rewind();

        MacroCommand macroCommand=new MacroAudioCommand();
        macroCommand.add(playCommand);
        macroCommand.add(stopCommand);
        macroCommand.add(stopCommand);
        macroCommand.execute();
    }
}
