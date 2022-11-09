package com.allst.dm.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 图件工厂类
 *
 * @author Hutu
 * @since 2022-11-09 下午 09:03
 */
public class TileFactory {
    // 图库
    private final Map<String, Drawable> images;

    public TileFactory() {
        images = new HashMap<>();
    }

    public Drawable getDrawable(String image) {
        if (!images.containsKey(image)) {
            switch (image) {
                case "河流":
                    images.put(image, new River());
                    break;
                case "草地":
                    images.put(image, new Grass());
                    break;
                case "道路":
                    images.put(image, new Road());
                    break;
                case "房屋":
                    images.put(image, new House());
            }
        }
        return images.get(image);
    }
}
