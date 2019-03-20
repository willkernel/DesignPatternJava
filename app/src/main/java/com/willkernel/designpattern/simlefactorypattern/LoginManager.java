package com.willkernel.designpattern.simlefactorypattern;


/**
 * 简单工厂模式优缺点
 * 优点：
 * 通过使用工厂类，外界不再需要关心如何创造各种具体的产品，只要提供一个产品的名称作为参数传给工厂，就可以直接得到一个想要的产品对象，并且可以按照接口规范来调用产品对象的所有功能（方法）。
 * 构造容易，逻辑简单。
 * 缺点：
 * 1.简单工厂模式中的if else判断非常多，完全是Hard Code，如果有一个新产品要加进来，就要同时添加一个新产品类，并且必须修改工厂类，再加入一个 else if 分支才可以， 这样就违背了 “开放-关闭原则”中的对修改关闭的准则了。当系统中的具体产品类不断增多时候，就要不断的修改工厂类，对系统的维护和扩展不利。
 * 2.一个工厂类中集合了所有的类的实例创建逻辑，违反了高内聚的责任分配原则，将全部的创建逻辑都集中到了一个工厂类当中，所有的业务逻辑都在这个工厂类中实现。什么时候它不能工作了，整个系统都会受到影响。因此一般只在很简单的情况下应用，比如当工厂类负责创建的对象比较少时。
 * 3.简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构。
 * <p>
 * 适用环境
 * 在以下情况下可以使用简单工厂模式：
 * 工厂类负责创建的对象比较少：由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
 * 客户端只知道传入工厂类的参数，对于如何创建对象不关心：客户端既不需要关心创建细节，甚至连类名都不需要记住，只需要知道类型所对应的参数。
 * <p>
 * 简单工厂模式在Java中的应用
 * JDK类库中广泛使用了简单工厂模式，如工具类java.text.DateFormat，它用于格式化一个本地日期或者时间。
 * public final static DateFormat getDateInstance();
 * public final static DateFormat getDateInstance(int style);
 * public final static DateFormat getDateInstance(int style,Locale locale);
 * <p>
 * Java加密技术
 * 获取不同加密算法的密钥生成器:
 * <p>
 * KeyGenerator keyGen=KeyGenerator.getInstance("DESede");
 * 创建密码器:
 * <p>
 * Cipher cp=Cipher.getInstance("DESede");
 */
public class LoginManager {
    public static Login factory(String type) {
        switch (type) {
            case "password":
                return new PasswordLogin();
            case "domain":
                return new DomainLogin();
            default:
                throw new RuntimeException("invalid type");
        }
    }
}
