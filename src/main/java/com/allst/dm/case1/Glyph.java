package com.allst.dm.case1;

import java.awt.*;

/**
 * 定义图元抽象类，它的子类既定义基本的图形元素（字符和图像），也定义组合图形元素（行，列）
 *
 * @author Hutu
 * @since 2024-11-06 下午 10:38
 */
public abstract class Glyph {
    public abstract void draw(Window window);
    public abstract void bounds(Rectangle r);

    public abstract boolean intersects(Point r);

    public abstract void insert(Glyph g);
    public abstract void remove(Glyph g);
    public abstract Glyph child(int i);
    public abstract Glyph parent();
}
