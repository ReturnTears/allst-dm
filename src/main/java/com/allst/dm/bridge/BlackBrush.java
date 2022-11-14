package com.allst.dm.bridge;

/**
 * @author Hutu
 * @since 2022-11-14 下午 05:32
 */
public class BlackBrush extends Brush {

    public BlackBrush(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑");
        ruler.regularize();
    }
}
