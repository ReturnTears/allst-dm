package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-06 下午 12:05
 */
public class OperAdd extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA + numberB;
    }
}
