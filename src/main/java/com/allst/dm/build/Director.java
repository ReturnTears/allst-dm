package com.allst.dm.build;

/**
 * 工程总监类Director
 *
 * @author Hutu
 * @since 2022-10-13 下午 09:34
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Building direct() {
        System.out.println("============工程项目启动============");
        // 第一步：打好地基
        builder.buildBasement();
        // 第二部：建造框架、墙体
        builder.buildWall();
        // 第三步，封顶
        builder.buildRoof();
        System.out.println("============工程项目竣工============");

        return builder.getBuilding();
    }
}
