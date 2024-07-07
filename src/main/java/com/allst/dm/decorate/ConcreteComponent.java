package com.allst.dm.decorate;

/**
 * @author Hutu
 * @since 2024-07-07 下午 10:18
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent : 具体对象的实际操作 ! ");
    }
}
