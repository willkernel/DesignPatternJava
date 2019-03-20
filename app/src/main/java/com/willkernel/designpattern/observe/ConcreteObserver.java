package com.willkernel.designpattern.observe;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.println("state " + state);
    }
}
