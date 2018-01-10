package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void firstLog(){
        Logger.getInstance().log("getup");
    }
    @Test
    public static void testLog(){
        //Given
        //When
        String logger = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("getup", logger);
    }
}
