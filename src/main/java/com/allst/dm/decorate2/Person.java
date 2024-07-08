package com.allst.dm.decorate2;

/**
 * ConcreteComponent
 *
 * @author Hutu
 * @since 2024-07-08 下午 08:29
 */
public class Person implements ICharacter {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}
