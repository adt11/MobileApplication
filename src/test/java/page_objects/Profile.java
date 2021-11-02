package page_objects;

import com.hubilo.common_functions.Util;
import com.hubilo.configuration.Locators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.Reporter;

public class Profile implements Locators {

    By profileBtn = By.id(RESOURCE_BUNDLE.getString("profileBtn_ID"));

    By profileName = By.id(RESOURCE_BUNDLE.getString("profileName_ID"));

    By logoutBtn = By.xpath("//*[@text=\"Logout\"]");//By.id(RESOURCE_BUNDLE.getString("logoutBtn_ID"));

    By confirmLogout = By.id(RESOURCE_BUNDLE.getString("profileName_ID"));


    private AppiumDriver driver;

    Util util = new Util();

    public Profile(AppiumDriver driver) {
        this.driver = driver;
    }

    public void gotoProfile() {
        this.driver.findElement(this.profileBtn).click();
    }

    public String getProfileName() {
        Reporter.log("profile name : "+this.driver.findElement(this.profileName).getText(), true);
        return this.driver.findElement(this.profileName).getText();
    }

    public void logOut(){
        util.scrollDownUpToElement(driver);
        driver.closeApp();
    }
}
