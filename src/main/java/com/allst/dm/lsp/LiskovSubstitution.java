package com.allst.dm.lsp;

/**
 * 里斯替换原则
 *
 * @author YiYa
 * @since 2020-02-25 上午 11:01
 */
public class LiskovSubstitution {

    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println("22 - 17 = " + aa.funcOne(22, 17));
        System.out.println("13 - 17 = " + aa.funcOne(22, 17));

        BB b = new BB();
        //因为B类不再继承A类，因此调用者，不会再func1是求减法
        //调用完成的功能就会很明确
        System.out.println("11 + 3 = " + b.funcOne(11, 3));//这里本意是求出11+3
        System.out.println("1 + 8 = " + b.funcOne(1, 8));// 1+8
        System.out.println("11 + 3 + 9 = " + b.funcTwo(11, 3));

        //使用组合仍然可以使用到A类相关方法
        System.out.println("11 - 3 = " + b.funcThree(11, 3));// 这里本意是求出11-3
    }

}

/**
 * 基础的基类， 基础方法和成员写在Base类中
 */
class Base {

}

/**
 * AA 类继承Base
 */
class AA extends Base {
    public int funcOne(int n1, int n2) {
        if (n1 > n2) {
            return n1 - n2;
        } else {
            return n2 - n1;
        }
    }
}

/**
 * BB 类继承Base
 */
class BB extends Base {
    private AA aa = new AA();

    public int funcOne(int n1, int n2) {
        return n1 + n2;
    }

    public int funcTwo(int n1, int n2) {
        return funcOne(n1, n2) + 9;
    }

    public int funcThree(int n1, int n2) {
        return this.aa.funcOne(n1, n2);
    }
}