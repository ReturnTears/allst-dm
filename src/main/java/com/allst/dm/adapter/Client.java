package com.allst.dm.adapter;

/**
 * 客户端类Client
 *
 * @author Hutu
 * @since 2022-10-25 下午 09:34
 */
public class Client {
    public static void main(String[] args) {
        DualPin dualPin = new TV();
        TriplePin triplePin = new Adapter(dualPin);
        triplePin.electrify(1, 0, -1);

        TriplePin tvAdapter = new TVAdapter();
        tvAdapter.electrify(1, 0, -1);
    }
}
