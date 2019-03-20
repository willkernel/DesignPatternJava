package com.willkernel.designpattern.iterator;


/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class ConcreteIterator implements Iterator {
    private int size;
    private ConcreteAggregate concreteAggregate;
    int index;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.size = concreteAggregate.size();
        index=0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return index >= size;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.getElement(index);
    }
}
