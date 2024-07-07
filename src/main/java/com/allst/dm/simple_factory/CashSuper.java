package com.allst.dm.simple_factory;

/**
 * 收费抽象类
 *
 * @author Hutu
 * @since 2024-07-07 上午 10:37
 */
public abstract class CashSuper {
    /**
     * 收费抽象方法
     *
     * @param price 价格
     * @param num   数量
     *
     * @return 计算费用
     */
    public abstract double acceptCash(double price, int num);
}
