package com.allst.dm.dp.singleton;

/**
 * 单例模式之一 ~~ 饿汉式2(静态代码块)
 * 优缺点:
 * 优点:
 * 缺点:
 *
 * @author YiYa
 * @since 2020-03-01 下午 11:32
 */
public class SingletonOfEhs2 {

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

// 饿汉式(静态代码块)
class Singleton2 {
    // 1、构造器私有， 外部能new
    private Singleton2() {

    }

    // 2、本类内部创建对象实例
    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    // 3、提供一个公有的静态方法， 返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }

}