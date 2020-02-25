package com.allst.dm.uml;

/**
 * UML Demo
 *
 * @author YiYa
 * @since 2020-02-25 下午 05:03
 */
public class Person {

    private Integer id;
    private String name;
    private Integer age = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
