package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //given
        Logger.getInstance().log("Test log");
        //when
        Logger.getInstance().getLastLog();
        //then
        Assert.assertEquals("Test log", Logger.getInstance().getLastLog());
    }
}
