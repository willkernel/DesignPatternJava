package com.willkernel.designpattern.adapter;

/**
 适配器模式有类的适配器模式和对象的适配器模式两种不同的形式

 类适配器模式
 适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口。由于Adaptee没有提供sampleOperation2()方法，
 而目标接口又要求这个方法，因此适配器角色Adapter实现了这个方法
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void sampleOption1() {
        super.samepleOption1();
    }
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOption2() {
    }
}
