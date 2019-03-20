package com.willkernel.designpattern.command;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver=null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
