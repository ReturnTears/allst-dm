package com.allst.dm.decorate2;

/**
 * ConcreteDecorator
 *
 * @author Hutu
 * @since 2024-07-08 下午 08:33
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.print("TShirts ");
        super.show();
    }
}
