package com.willkernel.designpattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public abstract class Subject1 {
    private List<Observer1> observers=new ArrayList<>();

    public void attach(Observer1 observer){
        observers.add(observer);
    }

    public void detach(Observer1 observer){
        observers.remove(observer);
    }

    void notifyObservers(){
        for (Observer1 observer : observers) {
            observer.update(this);
        }
    }
}
