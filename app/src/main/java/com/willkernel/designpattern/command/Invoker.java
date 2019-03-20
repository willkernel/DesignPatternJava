package com.willkernel.designpattern.command;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
