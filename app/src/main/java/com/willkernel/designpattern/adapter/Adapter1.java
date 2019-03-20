package com.willkernel.designpattern.adapter;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class Adapter1 {
    private Adaptee adaptee;

    public Adapter1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void sampleOperation1(){
        adaptee.samepleOption1();
    }

    public void sampleOperation2(){

    }


}
