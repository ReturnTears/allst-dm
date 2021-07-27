package com.allst.dm.dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 枚举
 *
 * @author June
 * @since 2021年07月
 */
public enum EnumSingleton {
    INSTANCE;
    public void print() {
        System.out.println(this.hashCode());
    }
}

class EnumData {
    public static void main(String... args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton instance = declaredConstructor.newInstance("INSTANCE", 0);
        System.out.println(instance);
    }
}