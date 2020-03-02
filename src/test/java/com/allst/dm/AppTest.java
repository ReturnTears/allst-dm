package com.allst.dm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * 测试JVM中的单例模式
     */
    @Test
    public void testJVMSingleton() {
        // Runtime运用了单例模式 - 懒汉式
        Runtime.getRuntime();
    }
}
