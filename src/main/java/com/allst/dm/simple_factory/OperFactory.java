package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-06 下午 11:01
 */
public class OperFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperAdd();
                break;
            case "-":
                operation = new OperSub();
                break;
            case "*":
                operation = new OperMul();
                break;
            case "/":
                operation = new OperDiv();
                break;
            default:
                break;
        }
        return operation;
    }
}
