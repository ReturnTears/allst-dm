package com.allst.dm.dp.singleton;

/**
 * 单例模式之一 ~~ 懒汉式2(线程安全)
 * 优缺点:
 * 优点: 解决了线程不安全问题
 * 缺点: 效率太低了, 在实际开发中不推荐使用
 *
 * @author YiYa
 * @since 2020-03-01 下午 11:41
 */
public class SingletonLhs2 {

    public static void main(String[] args) {
        Singleton4 singleton1 = Singleton4.getInstance();
        Singleton4 singleton2 = Singleton4.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }

}


// 懒汉式
class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    /**
     * 提供一个静态共有方法， 加入同步处理的代码 解决线程安全问题
     *
     * @return
     */
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}