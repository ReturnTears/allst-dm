package com.allst.dm;

import com.allst.dm.lsp2.CashCard;
import com.allst.dm.lsp2.CreditCard;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author June
 * @since 2021年10月
 */
public class LspTest {

    /**
     * 功能测试：储蓄卡
     */
    @Test
    public void bankTest1() {
        CashCard bankCard = new CashCard("9876543210123", "2020-11-11");
        // 提现
        bankCard.withdrawal("10001", new BigDecimal(100));
        // 储蓄
        bankCard.recharge("10001", new BigDecimal(100));
    }

    /**
     * 功能测试：信用卡
     */
    @Test
    public void bankTest2() {
        CreditCard bankCard = new CreditCard("9876543210123", "2020-11-11");
        // 提现
        bankCard.loan("10001", new BigDecimal(1000000));
        // 储蓄
        bankCard.repayment("10001", new BigDecimal(1000000));
    }

    /**
     * 功能测试：信用卡替换储蓄卡
     */
    @Test
    public void bankTest3() {
        CashCard bankCard = new CreditCard("9876543210123", "2020-11-11");
        // 提现
        bankCard.withdrawal("10001", new BigDecimal(100));
        // 储蓄
        bankCard.recharge("10001", new BigDecimal(100));
    }
}
