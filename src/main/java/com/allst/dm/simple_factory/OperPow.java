package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-09 下午 09:15
 */
public class OperPow extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return Math.pow(numberA, numberB);
    }
}
