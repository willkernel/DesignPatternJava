package com.willkernel.designpattern.decorator;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void sampleOption() {
        super.sampleOption();
    }
}
