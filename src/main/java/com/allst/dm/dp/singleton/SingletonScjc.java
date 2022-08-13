package com.allst.dm.dp.singleton;

/**
 * 单例模式之一 ~~ 双重检查
 * 推荐使用
 *
 * @author YiYa
 * @since 2020-03-02 下午 11:49
 */
public class SingletonScjc {

    public static void main(String[] args) {
        Singleton5 singleton1 = Singleton5.getInstance();
        Singleton5 singleton2 = Singleton5.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

class Singleton5 {

    /**
     * volatile关键字可以操作系统可以对指令进行重排序，在多线程环境下保证线程安全
     */
    private static volatile Singleton5 instance;

    private Singleton5() {
    }

    /**
     * 提供了一个静态的公有方法，加入双重检查代码， 解决线程安全问题， 同时解决懒加载问题
     * 同时保证了效率， 强烈推荐使用
     *
     * @return instance
     */
    public static synchronized Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}