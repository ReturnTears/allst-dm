package com.allst.dm.decor;

/**
 * @author Hutu
 * @since 2022-10-24 下午 09:34
 */
public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底【");
        showable.show();
        System.out.print("】");
    }
}
