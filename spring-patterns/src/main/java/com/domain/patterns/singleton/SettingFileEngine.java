package com.domain.patterns.singleton;

/**
 * @author mbaranowicz
 */
public class SettingFileEngine {

    private static SettingFileEngine settingFileEngineInstance = null;
    private String fileName = "";

    private SettingFileEngine() {
    }

    public static SettingFileEngine getInstance() {
        if (settingFileEngineInstance == null) {
            settingFileEngineInstance = new SettingFileEngine();
        }
        return settingFileEngineInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(String fileName) {
        this.fileName = fileName;
        System.out.println("Opening setting file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing setting file");
    }

    public boolean loadSetting() {
        System.out.println("Loading setting from file");
        return true;
    }

    public boolean saveSetting() {
        System.out.println("Saving setting to file");
        return true;
    }
}
