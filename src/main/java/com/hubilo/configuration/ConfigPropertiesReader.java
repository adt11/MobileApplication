package com.hubilo.configuration;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ResourceBundle;

public class ConfigPropertiesReader {

    public static final String FILE_PATH_OF_CONFIGURATION_PROPERTIES = "configuration";
    public static final ResourceBundle RESOURCE_BUNDLE= ResourceBundle.getBundle(FILE_PATH_OF_CONFIGURATION_PROPERTIES);
    public static String PLATFORM_TYPE = RESOURCE_BUNDLE.getString("PLATFORM_TYPE");
    public static String ANDROID_APP_VERSION= RESOURCE_BUNDLE.getString("ANDROID_APP_VERSION");
    public static String ANDROID_APP_FILE_NAME= RESOURCE_BUNDLE.getString("ANDROID_APP_FILE_NAME");
    public static String ANDROID_APP_PATH= RESOURCE_BUNDLE.getString("ANDROID_APP_PATH");
    public static String ANDROID_APP_PACKAGE= RESOURCE_BUNDLE.getString("ANDROID_APP_PACKAGE");
    public static String ANDROID_APP_ACTIVITY= RESOURCE_BUNDLE.getString("ANDROID_APP_ACTIVITY");
    public static String ANDROID_APP_DOWNLOAD_URL= RESOURCE_BUNDLE.getString("ANDROID_APP_DOWNLOAD_URL");
    public static String ANDROID_HOME= RESOURCE_BUNDLE.getString("ANDROID_HOME");
    public static String ADB_PATH= RESOURCE_BUNDLE.getString("ADB_PATH");
    public static String ANDROID_DEVICE_ID= RESOURCE_BUNDLE.getString("ANDROID_DEVICE_ID");
    public static String ANDROID_PLATFORM_VERSION= RESOURCE_BUNDLE.getString("ANDROID_PLATFORM_VERSION");
    public static String APPIUM_JS_FILE= RESOURCE_BUNDLE.getString("APPIUM_JS_FILE");
    public static String APPIUM_LOG_FILE= RESOURCE_BUNDLE.getString("APPIUM_LOG_FILE");
    public static String LOG4J_LOG_FILE= RESOURCE_BUNDLE.getString("LOG4J_LOG_FILE");
    public static String NODE_PATH= RESOURCE_BUNDLE.getString("NODE_PATH");
    public static String EXCEL_SHEET_PATH= RESOURCE_BUNDLE.getString("EXCEL_SHEET_PATH");

    public static String APPIUM_LOCAL_MACHINE_IP= RESOURCE_BUNDLE.getString("APPIUM_LOCAL_MACHINE_IP");
    public static String APPIUM_LOCAL_MACHINE_PORT= RESOURCE_BUNDLE.getString("APPIUM_LOCAL_MACHINE_PORT");
    public static int APPIUM_NEW_COMMAND_TIMEOUT = 20000;
    public static String REPORT_FILE_PATH= RESOURCE_BUNDLE.getString("REPORT_FILE_PATH");

    public static int NUMBER_OF_THREAD=1;

    /*
    public synchronized static void initializeConfigPropertiesVariable(){

        if(System.getProperty("PLATFORM_TYPE","").length()>1){
            PLATFORM_TYPE = System.getProperty("PLATFORM_TYPE");
        }else{
            PLATFORM_TYPE = RESOURCE_BUNDLE.getString("PLATFORM_TYPE");
        }
        if(System.getProperty("ANDROID_DEVICE_ID","").length()>1){
            ANDROID_DEVICE_ID = System.getProperty("ANDROID_DEVICE_ID");
        }else{
            ANDROID_DEVICE_ID = RESOURCE_BUNDLE.getString("ANDROID_DEVICE_ID");
        }

        if(System.getProperty("ANDROID_PLATFORM_VERSION","").length()>1){
            ANDROID_PLATFORM_VERSION = System.getProperty("ANDROID_PLATFORM_VERSION");
        }else{
            ANDROID_PLATFORM_VERSION = RESOURCE_BUNDLE.getString("ANDROID_PLATFORM_VERSION");
        }

        if(System.getProperty("ANDROID_APP_VERSION","").length()>1){
            ANDROID_APP_VERSION = System.getProperty("ANDROID_APP_VERSION");
        }else{
            ANDROID_APP_VERSION = RESOURCE_BUNDLE.getString("ANDROID_APP_VERSION");
        }

        if(System.getProperty("ANDROID_APP_FILE_NAME","").length()>1){
            ANDROID_APP_FILE_NAME = System.getProperty("ANDROID_APP_FILE_NAME");
        }else{
            ANDROID_APP_FILE_NAME = RESOURCE_BUNDLE.getString("PLATFORM_TYPE");
        }

        if(System.getProperty("ANDROID_APP_PATH","").length()>1){
            ANDROID_APP_PATH = System.getProperty("ANDROID_APP_PATH");
        }else{
            ANDROID_APP_PATH = RESOURCE_BUNDLE.getString("PLATFORM_TYPE");
        }

        if(System.getProperty("ANDROID_APP_PACKAGE","").length()>1){
            ANDROID_APP_PACKAGE = System.getProperty("ANDROID_APP_PACKAGE");
        }else{
            ANDROID_APP_PACKAGE = RESOURCE_BUNDLE.getString("ANDROID_APP_PACKAGE");
        }

        if(System.getProperty("ANDROID_APP_ACTIVITY","").length()>1){
            ANDROID_APP_ACTIVITY = System.getProperty("ANDROID_APP_ACTIVITY");
        }else{
            ANDROID_APP_ACTIVITY = RESOURCE_BUNDLE.getString("ANDROID_APP_ACTIVITY");
        }

        if(System.getProperty("ANDROID_APP_DOWNLOAD_URL","").length()>1){
            ANDROID_APP_DOWNLOAD_URL = System.getProperty("ANDROID_APP_DOWNLOAD_URL");
        }else{
            ANDROID_APP_DOWNLOAD_URL = RESOURCE_BUNDLE.getString("ANDROID_APP_DOWNLOAD_URL");
        }

        if(System.getProperty("ANDROID_HOME","").length()>1){
            ANDROID_HOME = System.getProperty("ANDROID_HOME");
        }else{
            ANDROID_HOME = RESOURCE_BUNDLE.getString("ANDROID_HOME");
        }

        if(System.getProperty("ADB_PATH","").length()>1){
            ADB_PATH = System.getProperty("ADB_PATH");
        }else{
            ADB_PATH = RESOURCE_BUNDLE.getString("ADB_PATH");
        }

        if(System.getProperty("APPIUM_JS_FILE","").length()>1){
            APPIUM_JS_FILE = System.getProperty("APPIUM_JS_FILE");
        }else{
            APPIUM_JS_FILE = RESOURCE_BUNDLE.getString("APPIUM_JS_FILE");
        }

        if(System.getProperty("APPIUM_LOG_FILE","").length()>1){
            APPIUM_LOG_FILE = System.getProperty("APPIUM_LOG_FILE");
        }else{
            APPIUM_LOG_FILE = RESOURCE_BUNDLE.getString("APPIUM_LOG_FILE");
        }

        if(System.getProperty("LOG4J_LOG_FILE","").length()>1){
            LOG4J_LOG_FILE = System.getProperty("LOG4J_LOG_FILE");
        }else{
            LOG4J_LOG_FILE = RESOURCE_BUNDLE.getString("LOG4J_LOG_FILE");
        }

        if(System.getProperty("NODE_PATH","").length()>1){
            NODE_PATH = System.getProperty("NODE_PATH");
        }else{
            NODE_PATH = RESOURCE_BUNDLE.getString("NODE_PATH");
        }

        if(System.getProperty("EXCEL_SHEET_PATH","").length()>1){
            EXCEL_SHEET_PATH = System.getProperty("EXCEL_SHEET_PATH");
        }else{
            EXCEL_SHEET_PATH = RESOURCE_BUNDLE.getString("EXCEL_SHEET_PATH");
        }

        if(System.getProperty("APPIUM_LOCAL_MACHINE_IP","").length()>1){
            APPIUM_LOCAL_MACHINE_IP = System.getProperty("APPIUM_LOCAL_MACHINE_IP");
        }else{
            APPIUM_LOCAL_MACHINE_IP = RESOURCE_BUNDLE.getString("APPIUM_LOCAL_MACHINE_IP");
        }

        if(System.getProperty("APPIUM_LOCAL_MACHINE_PORT","").length()>1){
            APPIUM_LOCAL_MACHINE_PORT = System.getProperty("APPIUM_LOCAL_MACHINE_PORT");
        }else{
            APPIUM_LOCAL_MACHINE_PORT = RESOURCE_BUNDLE.getString("APPIUM_LOCAL_MACHINE_PORT");
        }

        if(System.getProperty("REPORT_FILE_PATH","").length()>1){
            REPORT_FILE_PATH = System.getProperty("REPORT_FILE_PATH");
        }else{
            REPORT_FILE_PATH = RESOURCE_BUNDLE.getString("REPORT_FILE_PATH");
        }



    }
*/
}
