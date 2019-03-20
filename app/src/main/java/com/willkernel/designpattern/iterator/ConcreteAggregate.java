package com.willkernel.designpattern.iterator;



/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objArray = null;

    public ConcreteAggregate(Object[] objArray) {
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index) {
        if (index < 0 || index >= objArray.length) {
            return null;
        }
        return objArray[index];
    }

    public int size() {
        return objArray.length;
    }
}
