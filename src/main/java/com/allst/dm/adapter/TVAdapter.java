package com.allst.dm.adapter;

/**
 * 电视机专属适配器类
 *
 * @author Hutu
 * @since 2022-10-25 下午 09:41
 */
public class TVAdapter extends TV implements TriplePin {
    @Override
    public void electrify(int l, int n, int e) {
        // 利用“super”关键字调用父类（电视机类TV）定义的两插通电方法，以实现适配
        super.electrify(l, n);
    }
}
