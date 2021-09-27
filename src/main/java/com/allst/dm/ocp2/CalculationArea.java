package com.allst.dm.ocp2;

/**
 * 图形计算接口实现类
 *
 * @author June
 * @since 2021年09月
 */
public class CalculationArea implements ICalculationArea {

    /**
     * 圆形⚪面积的Π取值3.14D，这也是要扩展精度的方法和体现开闭原则的地方
     * 如果需要更高精度，直接修改Π值就破环了开闭原则
     */
    private final static double Π = 3.14D;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return Π * r * r;
    }
}
