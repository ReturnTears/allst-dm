package com.allst.dm.proxy;

/**
 * @author Hutu
 * @since 2022-11-13 下午 04:33
 */
public class Switch implements Internet2 {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网:" + path);
    }
}
