package com.allst.dm.dip;

/**
 * 依赖倒转原则
 * @author YiYa
 * @since 2020-02-25 上午 12:38
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Personal personal = new Personal();
        personal.receive(new Message());
        personal.receive(new WeChat());
    }

}
// 定义接口
interface IReceiver {
    String getInfo();
}

class Message implements IReceiver {

    @Override
    public String getInfo() {
        return "get Message info~~~";
    }
}
class WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "get WeChat info~~~";
    }
}

class Personal {
    // 这里我们是对接口的依赖
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}