package com.willkernel.designpattern.observe;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void changeState(String state){
        this.state=state;
        notifyObservers(state);
    }
}
