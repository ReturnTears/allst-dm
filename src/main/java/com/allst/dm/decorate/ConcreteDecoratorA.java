package com.allst.dm.decorate;

/**
 * 具体的装饰对象A
 *
 * @author Hutu
 * @since 2024-07-07 下午 10:26
 */
public class ConcreteDecoratorA extends Decorator {
    // 本类添加的新状态，区别其他的装饰对象类
    private String addState;
    @Override
    public void operation() {
        super.operation();
        this.addState = "ConcreteDecoratorA`s addState";
        System.out.println("具体装饰对象A的操作 : " + this.addState);
    }
}
