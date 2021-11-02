package com.hubilo.configuration;

import java.util.ResourceBundle;

public interface Locators {
    public static String FILE_PATH_OF_CONFIGURATION_PROPERTIES = "locators";
    public static ResourceBundle RESOURCE_BUNDLE= ResourceBundle.getBundle(FILE_PATH_OF_CONFIGURATION_PROPERTIES);
}
