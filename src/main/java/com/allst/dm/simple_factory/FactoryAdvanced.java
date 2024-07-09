package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-09 下午 09:24
 */
public class FactoryAdvanced implements IFactory{
    @Override
    public Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "pow":
                operation = new OperPow();
                break;
            case "log":
                operation = new OperLog();
                break;
            default:
                break;
        }
        return operation;
    }
}
