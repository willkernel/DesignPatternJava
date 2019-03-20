package com.willkernel.designpattern.facade;

/**
 * 外观模式(Facade Pattern)：外部与一个子系统的通信必须通过一个统一的外观对象进行，
 * 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 外观模式又称为门面模式，它是一种对象结构型模式
 * <p>
 * 使用外观模式还有一个附带的好处，就是能够有选择性地暴露方法
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();


    }
}
