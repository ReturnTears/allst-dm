package com.allst.dm.dp.singleton;

import java.io.*;

/**
 * 基于静态内部类单例模式
 *
 * @author June
 * @since 2021年07月
 */
public class InnerClassSingleton {
    public static void main(String... args) throws IOException, ClassNotFoundException {
        /*InnerClassSingletonData instance = InnerClassSingletonData.getInstance();
        InnerClassSingletonData instance2 = InnerClassSingletonData.getInstance();
        System.out.println(instance == instance2);*/

        /**
         * 将对象序列化到磁盘
         */
        /*InnerClassSingletonData2 instance = InnerClassSingletonData2.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("InnerClassSingletonData2"));
        oos.writeObject(instance);
        oos.close();*/

        /**
         * 将序列化对象反序列化
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("InnerClassSingletonData2"));
        InnerClassSingletonData2 object = (InnerClassSingletonData2) ois.readObject();

        InnerClassSingletonData2 instance = InnerClassSingletonData2.getInstance();
        // 比较反序列化出来的对象和我们直接获取的对象是否是同一个
        System.out.println(object == instance);
        // false: 说明反序列化破环了单例模式的实例化机制, 解决方法：添加readResolve()方法
    }
}

class InnerClassSingletonData {
    private static class InnerClassSingletonHelper {
        public static InnerClassSingletonData instance = new InnerClassSingletonData();
    }
    private InnerClassSingletonData() {
        // 可以防止反射对构造类对象的破坏
        if (InnerClassSingletonHelper.instance != null) {
            throw new RuntimeException("Singleton does not allow multiple instances ~");
        }
    }

    public static InnerClassSingletonData getInstance() {
        return InnerClassSingletonHelper.instance;
    }
}

/**
 * 需要将实例持久化
 */
class InnerClassSingletonData2 implements Serializable {
    static final long serialVersionUID = -7972177668134982031L;
    private static class InnerClassSingletonHelper {
        public static InnerClassSingletonData2 instance = new InnerClassSingletonData2();
    }
    private InnerClassSingletonData2() {
        if (InnerClassSingletonHelper.instance != null) {
            throw new RuntimeException("Singleton does not allow multiple instances ~");
        }
    }
    public static InnerClassSingletonData2 getInstance() {
        return InnerClassSingletonHelper.instance;
    }

    Object readResolve() throws ObjectStreamException {
        return InnerClassSingletonHelper.instance;
    }
}