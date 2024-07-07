package com.allst.dm.strategy;

/**
 * @author Hutu
 * @since 2024-07-07 下午 05:26
 */
public class StrategyClient {
    public static void main(String[] args) {
        // 由于实现了不同的策略，所以可以自由切换
        StrategyContext context = new StrategyContext(new StrategyConcreteA());
        context.contextInterface();

        context = new StrategyContext(new StrategyConcreteB());
        context.contextInterface();

        context = new StrategyContext(new StrategyConcreteC());
        context.contextInterface();
    }
}
