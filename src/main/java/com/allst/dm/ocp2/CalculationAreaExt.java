package com.allst.dm.ocp2;

/**
 * 使用开闭原则改善代码，实现过程是继承父类扩展需要的方法，同时可以保留原有的方法，新增自己需要的方法。
 *
 * @author June
 * @since 2021年09月
 */
public class CalculationAreaExt extends CalculationArea {

    /**
     * 父类Π值的精度
     */
    private final static double Π = 3.141592653D;

    /**
     * 扩展后的方法已经把求圆形面积的精度增长，需要使用此方法的用户可以直接调用。
     * 而其他的方法，如长方形面积、三角形面积，则可以继续使用。
     *
     * @param r 半径
     *
     * @return 结果
     */
    @Override
    public double circular(double r) {
        return Π * r * r;
    }
}
