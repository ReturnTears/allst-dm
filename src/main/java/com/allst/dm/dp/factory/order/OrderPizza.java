package com.allst.dm.dp.factory.order;

import com.allst.dm.dp.factory.pizza.CheesePizza;
import com.allst.dm.dp.factory.pizza.GreekPizza;
import com.allst.dm.dp.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YiYa
 * @since 2020-03-03 上午 12:56
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName(" 西拉披萨 ");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName(" 芝士披萨 ");
            } else {
                System.out.println("退出~~~");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
