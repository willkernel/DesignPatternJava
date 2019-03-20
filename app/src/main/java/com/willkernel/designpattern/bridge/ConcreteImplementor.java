package com.willkernel.designpattern.bridge;

/**
 * Created by willkernel
 * on 2019/3/20.
 */
public class ConcreteImplementor implements Implementor {
    @Override
    public void operation() {
        System.out.println("ConcreteImplementor operation ");
    }
}
