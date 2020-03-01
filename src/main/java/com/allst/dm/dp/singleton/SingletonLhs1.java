package com.allst.dm.dp.singleton;

/**
 * 单例模式之一 ~~ 懒汉式1(线程不安全)
 * 在实际开发中不能使用这种方式
 *
 * @author YiYa
 * @since 2020-03-01 下午 11:36
 */
public class SingletonLhs1 {

    public static void main(String[] args) {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

// 懒汉式
class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}