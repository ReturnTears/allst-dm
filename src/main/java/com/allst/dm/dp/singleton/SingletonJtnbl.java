package com.allst.dm.dp.singleton;

/**
 * 单例模式之一 ~~ 静态内部类
 * JVM类装载是线程安全的
 * 推荐使用
 *
 * @author YiYa
 * @since 2020-03-03 上午 12:10
 */
public class SingletonJtnbl {

    public static void main(String[] args) {
        Singleton6 singleton1 = Singleton6.getInstance();
        Singleton6 singleton2 = Singleton6.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton6 {
    private static volatile Singleton6 instance;

    public Singleton6() {
    }

    /**
     * 静态内部类， 该类中有一个静态属性INSTANCE
     * 这样写的优点是:当类Singleton6装载的时候，SingletonInstance不会马上执行
     */
    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    /**
     * 调用该方法时才会去执行SingletonInstance
     *
     * @return 结果
     */
    public static synchronized Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}