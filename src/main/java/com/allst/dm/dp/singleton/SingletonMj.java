package com.allst.dm.dp.singleton;

/**
 * 单例模式之一 ~~ 枚举
 * 使用枚举实现单例不能能避免多线程同步问题, 而且还能防止反序列化重新创建新的对象
 * 推荐使用
 *
 * @author YiYa
 * @since 2020-03-03 上午 12:21
 */
public class SingletonMj {

    public static void main(String[] args) {
        Singleton7 instancce1 = Singleton7.INSTANCCE;
        Singleton7 instancce2 = Singleton7.INSTANCCE;
        // System.out.println(instancce1 == instancce2);
        System.out.println(instancce1.hashCode());
        System.out.println(instancce2.hashCode());
    }

}

/**
 * 枚举可以实现单例
 */
enum Singleton7 {
    INSTANCCE;

    public void sayOk() {
        System.out.println("ok~~~");
    }
}