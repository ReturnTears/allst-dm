package com.allst.dm.bridge;

/**
 * @author Hutu
 * @since 2022-11-14 下午 05:32
 */
public class WhiteBrush extends Brush {

    public WhiteBrush(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白");
        ruler.regularize();
    }
}
