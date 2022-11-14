package com.allst.dm.bridge;

/**
 * 客户端类Client
 *
 * @author Hutu
 * @since 2022-11-14 下午 05:18
 */
public class Client {
    public static void main(String[] args) {
        // 第一案例
        Pen blackPen = new BlackPen();
        blackPen.draw();

        // 第二案例
        new WhiteBrush(new CircleRuler()).draw();
        new WhiteBrush(new SquareRuler()).draw();
        new WhiteBrush(new TriangleRuler()).draw();

        new BlackBrush(new CircleRuler()).draw();
        new BlackBrush(new SquareRuler()).draw();
        new BlackBrush(new TriangleRuler()).draw();
    }
}
