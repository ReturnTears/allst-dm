package com.allst.dm.decorate;

/**
 * Component是定义一个对象接口，可以给这些对象动态地添加职责。
 * ConcreteComponent是定义了一个具体的对象，也可以给这个对象添加一些
 * 职责。Decorator， 装饰抽象类，继承了Component ，从外类来扩展
 * Component类的功能，但对于Component来说，是无须知道Decorator的存在
 * 的。至于ConcreteDecorator就是具体的装饰对象，起到给Component添加职
 * 责的功能。
 *
 * 如果只有一个ConcreteComponent类而没有抽象的Component类，那么Decorator类可以是ConcreteComponent的一个子类。
 * 同样道理，如果只有一个ConcreteDecorator类，那么就没有必要建立一个单独的Decorator类，而可以把Decorator和ConcreteDecorator的责任
 * 合并成一个类。
 *
 * @author Hutu
 * @since 2024-07-07 下午 10:31
 */
public class DecoratorClient {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}
