package com.allst.dm.dp.factory;

/**
 * 工厂方法模式:
 * 本质是将对象的实例化过程推迟到子类
 *
 * @author June
 * @since 2021年07月
 */
public class FactoryMethod {
    public static void main(String... args) {
        Application application = new CreateProductB();
        Product product = application.getObject();
        product.methods();
    }
}

interface Product {
    void methods();
}

class ProductA implements Product {
    public void methods() {
        System.out.println("....ProductA exec methods1....");
    }
}

class ProductB implements Product {
    public void methods() {
        System.out.println("....ProductB exec methods1....");
    }
}

abstract class Application {
    abstract Product createProduct();
    Product getObject() {
        return createProduct();
    }
}

class CreateProductA extends Application{
    @Override
    Product createProduct() {
        // ...
        return new ProductA();
    }
}

class CreateProductB extends Application{
    @Override
    Product createProduct() {
        // ...
        return new ProductB();
    }
}