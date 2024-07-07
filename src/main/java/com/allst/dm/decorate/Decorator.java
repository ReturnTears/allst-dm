package com.allst.dm.decorate;

/**
 * 装饰器抽象类
 *
 * @author Hutu
 * @since 2024-07-07 下午 10:19
 */
public abstract class Decorator extends Component {
    protected Component component;
    // 装饰一个Component对象
    public void setComponent(Component component) {
        this.component = component;
    }
    // 重写Operation，实际调用Component对象的Operation方法
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
