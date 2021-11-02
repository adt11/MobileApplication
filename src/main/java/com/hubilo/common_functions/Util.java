package com.hubilo.common_functions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

    public void scrollDownUpToElement(AppiumDriver driver){
        String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Logout\").instance(0))";
        new TouchAction(driver).press(PointOption.point(550, 640)).waitAction().moveTo(PointOption.point(550, 60)).release().perform();
    }

    public String getScreenshot(AppiumDriver driver) {
        String getScreenshotFileName = Path.screenshotPath+"Screenshot_"+DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now())+".png";
        File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file, new File(getScreenshotFileName));
        }catch (IOException ioException){
            ioException.getMessage();
        }

        return getScreenshotFileName;
    }
}