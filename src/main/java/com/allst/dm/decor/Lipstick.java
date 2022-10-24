package com.allst.dm.decor;

/**
 * @author Hutu
 * @since 2022-10-24 下午 09:35
 */
public class Lipstick extends Decorator {
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红【");
        showable.show();
        System.out.print("】");
    }
}
