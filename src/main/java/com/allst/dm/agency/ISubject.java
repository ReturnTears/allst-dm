package com.allst.dm.agency;

/**
 * ISubject类，定义了RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy
 *
 * @author Hutu
 * @since 2024-07-09 下午 08:41
 */
public interface ISubject {
    void request();
}
