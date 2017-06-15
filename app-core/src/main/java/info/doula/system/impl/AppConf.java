package info.doula.system.impl;

import java.util.HashMap;

/*
 * AppConf
 * This is the SingletonClass to fetch/make AppConfReader
 */
public class AppConf {
    static String defaultFilePath = "ConfigResources/app.properties";
    static String defaultMessageFilePath = "ConfigResources/app-msg.properties";
    static long defaultTimeoutMillisecond = 600000L;
    static HashMap<String, AppConfReader> confReaders = new HashMap<>();

    private AppConf() {
    }

    /**
     * Gets instance of AppConfReader for defaultFilePath
     *
     */
    static public AppConfReader getInstance() {
        return getInstance(defaultFilePath);
    }

    /**
     * Gets instance of AppConfReader for defaultFilePath
     *
     */
    static public AppConfReader getInstanceForMessages() {
        return getInstance(defaultMessageFilePath);
    }

    /**
     * Gets instance of AppConfReader for filePath
     *
     * @param filePath
     * @return
     */
    static public AppConfReader getInstance(String filePath) {
        return getInstance(filePath, defaultTimeoutMillisecond);
    }

    /**
     * Gets instance of AppConfReader for filePath with timeout
     *
     * @param filePath
     * @param timeoutMillisecond
     * @return
     */
    static public AppConfReader getInstance(String filePath, long timeoutMillisecond) {
        AppConfReader confReader = confReaders.get(filePath);
        if (confReader != null) {
            return confReader;
        }

        confReader = new AppConfReader(filePath, timeoutMillisecond);
        confReaders.put(filePath, confReader);
        return confReader;
    }
}
