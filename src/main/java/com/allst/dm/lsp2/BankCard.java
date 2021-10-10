package com.allst.dm.lsp2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 模拟储蓄卡功能
 *
 * @author June
 * @since 2021年09月
 */
public abstract class BankCard {

    private static final Logger logger = LoggerFactory.getLogger(BankCard.class);

    private final String cardNo;

    private final String cardDate;

    public String getCardNo() {
        return cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    /**
     * 正向转账-入账，加钱
     *
     * @param orderId 订单id
     * @param amount 金额
     * @return 结果
     */
    public String positive(String orderId, BigDecimal amount) {
        logger.info("卡号{}入账成功，订单：{}， 数量：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 逆向转账-出账，减钱
     *
     * @param orderId 订单id
     * @param amount 金额
     * @return 结果
     */
    public String negative(String orderId, BigDecimal amount) {
        logger.info("卡号{}出账成功，订单：{}， 数量：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 交易流水
     *
     * @return 结果
     */
    public List<String> tradeFlow() {
        logger.info("交易流水查询...");
        List<String> list = new ArrayList<>();
        list.add("100001,1000.12");
        list.add("100002,1000.23");
        list.add("100003,1000.34");
        list.add("100004,1000.45");
        return list;
    }
}
