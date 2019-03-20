package com.willkernel.designpattern.abstractfactorypattern;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class TabsFactory implements Factory {
    @Override
    public Apple createAppleProduct() {
        return new Pad();
    }

    @Override
    public Samsung createSamsungProduct() {
        return new Tabs();
    }
}
