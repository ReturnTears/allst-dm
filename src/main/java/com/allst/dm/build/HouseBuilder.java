package com.allst.dm.build;

/**
 * 别墅施工方类HouseBuilder
 *
 * @author Hutu
 * @since 2022-10-13 下午 09:17
 */
public class HouseBuilder implements Builder {

    private final Building house;

    public HouseBuilder() {
        this.house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("挖土方、部署管道、线缆、水泥加固、搭建围墙、花园.");
        house.setBasement("-||-||-||-||-||-");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建木制框架、石膏板粉墙并粉饰内外墙.");
        house.setWall("|田|田|田|田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("建造木制屋顶、楼阁、安装烟囱、做好防水.");
        house.setRoof("/♦♦♦♦♦♦♦♦♦♦♦♦♦\n");
    }

    @Override
    public Building getBuilding() {
        return house;
    }
}
