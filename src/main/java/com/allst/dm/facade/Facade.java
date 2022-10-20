package com.allst.dm.facade;

/**
 * @author Hutu
 * @since 2022-10-20 下午 09:43
 */
public class Facade {

    private VegVendor vegVendor;

    private Chef chef;

    private Waiter waiter;

    private Cleanner cleanner;

    public Facade() {
        this.vegVendor = new VegVendor();
        vegVendor.purchase();

        this.chef = new Chef();

        this.waiter = new Waiter();

        this.cleanner = new Cleanner();
    }

    public void order() {
        waiter.order();;

        chef.cook();;

        waiter.serve();

        cleanner.wash();

        cleanner.clean();
    }

}
