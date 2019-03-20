package com.willkernel.designpattern.factorymethod;

/**
 * Created by willkernel
 * on 2019/3/18.
 */
public class BulbCreator implements ICreator {
    @Override
    public ILight createLight() {
        return new BulbLight();
    }
}
