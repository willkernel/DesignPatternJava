package com.willkernel.designpattern.decorator;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
