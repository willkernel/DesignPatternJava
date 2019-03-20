package com.willkernel.designpattern.strategy;

/**
 策略模式对多态的使用

 　　通过让环境类持有一个抽象策略类（超类）的引用，在生成环境类实例对象时，让该引用指向具体的策略子类。
 再对应的方法调用中，就会通过Java的多态，调用对应策略子类的方法。从而可以相互替换，不需要修改环境类内部的实现。
 同时，在有新的需求的情况下，也只需要修改策略类即可，降低与环境类之间的耦合度。

 策略模式的重心

 　　策略模式的重心不是如何实现算法，而是如何组织、调用这些算法，从而让程序结构更灵活，具有更好的维护性和扩展性。

 算法的平等性

 　　策略模式一个很大的特点就是各个策略算法的平等性。对于一系列具体的策略算法，大家的地位是完全一样的，正因为这个平等性，
 才能实现算法之间可以相互替换。所有的策略算法在实现上也是相互独立的，相互之间是没有依赖的。

 　　所以可以这样描述这一系列策略算法：策略算法是相同行为的不同实现。

 运行时策略的唯一性

 　　运行期间，策略模式在每一个时刻只能使用一个具体的策略实现对象，虽然可以动态地在不同的策略实现中切换，但是同时只能使用一个。

 公有的行为

 　　经常见到的是，所有的具体策略类都有一些公有的行为。这时候，就应当把这些公有的行为放到共同的抽象策略角色Strategy类里面。
 当然这时候抽象策略角色必须要用Java抽象类实现，而不能使用接口

 策略模式的优点
 　　（1）策略模式提供了管理相关的算法族的办法。策略类的等级结构定义了一个算法或行为族。
 恰当使用继承可以把公共的代码移到父类里面，从而避免代码重复。

 　　（2）使用策略模式可以避免使用多重条件(if-else)语句。多重条件语句不易维护，
 它把采取哪一种算法或采取哪一种行为的逻辑与算法或行为的逻辑混合在一起，统统列在一个多重条件语句里面，
 比使用继承的办法还要原始和落后。

 策略模式的缺点
 　　（1）客户端必须知道所有的策略类，并自行决定使用哪一个策略类。这就意味着客户端必须理解这些算法的区别，
 以便适时选择恰当的算法类。换言之，策略模式只适用于客户端知道算法或行为的情况。

 　　（2）由于策略模式把每个具体的策略实现都单独封装成为类，如果备选的策略很多的话，那么对象的数目就会很可观。
 */
public class Client {
    public static void main(String[] args){

        MemberStrategy strategy=new PrimaryMemberStrategy();
        Price price=new Price(strategy);
        System.out.println(price.quote(12));
    }
}
