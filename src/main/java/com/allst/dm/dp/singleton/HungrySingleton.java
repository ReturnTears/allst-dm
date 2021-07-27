package com.allst.dm.dp.singleton;

/**
 * 饿汉模式
 *
 * @author June
 * @since 2021年07月
 */
public class HungrySingleton {
    public static void main(String... args) {
        HungrySingletonData instance1 = HungrySingletonData.getInstance();
        HungrySingletonData instance2 = HungrySingletonData.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class HungrySingletonData {
    private static HungrySingletonData instance = new HungrySingletonData();
    private HungrySingletonData() {}
    public static HungrySingletonData getInstance() {
        return instance;
    }
}