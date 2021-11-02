package com.hubilo.common_functions;

import com.hubilo.configuration.ConfigPropertiesReader;


public interface Path {
    String projectPath = System.getProperty("user.dir");
    String reportPath = projectPath+ConfigPropertiesReader.REPORT_FILE_PATH;
    String screenshotPath = projectPath+"/screenshot/";

}
