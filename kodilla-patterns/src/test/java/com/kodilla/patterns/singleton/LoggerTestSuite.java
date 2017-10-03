package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog(){
        //Given
        Logger newLogger = new Logger();

        //When
        String lastLog = newLogger.getLastLog();

        //Then
        Assert.assertEquals(lastLog,"");
    }

    @Test
    public void testLog(){
        //Given
        Logger newLogger = new Logger();

        //When
        newLogger.log("last log");

        //Then
    }

}
