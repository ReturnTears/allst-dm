package com.allst.dm.flyweight;

/**
 * 图块类Tile
 *
 * @author Hutu
 * @since 2022-11-01 下午 10:22
 */
public class Tile {
    private String image; // 图块所用的材质图
    private int x, y; // 图块所在坐标

    public Tile(String image, int x, int y) {
        this.image = image;
        System.out.print("从磁盘加载[" + image + "]图片，耗时半秒......");
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片[" + image + "]");
    }
}
