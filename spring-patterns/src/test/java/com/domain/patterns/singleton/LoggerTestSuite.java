package com.domain.patterns.singleton;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mbaranowicz
 */
public class LoggerTestSuite {

    @BeforeClass
    public static void addLogMessage(){
        Logger.getInstance().log("First Log");
    }

    @Test
    public void testLastLog(){
        //Given
        //When

        String log = Logger.getInstance().getLastLog();
        //Then
        assertEquals("First Log",log);
    }
}
