package com.willkernel.designpattern.decorator;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Decorator implements Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOption() {
        component.sampleOption();
    }
}
