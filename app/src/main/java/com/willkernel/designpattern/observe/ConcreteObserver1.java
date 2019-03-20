package com.willkernel.designpattern.observe;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class ConcreteObserver1 implements Observer1 {
    private String state;

    @Override
    public void update(Subject1 subject) {
        state = ((ConcreteSubject1) subject).getState();
        System.out.println("state " + state);
    }
}
