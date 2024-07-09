package com.allst.dm.agency;

/**
 * RealSubject类，定义Proxy所代表的真实实体
 *
 * @author Hutu
 * @since 2024-07-09 下午 08:42
 */
public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("RealSubject.request()");
    }
}
