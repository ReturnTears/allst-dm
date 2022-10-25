package com.allst.dm.adapter;

/**
 * @author Hutu
 * @since 2022-10-25 下午 09:32
 */
public class TV implements DualPin {
    @Override
    public void electrify(int l, int n) {
        System.out.print(String.format("火线通电:%d,零线通电:%d", l, n));
        System.out.println("电视开机");
    }
}
