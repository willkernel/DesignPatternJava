package com.willkernel.designpattern.bridge;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class ConcreteAbstraction extends Abstraction {
    private Implementor implementor;

    public ConcreteAbstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void operate() {
        implementor.operation();
    }
}
