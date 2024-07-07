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


        // 使用策略模式
        CashStrategyContext context = new CashStrategyContext(new CashNormal());
        double acceptCash = context.acceptCash(100, 3);
        System.out.println("cash1：" + acceptCash);

        context = new CashStrategyContext(new CashRebate(1.0));
        acceptCash = context.acceptCash(100, 3);
        System.out.println("cash2：" + acceptCash);

        context = new CashStrategyContext(new CashReturn(300, 100));
        acceptCash = context.acceptCash(100, 3);
        System.out.println("cash3：" + acceptCash);
    }
}
