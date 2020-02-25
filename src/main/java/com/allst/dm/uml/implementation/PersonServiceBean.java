package com.allst.dm.uml.implementation;

/**
 * @author YiYa
 * @since 2020-02-25 下午 06:29
 */
public class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) {
        System.out.println("PersonService~~~");
    }
}
