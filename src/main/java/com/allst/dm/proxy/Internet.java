package com.allst.dm.proxy;

/**
 * 访问互联网的接口
 *
 * @author Hutu
 * @since 2022-11-13 下午 03:41
 */
public interface Internet {
    /**
     * 假设一个互联网访问协议
     *
     * @param url 地址
     */
    void httpAccess(String url);
}
