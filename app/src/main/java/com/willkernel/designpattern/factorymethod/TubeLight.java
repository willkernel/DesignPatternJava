package com.willkernel.designpattern.factorymethod;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class TubeLight implements ILight {
    private static final String TAG = "TubeLight";

    @Override
    public void turnOn() {
        System.out.println(TAG + "turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println(TAG + "turnOff");

    }
}
