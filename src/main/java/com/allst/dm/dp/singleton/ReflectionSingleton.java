package com.allst.dm.dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射创建类的实例
 * 使用类的加载机制(饿汉模式，静态内部类)可以抵御来自类的反射攻击
 *
 * @author June
 * @since 2021年07月
 */
public class ReflectionSingleton {
    public static void main(String... args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<InnerClassSingletonData> declaredConstructor = InnerClassSingletonData.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        InnerClassSingletonData innerClassSingletonData = declaredConstructor.newInstance();
        InnerClassSingletonData instance = InnerClassSingletonData.getInstance();
        System.out.println(innerClassSingletonData == instance);
    }
}
