package com.allst.dm.ocp2;

/**
 * 开闭原则，定义图形计算接口, 分别定义三种求面积的接口
 *
 * @author June
 * @since 2021年09月
 */
public interface ICalculationArea {
    /**
     * 计算长方形面积
     *
     * @param x 长
     * @param y 宽
     *
     * @return 面积
     */
    double rectangle(double x, double y);

    /**
     * 计算三角形面积，使用海伦公式：S=√p(p-a)(p-b)(p-c)，其中p=(a+b+c) / 2
     *
     * @param x 边长
     * @param y 边长
     * @param z 边长
     *
     * @return 面积
     */
    double triangle(double x, double y, double z);

    /**
     * 计算圆⚪的面积
     *
     * @param r 半径
     *
     * @return 面积
     */
    double circular(double r);
}
