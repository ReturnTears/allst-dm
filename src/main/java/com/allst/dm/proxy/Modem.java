package com.allst.dm.proxy;

import cn.hutool.core.util.StrUtil;

/**
 * 调制解调器Modem
 *
 * @author Hutu
 * @since 2022-11-13 下午 03:44
 */
public class Modem implements Internet {

    public Modem(String password) throws Exception {
        if (!StrUtil.equals("123456", password)) {
            throw new Exception("拨号失败,请重试!");
        }
        System.out.println("拨号上网......连接成功!");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问: " + url);
    }
}
