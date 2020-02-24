package com.allst.dm.segregation;

/**
 * 隔离原则
 * 接口隔离原则：客户端不应该依赖它不需要的接口， 即一个类对另一个类的依赖应该建立在最小的接口上
 * @author YiYa
 * @since 2020-02-24 下午 10:50
 */
public class SegregationPrinciple1 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());     // A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());     // C类通过接口去依赖D类
        c.depend4(new D());
        c.depend5(new D());
    }

}

/**
 * 接口1
 */
interface Inter1 {
    void oper1();
}

/**
 * 接口2
 */
interface Inter2 {
    void oper2();
    void oper3();
}

/**
 * 接口3
 */
interface Inter3 {
    void oper4();
    void oper5();
}

/**
 * 类B实现接口1，接口2
 */
class B implements Inter1, Inter2 {

    @Override
    public void oper1() {
        System.out.println(this.getClass() + " `s method oper1");
    }

    @Override
    public void oper2() {
        System.out.println(this.getClass() + " `s method oper2");
    }

    @Override
    public void oper3() {
        System.out.println(this.getClass() + " `s method oper3");
    }
}

/**
 * 类D实现接口1，接口3
 */
class D implements Inter1, Inter3 {

    @Override
    public void oper1() {
        System.out.println(this.getClass() + " `s method oper1");
    }

    @Override
    public void oper4() {
        System.out.println(this.getClass() + " `s method oper4");
    }

    @Override
    public void oper5() {
        System.out.println(this.getClass() + " `s method oper5");
    }
}

/**
 * A类通过接口1，接口2依赖（使用）B类，但是只会用到1，2，3方法
 */
class A {
    public void depend1(Inter1 inter1) {
        inter1.oper1();
    }
    public void depend2(Inter2 inter2) {
        inter2.oper2();
    }
    public void depend3(Inter2 inter2) {
        inter2.oper3();
    }
}

/**
 * C类通过接口1，接口3依赖（使用）D类，但只会用到1，4，5方法
 */
class C {
    public void depend1(Inter1 inter1) {
        inter1.oper1();
    }
    public void depend4(Inter3 inter3) {
        inter3.oper4();
    }
    public void depend5(Inter3 inter3) {
        inter3.oper5();
    }
}