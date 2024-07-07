package com.allst.dm.decorate;

/**
 * @author Hutu
 * @since 2024-07-07 下午 10:30
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        this.addBehaviour();
    }

    private void addBehaviour() {
        System.out.println("ConcreteDecoratorB.addBehaviour()");
    }
}
