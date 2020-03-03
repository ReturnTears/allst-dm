package com.allst.dm.dp.factory.order;

import com.allst.dm.dp.factory.pizza.*;

/**
 * 简单工厂类
 *
 * @author YiYa
 * @since 2020-03-04 上午 12:28
 */
public class SimpleFactory {
    /**
     * 创建披萨的方法,根据订购类型返回对应的Pizza对象
     *
     * @param orderType 订购类型
     * @return 结果
     */
    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂类~~~~");
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        } else if ("strawberry".equals(orderType)) {
            pizza = new StrawberryPizza();
            pizza.setName("草莓披萨");
        } // 有新的披萨类型直接在工厂类添加即可
        return pizza;
    }

    /**
     * 简单工厂模式又叫静态工厂模式
     *
     * @param orderType 类型
     * @return 结果
     */
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        } else if ("strawberry".equals(orderType)) {
            pizza = new StrawberryPizza();
            pizza.setName("草莓披萨");
        } // 有新的披萨类型直接在工厂类添加即可
        return pizza;
    }
}
