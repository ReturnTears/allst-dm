package com.allst.dm.lsp2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 模拟储蓄卡
 * 这样的实现方式满足了里氏替换的基本原则，既实现抽象类的抽象方法，又没有破坏父类中的原有方法
 *
 * @author June
 * @since 2021年10月
 */
public class CashCard extends BankCard {

    private static final Logger logger = LoggerFactory.getLogger(CashCard.class);

    /**
     * 必须显示定义该构造器
     */
    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    /**
     * 过滤规则， 储蓄卡默认直接通过
     */
    @Override
    boolean rule(BigDecimal amount) {
        return false;
    }

    /**
     * 提现
     *
     * @param orderId 订单id
     * @param amount  金额
     *
     * @return 结果
     */
    public String withdrawal(String orderId, BigDecimal amount) {
        logger.info("提现成功，订单：{}， 数量：{}", orderId, amount);
        System.out.printf("提现成功，订单：%s， 数量：%s%n", orderId, amount);// %n 换行符
        return super.positive(orderId, amount);
    }

    /**
     * 存储
     *
     * @param orderId 订单id
     * @param amount  金额
     *
     * @return 结果
     */
    public String recharge(String orderId, BigDecimal amount) {
        logger.info("存储成功，订单：{}， 数量：{}", orderId, amount);
        System.out.printf("存储成功，订单：%s， 数量：%s%n", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 风控校验
     *
     * @param cardNo  卡号
     * @param orderId 订单id
     * @param amount  金额
     *
     * @return 结果
     */
    public boolean checkRisk(String cardNo, String orderId, BigDecimal amount) {
        logger.info("风控校验, 卡号：{}，订单：{}， 数量：{}", cardNo, orderId, amount);
        System.out.printf("风控校验, 卡号：%s，订单：%s， 数量：%s%n", cardNo, orderId, amount);
        return true;
    }
}
