package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-06 下午 11:02
 */
public class OperClient {
    public static void main(String[] args) {
        Operation operation = OperFactory.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult(10, 20));

        Operation oper = OperNewFactory.createOperate("pow");
        oper.setNumberA(1);
        oper.setNumberB(2);
        System.out.println(oper.getResult(2, 4));
    }
}
