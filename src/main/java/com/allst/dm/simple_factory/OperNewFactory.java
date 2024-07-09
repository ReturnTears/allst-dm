package com.allst.dm.simple_factory;

/**
 * 工厂方法模式
 *
 * @author Hutu
 * @since 2024-07-09 下午 09:30
 */
public class OperNewFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        IFactory factory = null;
        switch (operate) {
            case "+":
            case "-":
            case "*":
            case "/":
                factory = new FactoryBasic();
                break;
            case "pow":
            case "log":
                factory = new FactoryAdvanced();
                break;
            default:
                factory = new FactoryBasic();
                break;
        }
        return factory.createOperate(operate);
    }
}
