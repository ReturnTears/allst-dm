package com.allst.dm.lsp2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 模拟信用卡
 *
 * @author June
 * @since 2021年10月
 */
public class CreditCard extends CashCard {

    private static final Logger logger = LoggerFactory.getLogger(CreditCard.class);

    /**
     * 必须显示定义该构造器
     */
    public CreditCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    /**
     * 自定义过滤规则
     */
    boolean rule2(BigDecimal amount) {
        return amount.compareTo(new BigDecimal(1000)) <= 0;
    }

    /**
     * 取现
     *
     * @param orderId 订单id
     * @param amount  金额
     *
     * @return 结果
     */
    public String loan(String orderId, BigDecimal amount) {
        boolean rule = rule2(amount);
        if (rule) {
            logger.info("取现失败,订单：{}， 金额：{}", orderId, amount);
            System.out.printf("取现失败，订单：%s， 数量：%s%n", orderId, amount);
            return "0001";
        }
        // 模拟生成贷款单
        logger.info("生成贷款号，单号：{}, 金额：{}", orderId, amount);
        System.out.printf("生成贷款号，订单：%s， 数量：%s%n", orderId, amount);
        // 模拟支付成功
        logger.info("贷款成功，单号：{}，金额：{}", orderId, amount);
        System.out.printf("贷款成功，订单：%s， 数量：%s%n", orderId, amount);
        return super.negative(orderId, amount);
    }

    /**
     * 还款
     *
     * @param orderId 订单id
     * @param amount  金额
     *
     * @return 结果
     */
    public String repayment(String orderId, BigDecimal amount) {
        // 模拟生成还款单
        logger.info("生成还款号，单号：{}, 金额：{}", orderId, amount);
        System.out.printf("生成还款号，订单：%s， 数量：%s%n", orderId, amount);
        // 模拟还款成功
        logger.info("还款成功，单号：{}，金额：{}", orderId, amount);
        System.out.printf("还款成功，订单：%s， 数量：%s%n", orderId, amount);
        return super.positive(orderId, amount);
    }
}
