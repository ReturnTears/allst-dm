package com.allst.dm.singler;

/**
 * 单一职责
 *
 * @author YiYa
 * @since 2020-02-24 下午 10:32
 */
public class SingleResponsibilityPrinciple1 {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.carRun("Car");
        v.flyRun("Fly");
    }

}

/**
 * 交通工具类
 */
class Vehicle {
    public void carRun(String vehicle) {
        System.out.println(vehicle + " is running...~~~");
    }

    public void flyRun(String vehicle) {
        System.out.println(vehicle + " is flying...~~~");
    }
}