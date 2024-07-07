package com.allst.dm.simple_factory;

import lombok.Getter;

/**
 * @author Hutu
 * @since 2024-07-07 上午 10:53
 */
public enum CashEnum {
    NORMAL(1, "正常收费", new CashNormal()),
    RETURN(2, "满减收费", new CashReturn(300, 100)),
    REBATE(3, "打折收费", new CashRebate(0.8));

    private Integer type;
    private String desc;
    private CashSuper cashSuper;

    CashEnum(Integer type, String desc, CashSuper cashSuper) {
        this.type = type;
        this.desc = desc;
        this.cashSuper = cashSuper;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public CashSuper getCashSuper() {
        return cashSuper;
    }
}
