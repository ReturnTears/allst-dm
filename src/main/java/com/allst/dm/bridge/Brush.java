package com.allst.dm.bridge;

/**
 * 画笔类Pen
 *
 * @author Hutu
 * @since 2022-11-14 下午 05:11
 */
public abstract class Brush {

    protected Ruler ruler; // 尺子的引用

    public Brush(Ruler ruler) {
        this.ruler = ruler;
    }

    public abstract void draw(); // 抽象方法
}
