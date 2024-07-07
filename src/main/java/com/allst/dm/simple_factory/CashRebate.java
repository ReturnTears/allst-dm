package com.allst.dm.simple_factory;

/**
 * 打折收费
 *
 * @author Hutu
 * @since 2024-07-07 上午 10:39
 */
public class CashRebate extends CashSuper {
    // 折扣率
    private double moneyRebate = 1.0;

    /**
     * 初始化时必须输入折扣率
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    /**
     * 打折收费
     *
     * @param price 单价
     * @param num   数量
     *
     * @return 结果
     */
    @Override
    public double acceptCash(double price, int num) {
        return price * num * moneyRebate;
    }
}
