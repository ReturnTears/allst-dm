package com.allst.dm.simple_factory;

/**
 * 正常收费
 * @author Hutu
 * @since 2024-07-07 上午 10:39
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
