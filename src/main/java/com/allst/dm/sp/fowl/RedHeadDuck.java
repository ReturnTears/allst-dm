package com.allst.dm.sp.fowl;

import com.allst.dm.sp.flybehavior.GoodFlyBehavior;
import com.allst.dm.sp.quackbehavior.GaGaQuackBehavior;

/**
 * @author June
 * @since 2022-03-22
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("**RedHead**");
    }
}
