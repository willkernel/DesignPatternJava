package com.willkernel.designpattern.singleinstance;

/**
 懒汉式，线程不安全
 懒汉式其实是一种比较形象的称谓。既然懒，那么在创建对象实例的时候就不着急。会一直等到马上要使用对象实例的时候才会创建，
 懒人嘛，总是推脱不开的时候才会真正去执行工作，因此在装载对象的时候不创建对象实例
 在多线程下不能正常工作
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
