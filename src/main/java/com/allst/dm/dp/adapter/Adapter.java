package com.allst.dm.dp.adapter;

/**
 * 适配器模式
 *
 * @author June
 * @since 2021年08月
 */
public class Adapter {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adaptor = new Adaptor(adaptee);
        int i = adaptor.output5v();
        System.out.println(i);
        System.out.println("-----------------------------------------");
        Adaptor2 adaptor2 = new Adaptor2();
        adaptor2.output5v();
    }
}

class Adaptee {
    public int output220v() {
        return 220;
    }
}

/**
 * 目标行为
 */
interface Target {
    int output5v();
}

/**
 * 对象适配器模式, 使用的是组合的关系
 */
class Adaptor implements Target {
    private Adaptee adaptee;
    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public int output5v() {
        final int output = 5;
        int i = adaptee.output220v();
        System.out.println(String.format("原始电压：%d -> 输出电压 %d", i, output));
        return output;
    }
}

/**
 * 类得适配器模式， 使用的继承的关系, 该模式对适配器的类造成很大的干扰， 很容易感染代码， Adaptor2对象的引用可以访问到继承对象的其他方法或属性
 */
class Adaptor2 extends Adaptee implements Target {
    @Override
    public int output5v() {
        final int output = 5;
        int i = output220v();
        System.out.println(String.format("原始电压：%d -> 输出电压 %d", i, output));
        return output;
    }
}