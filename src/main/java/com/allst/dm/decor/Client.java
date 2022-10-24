package com.allst.dm.decor;

/**
 * @author Hutu
 * @since 2022-10-24 下午 09:28
 */
public class Client {
    public static void main(String[] args) {
        // new Decorator(new Girl()).show();
        Showable madeupGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeupGirl.show();
    }
}
