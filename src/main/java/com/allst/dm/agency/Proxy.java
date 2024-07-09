package com.allst.dm.agency;

/**
 * Proxy类，保存一个引用使得代理可以访问实体，并提供一个与Subject
 * 的接口相同的方法，这样代理就可以用来替代实体。
 *
 * @author Hutu
 * @since 2024-07-09 下午 08:43
 */
public class Proxy implements ISubject {
    private final RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    /**
     * 预处理
     */
    public void preRequest() {
        System.out.println("预处理前");
    }

    /**
     * 预处理
     */
    public void postRequest() {
        System.out.println("预处理后");
    }

    /**
     * 预处理
     */
    @Override
    public void request() {
        this.preRequest();
        this.realSubject.request();
        this.postRequest();
    }
}
