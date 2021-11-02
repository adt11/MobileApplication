package com.hubilo.appium_engine;

import com.hubilo.configuration.ConfigPropertiesReader;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;

public class AppiumServer {

    static AppiumDriverLocalService service;

    static synchronized AppiumDriverLocalService setupAppiumServer(){

        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.usingAnyFreePort();
        builder.withIPAddress(ConfigPropertiesReader.APPIUM_LOCAL_MACHINE_IP);
        builder.withLogFile(new File(ConfigPropertiesReader.APPIUM_LOG_FILE));
        builder.withLogFile(new File("appium.log"));
        AppiumDriverLocalService service;
        try{
            service = AppiumDriverLocalService.buildService(builder);
        }catch (Exception e){
            builder.usingDriverExecutable(new File(ConfigPropertiesReader.NODE_PATH));
            builder.withAppiumJS(new File(ConfigPropertiesReader.APPIUM_JS_FILE));
            service = AppiumDriverLocalService.buildService(builder);
        }

        service.start();
        service.clearOutPutStreams();
        return service;
    }

    public static void startAppiumServer(){
        service.start();
    }

    public static void stopAppiumServer(){
        service.stop();
    }

}
