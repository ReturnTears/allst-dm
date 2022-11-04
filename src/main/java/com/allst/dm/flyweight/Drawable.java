package com.allst.dm.flyweight;

/**
 * 绘图接口Drawable
 *
 * @author Hutu
 * @since 2022-11-01 下午 10:32
 */
public interface Drawable {
    void draw(int x, int y); // 绘图方法， 接收地图坐标
}
