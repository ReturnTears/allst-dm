package com.allst.dm.combat.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

/**
 * @author Hutu
 * @since 2024-05-10 下午 10:26
 */
@Service
public class Client {
    // 方式1
    /*private Parser jsonParser, xmlParser;
    @Autowired
    public Client(Parser jsonParser, Parser xmlParser) {
        this.jsonParser = jsonParser;
        this.xmlParser = xmlParser;
    }

    public List<String> getAll(ContentType contentType) {
        Reader reader = null;
        switch (contentType) {
            case JSON:
                return jsonParser.parse(reader);
            case XML:
                return xmlParser.parse(reader);
            default:
                throw new IllegalArgumentException("Invalid content type");
        }
    }*/

    // 方式2
    @Autowired
    private ParserFactory parserFactory;

    public List<String> getAll(ContentType contentType) {
        Reader reader = null;
        return parserFactory.getParser(contentType).parse(reader);
    }

}
