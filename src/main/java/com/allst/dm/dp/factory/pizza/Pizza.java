package com.allst.dm.dp.factory.pizza;

/**
 * Pizza抽象类
 *
 * @author YiYa
 * @since 2020-03-03 上午 12:49
 */
public abstract class Pizza {
    // 名字
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    // 准备原材料,不同的Pizza原材料不一样
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " ~ baking~~~");
    }

    public void cut() {
        System.out.println(name + " ~ cuting~~~");
    }

    public void box() {
        System.out.println(name + " ~ boxing~~~");
    }

}
