package com.hubilo.appium_engine;

import com.hubilo.configuration.ConfigPropertiesReader;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInit {

    public static AndroidDriver<MobileElement> startAndroidDriver() throws MalformedURLException {

        DesiredCapabilities driverCapability = new DesiredCapabilities();
        String apkPath = System.getProperty("user.dir")+ConfigPropertiesReader.ANDROID_APP_PATH+ConfigPropertiesReader.ANDROID_APP_FILE_NAME;
        driverCapability.setCapability(MobileCapabilityType.APP, apkPath);
        driverCapability.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        driverCapability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, ConfigPropertiesReader.APPIUM_NEW_COMMAND_TIMEOUT);
        driverCapability.setCapability(MobileCapabilityType.UDID, ConfigPropertiesReader.ANDROID_DEVICE_ID);
        driverCapability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        driverCapability.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigPropertiesReader.ANDROID_PLATFORM_VERSION);
        driverCapability.setCapability(MobileCapabilityType.NO_RESET, true);
        driverCapability.setCapability(MobileCapabilityType.FULL_RESET, false);
        driverCapability.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
        driverCapability.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, true);
        driverCapability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, ConfigPropertiesReader.ANDROID_APP_PACKAGE);
        driverCapability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ConfigPropertiesReader.ANDROID_APP_ACTIVITY);

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(

                    new URL("http://"+ConfigPropertiesReader.APPIUM_LOCAL_MACHINE_IP + ":" + ConfigPropertiesReader.APPIUM_LOCAL_MACHINE_PORT+"/wd/hub"),driverCapability);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}