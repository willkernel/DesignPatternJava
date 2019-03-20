package com.willkernel.designpattern.command.audioplayer;

import com.willkernel.designpattern.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class MacroAudioCommand implements MacroCommand {
    private List<Command> commandList=new ArrayList<>();
    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }


    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
