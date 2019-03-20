package com.willkernel.designpattern.factorymethod;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class BulbLight implements ILight {
    private static final String TAG = "BulbLight";

    @Override
    public void turnOn() {
        System.out.println(TAG + "turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println(TAG + "turnOff");

    }
}
