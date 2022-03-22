package com.allst.dm.sp.flybehavior;

/**
 * @author June
 * @since 2022-03-22
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--GoodFly--");
    }
}
