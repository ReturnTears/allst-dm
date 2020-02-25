package com.allst.dm.uml.aggregate;

/**
 * @author YiYa
 * @since 2020-02-25 下午 09:00
 */
public class Computer {

    private Mouse mouse;
    private Monitor monitor;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
