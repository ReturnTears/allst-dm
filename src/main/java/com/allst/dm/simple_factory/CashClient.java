package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-07 上午 11:18
 */
public class CashClient {
    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept(2);
        double cash = cashSuper.acceptCash(100, 3);
        System.out.println("总价：" + cash);
    }
}
