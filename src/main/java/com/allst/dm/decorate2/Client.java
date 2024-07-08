package com.allst.dm.decorate2;

/**
 * @author Hutu
 * @since 2024-07-08 下午 08:34
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("KangKang");
        TShirts tShirts = new TShirts();
        tShirts.decorator(person);
        tShirts.show();
    }
}
