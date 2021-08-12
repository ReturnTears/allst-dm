package com.allst.dm.dp.decorator;

/**
 * @author June
 * @since 2021年08月
 */
public class Decorator {
    public static void main(String[] args) {
        /*Component component = new ConcreteComponent();
        component.operation();*/

        /*Component component = new ConreteDecrator(new ConcreteComponent());
        component.operation();*/

        Component component = new ConreteDecrator2(new ConreteDecrator(new ConcreteComponent()));
        component.operation();
    }
}

interface Component {
    void operation();
}

class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("-- photo -- ");
    }
}

abstract class Decorater implements Component {
    Component component;
    public Decorater(Component component) {
        this.component = component;
    }
}

class ConreteDecrator extends Decorater {
    public ConreteDecrator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("-- mei yan --");
        component.operation();
    }
}

class ConreteDecrator2 extends Decorater {
    public ConreteDecrator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("-- lv jin --");
        component.operation();
    }
}