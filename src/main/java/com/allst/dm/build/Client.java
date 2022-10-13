package com.allst.dm.build;

/**
 * @author Hutu
 * @since 2022-10-13 下午 09:37
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());

        director = new Director(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
