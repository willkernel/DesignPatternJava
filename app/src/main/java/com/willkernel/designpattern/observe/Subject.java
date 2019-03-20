package com.willkernel.designpattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public abstract class Subject {
    private List<Observer> observers=new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    void notifyObservers(String state){
        for (Observer o : observers) {
            o.update(state);
        }
    }
}
