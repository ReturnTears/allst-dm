package com.allst.dm.bridge;

/**
 * 圆形⚪尺子类
 *
 * @author Hutu
 * @since 2022-11-14 下午 05:23
 */
public class CircleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("⚪");
    }
}
