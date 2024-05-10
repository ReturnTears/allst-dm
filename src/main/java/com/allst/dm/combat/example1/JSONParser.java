package com.allst.dm.combat.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Reader;
import java.util.List;

/**
 * @author Hutu
 * @since 2024-05-10 下午 10:24
 */
@Component("JSON")
@Slf4j
public class JSONParser implements Parser {
    @Override
    public List<String> parse(Reader r) {
        log.info("Use JSON Parser...");
        return List.of("JSON");
    }
}
