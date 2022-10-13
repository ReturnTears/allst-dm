package com.allst.dm.build;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 建筑物类Building
 * 包含：
 * 地基
 * 墙体
 * 屋顶
 * 将它们组装起来就能形成一座建筑物
 *
 * @author Hutu
 * @since 2022-10-12 下午 10:10
 */
public class Building {
    // 使用List来模拟建筑物组件的组装
    private final List<String> buildingComponents = Lists.newArrayList();

    // 地基
    public void setBasement(String basement) {
        this.buildingComponents.add(basement);
    }

    // 墙体
    public void setWall(String wall) {
        this.buildingComponents.add(wall);
    }

    // 屋顶
    public void setRoof(String roof) {
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        StringBuilder buildingStr = new StringBuilder();
        for (int i = buildingComponents.size() - 1; i >= 0; i--) {
            buildingStr.append(buildingComponents.get(i));
        }
        return buildingStr.toString();
    }
}
