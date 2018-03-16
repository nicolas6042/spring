package com.domain.patterns.singleton;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author mbaranowicz
 */
public class SettingsFileEngineTestSuite {


    @BeforeClass
    public static void openSettingFile() {
        SettingFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingFile() {
        SettingFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = SettingFileEngine.getInstance().getFileName();
        System.out.println("Opened " + fileName);
        //Then
        assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = SettingFileEngine.getInstance().loadSetting();
        //Then
        assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = SettingFileEngine.getInstance().saveSetting();
        //Then
        assertTrue(result);
    }
}
