package com.willkernel.designpattern.decorator;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        System.out.println("bird move");
    }
}
