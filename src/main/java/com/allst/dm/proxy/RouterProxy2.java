package com.allst.dm.proxy;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 路由器
 *
 * @author Hutu
 * @since 2022-11-13 下午 04:02
 */
public class RouterProxy2 implements Internet {

    private final Internet modem; // 被代理对象

    public RouterProxy2() throws Exception {
        this.modem = new Modem("123456"); // 实例化被代理对象
    }

    @Override
    public void httpAccess(String url) {
        modem.httpAccess(url); // 转发请求至“光猫”以访问互联网
    }
}
