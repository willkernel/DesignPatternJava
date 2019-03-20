package com.willkernel.designpattern.facade;

/**
 * Created by willkernel
 * on 2019/3/19.
 */
public class Facade {
    ModA modA=new ModA();
    ModB modB=new ModB();
    ModC modC=new ModC();
    public void test(){
        ModuleA moduleA=new ModuleA();
        moduleA.testA();
        ModuleB moduleB=new ModuleB();
        moduleB.testB();
        ModuleC moduleC=new ModuleC();
        moduleC.testC();

    }
    public void a1(){
        modA.a1();
    }
    public void b1(){
        modB.b1();
    }
}
