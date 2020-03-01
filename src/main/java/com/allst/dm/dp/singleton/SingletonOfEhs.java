package com.allst.dm.dp.singleton;

/**
 * 单例模式之一 ~~ 饿汉式
 * 优缺点:
 * 优点: 写法简单，在类装载的时候就完成实例化，避免了线程同步问题
 * 缺点: 在类装载的时候就完成实例化，没有达到lazy loading的效果，如果对象从始至终都没有使用过就会造成内存浪费
 *
 * @author YiYa
 * @since 2020-03-01 下午 11:19
 */
public class SingletonOfEhs {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        // System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

// 饿汉式(静态变量)
class Singleton {
    // 1、构造器私有， 外部能new
    private Singleton() {

    }
    // 2、本类内部创建对象实例
    private final static Singleton instance = new Singleton();
    // 3、提供一个公有的静态方法， 返回实例对象
    public static Singleton getInstance() {
        return instance;
    }

}