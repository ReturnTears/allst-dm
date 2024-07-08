package com.allst.dm.decorate2;

/**
 * Decorator
 *
 * @author Hutu
 * @since 2024-07-08 下午 08:31
 */
public class Finery implements ICharacter {
    private ICharacter component;

    public void decorator(ICharacter component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (this.component != null) {
            this.component.show();
        }
    }
}
