package com.allst.dm.bridge;

/**
 * 正方形□尺子类
 *
 * @author Hutu
 * @since 2022-11-14 下午 05:23
 */
public class SquareRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("□");
    }
}
