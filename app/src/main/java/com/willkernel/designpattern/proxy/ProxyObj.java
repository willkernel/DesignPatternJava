package com.willkernel.designpattern.proxy;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class ProxyObj extends AbstractObj {
    RealObj realObj=new RealObj();
    @Override
    public void operation() {
        System.out.println("before..");
        realObj.operation();
        System.out.println("after..");
    }
}
