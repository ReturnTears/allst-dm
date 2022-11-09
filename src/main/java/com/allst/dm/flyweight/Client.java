package com.allst.dm.flyweight;

/**
 * 享元模式的运用让程序运行更加流畅，地图加载再也不会出现卡顿现象了，
 * 加载图片时的I/O流操作所导致的CPU效率及内存占用的问题同时得以解决，游戏体验得以提升和改善。
 * 享元模式让图件对象将可共享的内蕴状态“图片”维护起来，将外蕴状态“坐标”抽离出去并定义于接口参数中，
 * 基于此，享元工厂便可以顺利将图件对象共享，以供外部随时使用。
 *
 * @author Hutu
 * @since 2022-11-01 下午 10:27
 */
public class Client {
    public static void main(String[] args) {
        newClient();
    }

    private static void oldClient() {
        new Tile("河流", 10, 10).draw();
        new Tile("河流", 10, 20).draw();
        new Tile("道路", 10, 30).draw();
        new Tile("草地", 10, 40).draw();
        new Tile("草地", 10, 50).draw();
        new Tile("草地", 10, 60).draw();
        new Tile("草地", 10, 70).draw();
        new Tile("草地", 10, 80).draw();
        new Tile("道路", 10, 90).draw();
        new Tile("道路", 10, 100).draw();
    }

    /**
     * 弃了利用“new”关键字随意制造对象的方法，改用这个图件工厂类来构建并共享图件元，
     * 外部需要什么图件直接向图件工厂索要即可
     */
    private static void newClient() {
        TileFactory factory = new TileFactory();
        factory.getDrawable("河流").draw(10, 10);
        factory.getDrawable("河流").draw(10, 20);
        factory.getDrawable("道路").draw(10, 30);
        factory.getDrawable("草地").draw(10, 40);
        factory.getDrawable("草地").draw(10, 50);
        factory.getDrawable("草地").draw(10, 60);
        factory.getDrawable("草地").draw(10, 70);
        factory.getDrawable("草地").draw(10, 80);
        factory.getDrawable("道路").draw(10, 90);
        factory.getDrawable("道路").draw(10, 100);

        factory.getDrawable("房屋").draw(10, 10);
        factory.getDrawable("房屋").draw(10, 50);
    }
}
