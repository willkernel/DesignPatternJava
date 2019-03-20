package com.willkernel.designpattern.proxy;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class RealObj extends AbstractObj {
    @Override
    public void operation() {
        System.out.println("real operation");
    }
}
