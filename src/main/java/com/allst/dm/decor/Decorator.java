package com.allst.dm.decor;

/**
 * @author Hutu
 * @since 2022-10-24 下午 09:26
 */
public abstract class Decorator implements Showable {

    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        System.out.print("粉饰【");
        showable.show();
        System.out.print("】");
    }
}
