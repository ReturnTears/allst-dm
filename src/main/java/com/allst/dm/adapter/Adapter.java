package com.allst.dm.adapter;

/**
 * 对象适配器
 *
 * @author Hutu
 * @since 2022-10-25 下午 09:35
 */
public class Adapter implements TriplePin {

    private final DualPin dualPin;

    public Adapter(DualPin dualPin) {
        this.dualPin = dualPin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPin.electrify(l, n);
    }
}
