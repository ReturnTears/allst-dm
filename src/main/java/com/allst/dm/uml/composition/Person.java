package com.allst.dm.uml.composition;

/**
 * @author YiYa
 * @since 2020-02-25 下午 09:10
 */
public class Person {
    // 人与身份证的关系是聚合
    private IDCard idCard;
    // 人与头的关系是组合
    private Head head = new Head();

}
