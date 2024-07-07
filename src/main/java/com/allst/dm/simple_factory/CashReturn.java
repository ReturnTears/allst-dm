package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-07 上午 10:41
 */
public class CashReturn extends CashSuper {
    // 返现条件
    private double moneyCondition = 0.0d;
    // 返现结果
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result >= moneyCondition) {
            return result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
