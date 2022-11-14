package com.allst.dm.bridge;

/**
 * 黑色画笔类BlackPen
 *
 * @author Hutu
 * @since 2022-11-14 下午 05:17
 */
public class BlackPen extends Pen {
    @Override
    public void getColor() {
        System.out.print("黑");
    }
}
