package com.allst.dm.dp.singleton;

/**
 * 懒汉模式
 *
 * @author June
 * @since 2021年07月
 */
public class LazySingleton {
    public static void main(String... args) {
        // 单线程下执行是线程安全的
        /*LazySingletonData instance1 = LazySingletonData.getInstance();
        LazySingletonData instance2 = LazySingletonData.getInstance();
        System.out.println(instance1 == instance2);*/
        // 多线程请胯下是不安全的， 会创建多个实例
        new Thread(() -> {
            LazySingletonData instance1 = LazySingletonData.getInstance();
            System.out.println(instance1);
        }).start();
        new Thread(() -> {
            LazySingletonData instancce2 = LazySingletonData.getInstance();
            System.out.println(instancce2);
        }).start();

    }
}

class LazySingletonData {
    private volatile static LazySingletonData instance;

    private LazySingletonData() { }

    public static LazySingletonData getInstance() {
        if (instance == null) {
            synchronized (LazySingletonData.class) {
                if (instance == null) {
                    instance = new LazySingletonData();
                    // 字节码层面
                    // JIT, CPU
                    // 1、分配空间
                    // 2、初始化
                    // 3、引用赋值
                }
            }
        }
        return instance;
    }
}