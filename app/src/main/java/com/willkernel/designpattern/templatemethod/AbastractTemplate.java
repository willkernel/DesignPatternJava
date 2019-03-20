package com.willkernel.designpattern.templatemethod;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public abstract class AbastractTemplate {
    public void templateMethod(){
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    private void concreteMethod() {

    }

    private void hookMethod() {

    }

    protected abstract void abstractMethod();
}
