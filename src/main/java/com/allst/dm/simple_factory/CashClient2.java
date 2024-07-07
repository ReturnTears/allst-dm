package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-07 上午 11:18
 */
public class CashClient2 {
    public static void main(String[] args) {
        // 根据用户的额输入，选择不同的收费策略，将对应的策略对象作为参数传入CashStrategyContext2对象中
        CashStrategyContext2 context = new CashStrategyContext2(CashEnum.RETURN.getType());
        double result = context.getResult(100, 3);
        System.out.println("result：" + result);
    }
}
