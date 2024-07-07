package com.allst.dm.simple_factory;

/**
 * Cash类的策略模式
 *
 * @author Hutu
 * @since 2024-07-07 下午 05:29
 */
public class CashStrategyContext2 {
    private final CashSuper cashSuper;
    public CashStrategyContext2(int type) {
        switch (type) {
            case 1:
                this.cashSuper = new CashNormal();
                break;
            case 2:
                this.cashSuper = new CashReturn(300, 100);
                break;
            case 3:
                this.cashSuper = new CashRebate(0.8);
                break;
            default:
                this.cashSuper = new CashNormal();
        }
    }

    public double getResult(double price, int num) {
        return this.cashSuper.acceptCash(price, num);
    }
}
