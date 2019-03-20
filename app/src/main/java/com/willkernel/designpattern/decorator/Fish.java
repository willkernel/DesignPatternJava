package com.willkernel.designpattern.decorator;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Fish extends Change {
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("fish move");
    }
}
