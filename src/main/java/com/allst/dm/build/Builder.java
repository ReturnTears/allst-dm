package com.allst.dm.build;

/**
 * 建筑施工方Builder
 *
 * @author Hutu
 * @since 2022-10-13 下午 09:15
 */
public interface Builder {

    void buildBasement();

    void buildWall();

    void buildRoof();

    Building getBuilding();

}
