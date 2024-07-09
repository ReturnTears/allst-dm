package com.allst.dm.simple_factory;

import lombok.Getter;

/**
 * @author Hutu
 * @since 2024-07-06 下午 12:01
 */
@Getter
public abstract class Operation {
    private double numberA;
    private double numberB;

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    //public abstract double getResult();
    public double getResult(double numberA, double numberB) {
        return numberA * 1 + numberB * 1;
    }
}
