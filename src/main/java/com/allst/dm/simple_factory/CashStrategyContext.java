package com.allst.dm.simple_factory;

/**
 * Cash类的策略模式
 *
 * @author Hutu
 * @since 2024-07-07 下午 05:29
 */
public class CashStrategyContext {
    private final CashSuper cashSuper;
    public CashStrategyContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double acceptCash(double price, int num) {
        return cashSuper.acceptCash(price, num);
    }
}
