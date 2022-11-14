package com.allst.dm.bridge;

/**
 * 画笔抽象类Pen
 *
 * @author Hutu
 * @since 2022-11-14 下午 05:11
 */
public abstract class Pen {

    public abstract void getColor();

    public void draw() {
        getColor();
        System.out.println("🔺");
    }
}
