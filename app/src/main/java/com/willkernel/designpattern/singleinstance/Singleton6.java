package com.willkernel.designpattern.singleinstance;

/**
 * 静态内部类 static nested class
 * 这种方法也是《Effective Java》上所推荐
 *
 * 这种写法仍然使用JVM本身机制保证了线程安全问题。由于静态单例对象没有作为Singleton的成员变量直接实例化，
 * 因此类加载时不会实例化Singleton，第一次调用getInstance()时将加载内部类SingletonHolder，
 * 在该内部类中定义了一个static类型的变量INSTANCE ，此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，
 * 确保该成员变量只能初始化一次。由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影响
 *
 * 一般来说，单例模式有五种写法：懒汉、饿汉、双重检验锁、静态内部类、枚举。上述所说都是线程安全的实现，上文中第一种方式线程不安全，排除。
 *
 * 一般情况下直接使用饿汉式就好了，如果明确要求要懒加载（lazy initialization）倾向于使用静态内部类。
 * 如果涉及到反序列化创建对象时会试着使用枚举的方式来实现单例
 */
public class Singleton6 {
    static {
        System.out.println("static{}");
    }
    private static class SingletonHolder {
        static {
            System.out.println("SingletonHolder{}");
        }
        private static final Singleton6 instance = new Singleton6();
    }

    private Singleton6() {
        System.out.println("Singleton6()");
    }

    public static Singleton6 getInstance() {
        System.out.println("getInstance()");
        return SingletonHolder.instance;
    }
}
