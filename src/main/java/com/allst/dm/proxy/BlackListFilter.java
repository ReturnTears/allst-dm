package com.allst.dm.proxy;

import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 黑名单过滤器
 *
 * @author Hutu
 * @since 2022-11-13 下午 04:38
 */
public class BlackListFilter implements InvocationHandler {

    private final List<String> blackList = Lists.newArrayList("电影", "游戏", "音乐", "小说");

    private final Object origin; // 被代理的真实对象

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤功能......");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 切入“方法面”之前的过滤逻辑
        String arg = args[0].toString();
        for (String keyword : blackList) {
            if (StrUtil.contains(arg, keyword)) {
                System.out.println("禁止访问: " + arg);
                return null;
            }
        }
        System.out.println("校验通过，转向实际业务......");
        return method.invoke(origin, args);
    }
}
