package com.allst.dm.dp.facade;

/**
 * 门面模式
 *
 * @author June
 * @since 2021年07月
 */
public class Facade {
    public static void main(String... args) {
        Client1 client1 = new Client1();
        client1.doSomething1();
    }
}

class FacadeData {
    SubSystem1 subSystem1 = new SubSystem1();
    SubSystem2 subSystem2 = new SubSystem2();
    SubSystem3 subSystem3 = new SubSystem3();
    public void doSomethingFacade() {
        subSystem1.methods1();
        subSystem2.methods2();
        subSystem3.methods3();
    }
}

class Client1 {
    FacadeData facade = new FacadeData();
    public void doSomething1() {
        facade.doSomethingFacade();
    }
}

class Client2 {
    FacadeData facade = new FacadeData();
    public void doSomething2() {
        facade.doSomethingFacade();
    }
}

class SubSystem1 {
    public void methods1() {
        System.out.println("SubSystem1...methods1...");
    }
}

class SubSystem2 {
    public void methods2() {
        System.out.println("SubSystem2...methods2...");
    }
}

class SubSystem3 {
    public void methods3() {
        System.out.println("SubSystem3...methods3...");
    }
}
