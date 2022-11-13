package com.allst.dm.proxy;

/**
 * 客户端
 *
 * @author Hutu
 * @since 2022-11-13 下午 04:20
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Internet proxy = new RouterProxy(); // 实例化的是代理
        proxy.httpAccess("http://www.电影.com");
        proxy.httpAccess("http://www.游戏.com");
        proxy.httpAccess("http://www.学习.com/java");
        proxy.httpAccess("http://www.工作.com");
    }
}
