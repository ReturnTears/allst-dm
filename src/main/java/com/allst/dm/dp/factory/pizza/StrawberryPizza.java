package com.allst.dm.dp.factory.pizza;

/**
 * 草莓披萨
 *
 * @author YiYa
 * @since 2020-03-04 上午 12:56
 */
public class StrawberryPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给草莓披萨准备原材料~~~ ");
    }
}
