package com.allst.dm.flyweight;

/**
 * @author Hutu
 * @since 2022-11-01 下午 10:34
 */
public class River implements Drawable {

    private String image; // 河流图片材质

    public River() {
        this.image = "河流";
        System.out.println("从磁盘加载[" + image + "]图片，耗时半秒......");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("在位置[%d:%d]上绘制图片:%s", x, y, image));
    }
}
