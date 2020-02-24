package com.allst.dm.singler;

/**
 * 单一职责
 * 单一职责原则：对类来说，即一个类应该只负责一项职责
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
 * 交通工具类，这里虽然没有在类级别上遵守单一职责原则，但是在方法级别上仍然遵守单一职责原则
 */
class Vehicle {
    public void carRun(String vehicle) {
        System.out.println(vehicle + " is running...~~~");
    }

    public void flyRun(String vehicle) {
        System.out.println(vehicle + " is flying...~~~");
    }
}