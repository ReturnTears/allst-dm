package com.allst.dm.simple_factory;

/**
 * "基础运算工厂类，此类已经比较成熟稳定，实现后应该封装到位，不建
 * 议轻易修改。"
 *
 * @author Hutu
 * @since 2024-07-09 下午 09:20
 */
public class FactoryBasic implements IFactory {
    @Override
    public Operation createOperate(String operate) {
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
