package com.willkernel.designpattern.iterator;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public interface Iterator {
    void first();

    void next();

    boolean isDone();

    Object currentItem();
}
