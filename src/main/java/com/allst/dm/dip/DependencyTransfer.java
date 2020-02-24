package com.allst.dm.dip;

/**
 * 依赖关系传递Dependency transfer
 * 依赖关系传递的三种方式
 * 1、接口传递
 * 2、构造器方法传递
 * 3、setter方法传递
 *
 * @author YiYa
 * @since 2020-02-25 上午 01:10
 */
public class DependencyTransfer {

    public static void main(String[] args) {
        // 方式1
        Gree gree = new Gree();
        // gree.play();
        OpenOrClose close = new OpenOrClose();
        close.open(gree);

        // 方式2
        Gree2 gree2 = new Gree2();
        OpenOrClose2 close2 = new OpenOrClose2(gree2);
        close2.open2();

        // 方式3
        Gree3 gree3 = new Gree3();
        OpenOrClose3 close3 = new OpenOrClose3();
        close3.setAirConditioner3(gree3);
        close3.open3();

    }

}

// ---------------------方式1-----------------------
// 空调接口
interface AirConditioner {
    void play();
}
// 打开或关闭接口
interface IOpenOrClose {
    // 抽象方法接收接口
    void open(AirConditioner air);
}
// 实现接口
class OpenOrClose implements IOpenOrClose {

    @Override
    public void open(AirConditioner air) {
        air.play();
    }
}

// 格力
class Gree implements AirConditioner {

    @Override
    public void play() {
        System.out.println("Gree is playing~~~");
    }
}

// ---------------------方式2-----------------------
// 空调接口
interface AirConditioner2 {
    void play2();
}
// 打开或关闭接口
interface IOpenOrClose2 {
    void open2();
}
// 实现接口
class OpenOrClose2 implements IOpenOrClose2 {
    // 成员
    public AirConditioner2 airConditioner2;
    // 构造器
    public OpenOrClose2(AirConditioner2 airConditioner2) {
        this.airConditioner2 = airConditioner2;
    }
    @Override
    public void open2() {
        this.airConditioner2.play2();
    }
}
// 格力
class Gree2 implements AirConditioner2 {

    @Override
    public void play2() {
        System.out.println("Gree2 is playing~~~");
    }
}

// ---------------------方式3-----------------------
// 空调接口
interface AirConditioner3 {
    void play3();
}
// 打开或关闭接口
interface IOpenOrClose3 {
    void open3();
}
class OpenOrClose3 implements IOpenOrClose3 {
    // 成员
    private AirConditioner3 airConditioner3;
    // setter方法
    public void setAirConditioner3(AirConditioner3 airConditioner3) {
        this.airConditioner3 = airConditioner3;
    }
    //
    @Override
    public void open3() {
        this.airConditioner3.play3();
    }
}
// 格力
class Gree3 implements AirConditioner3 {

    @Override
    public void play3() {
        System.out.println("Gree3 is playing~~~");
    }
}