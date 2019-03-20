package com.willkernel.designpattern.abstractfactorypattern;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class PhoneFactory implements Factory {
    @Override
    public Apple createAppleProduct() {
        return new iPhone();
    }

    @Override
    public Samsung createSamsungProduct() {
        return new Note();
    }
}
