package com.allst.dm.strategy;

/**
 * @author Hutu
 * @since 2024-07-07 下午 05:25
 */
public class StrategyContext {
    private final Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
