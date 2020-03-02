package com.allst.dm.dp.factory.pizza;

/**
 * @author YiYa
 * @since 2020-03-03 上午 12:54
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给西拉披萨准备原材料~~~");
    }
}
