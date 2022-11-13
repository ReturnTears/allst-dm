package com.allst.dm.proxy;

import java.lang.reflect.Proxy;

/**
 * 客户端
 *
 * @author Hutu
 * @since 2022-11-13 下午 04:20
 */
public class Client2 {
    public static void main(String[] args) throws Exception {
        // 访问互联网， 生成路由器代理
        Internet internet = (Internet) Proxy.newProxyInstance(RouterProxy2.class.getClassLoader(), RouterProxy2.class.getInterfaces(), new BlackListFilter(new RouterProxy2()));
        internet.httpAccess("http://www.电影.com");
        internet.httpAccess("http://www.游戏.com");
        internet.httpAccess("http://www.学习.com/java");
        internet.httpAccess("http://www.工作.com");

        // 访问局域网(内网)生成交换机代理
        Internet2 proxy = (Internet2) Proxy.newProxyInstance(Switch.class.getClassLoader(), Switch.class.getInterfaces(), new BlackListFilter(new Switch()));
        proxy.fileAccess("\\\\192.168.1.2\\共享\\电影\\IronHuman.mp4");
        proxy.fileAccess("\\\\192.168.1.2\\共享\\游戏\\Hero.exe");
        proxy.fileAccess("\\\\192.168.1.4\\shared\\Java学习资料.zip");
        proxy.fileAccess("\\\\192.168.1.6\\Java\\设计模式.doc");
    }
}
