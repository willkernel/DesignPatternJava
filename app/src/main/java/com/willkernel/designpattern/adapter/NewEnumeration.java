package com.willkernel.designpattern.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class NewEnumeration implements Enumeration {
    Iterator iterator;

    public NewEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        for (NewEnumeration enumeration = new NewEnumeration(list.iterator()); enumeration.hasMoreElements(); ) {
            System.out.println(enumeration.nextElement());
        }
    }
}
