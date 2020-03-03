package com.allst.dm.dp.factory.order;

/**
 * @author YiYa
 * @since 2020-03-03 上午 01:06
 */
public class PizzaStore {

    public static void main(String[] args) {
        // 使用传统的方法~~~~~~
        // new OrderPizza();

        // 使用简单工厂类~~~~~
        // new OrderPizza(new SimpleFactory());

        // 静态工厂
        new OrderPizza2();
    }

}
