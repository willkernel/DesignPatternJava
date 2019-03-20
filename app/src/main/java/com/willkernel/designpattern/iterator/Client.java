package com.willkernel.designpattern.iterator;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Client {
    public static void main(String[] args){

        Object[] objAry={"One","Two","Three","Four","Five","Six"};
        Aggregate aggregate=new ConcreteAggregate(objAry);
        Iterator iterator=aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
