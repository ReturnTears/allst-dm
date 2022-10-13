package com.allst.dm.build;

/**
 * 别墅施工方类HouseBuilder
 *
 * @author Hutu
 * @since 2022-10-13 下午 09:17
 */
public class ApartmentBuilder implements Builder {

    private final Building apartment;

    public ApartmentBuilder() {
        this.apartment = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("挖地基、修建地下车库、部署管道、线缆、风道.");
        apartment.setBasement("|-----------------|\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建多层建筑框架、建造电梯井、钢筋混凝土浇灌.");
        for (int i = 0; i < 8; i++) {
            apartment.setWall("|口口口口口口口口口口|\n");
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("封顶、部署通风机、做好防水、保温层.");
        apartment.setRoof("|-----------------|");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}
