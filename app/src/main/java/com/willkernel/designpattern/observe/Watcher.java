package com.willkernel.designpattern.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class Watcher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(o + " arg " + arg);
    }
}
