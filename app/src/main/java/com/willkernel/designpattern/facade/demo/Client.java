package com.willkernel.designpattern.facade.demo;

/**
 外观模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护
 外观模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟外观类交互就可以了

 */
public class Client {
    public static void main(String[] args) {
        EcryptFacade facade = new EcryptFacade();
        facade.ecryptFile("./test.txt", "./output.txt");

    }
}
