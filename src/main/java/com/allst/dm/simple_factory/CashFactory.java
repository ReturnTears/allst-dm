package com.allst.dm.simple_factory;

/**
 * @author Hutu
 * @since 2024-07-07 上午 10:52
 */
public class CashFactory {
    public static CashSuper createCashAccept(Integer type) {
        CashSuper cs = null;
        switch (type) {
            case 1:
                cs = new CashNormal();
                break;
            case 2:
                cs = new CashReturn(300, 100);
                break;
            case 3:
                cs = new CashRebate(0.8);
                break;
            default:
                break;
        }
        return cs;
   }
}
