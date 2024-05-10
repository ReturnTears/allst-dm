package com.allst.dm.combat.example1;

import java.io.Reader;
import java.util.List;

/**
 * 解析接口
 *
 * @author Hutu
 * @since 2024-05-10 下午 10:19
 */
public interface Parser {
    List<String> parse(Reader r);
}
