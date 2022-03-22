package com.allst.dm.sp;

import com.allst.dm.sp.fowl.Duck;
import com.allst.dm.sp.fowl.GreenHeadDuck;
import com.allst.dm.sp.fowl.RedHeadDuck;

/**
 *
 * @author June
 * @since 2022年03月
 */
public class SpMaster {
    public static void main(String[] args) {
        Duck mGreenHeadDuck = new GreenHeadDuck();
        Duck mRedHeadDuck = new RedHeadDuck();

        mGreenHeadDuck.display();
        mGreenHeadDuck.Fly();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();

        mRedHeadDuck.display();
        mRedHeadDuck.Fly();
        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
    }
}
