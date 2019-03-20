package com.willkernel.designpattern.command.audioplayer;

import com.willkernel.designpattern.command.Command;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public interface MacroCommand extends Command {
    void add(Command command);
    void remove(Command command);
}
