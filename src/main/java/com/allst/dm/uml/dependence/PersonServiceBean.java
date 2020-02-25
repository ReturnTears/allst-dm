package com.allst.dm.uml.dependence;

import com.allst.dm.uml.Person;

/**
 * 只要是在类中用到了对方， 那么它们之间就存在依赖关系。如果没有对方， 连编译都过不了
 * 小结：
 * 1、类中用到了对方
 * 2、如果是类的成员属性
 * 3、如果是方法的返回类型
 * 4、是方法接收的参数类型
 * 5、方法中使用到
 *
 * @author YiYa
 * @since 2020-02-25 下午 06:15
 */
public class PersonServiceBean {

    private PersonDao personDao;
    public void save(Person person) {

    }
    public IDCard getIDCard(Integer personId) {
        return null;
    }
    public void modify() {
        Department department = new Department();
    }

}
