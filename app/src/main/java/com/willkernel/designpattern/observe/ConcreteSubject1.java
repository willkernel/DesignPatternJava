package com.willkernel.designpattern.observe;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class ConcreteSubject1 extends Subject1 {
    private String state;

    public String getState() {
        return state;
    }

    public void changeState( ){
        this.state=state;
        notifyObservers();
    }
}
