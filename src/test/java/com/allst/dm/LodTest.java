package com.allst.dm;

import com.alibaba.fastjson.JSON;
import com.allst.dm.lod.Principal;
import org.junit.Test;

import java.util.Map;

/**
 * @author June
 * @since 2021年10月
 */
public class LodTest {
    @Test
    public void lodTest1() {
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo("4-1班");
        System.out.println("查询结果: " + JSON.toJSONString(map));
    }
}
