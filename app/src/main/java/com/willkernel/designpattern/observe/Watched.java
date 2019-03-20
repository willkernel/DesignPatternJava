package com.willkernel.designpattern.observe;

import java.util.Observable;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class Watched extends Observable {
    private String data="";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
            setChanged();
            notifyObservers();
        }
    }
}
