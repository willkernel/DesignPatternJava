package com.willkernel.designpattern.observe;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class Client {
    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        concreteSubject.attach(observer);

        concreteSubject.changeState("test");

        ConcreteSubject1 concreteSubject1 = new ConcreteSubject1();
        Observer1 observer1 = new ConcreteObserver1();
        observer1.update(concreteSubject1);

        Watched watched=new Watched();
        Watcher watcher=new Watcher();
        watched.addObserver(watcher);
        watched.setData("test");
    }

}
