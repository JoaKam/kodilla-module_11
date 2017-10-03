package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals(lastLog, "");
    }

    @Test
    public void testLog() {
        //Given
        //When
        Logger.getInstance().log("last log");

        //Then
    }

}
