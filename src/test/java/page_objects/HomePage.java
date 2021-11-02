package page_objects;

import com.hubilo.common_functions.Util;
import com.hubilo.configuration.Locators;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage  {

    private AppiumDriver driver;

    public HomePage(AppiumDriver driver){
        this.driver = driver;
    }

    public Profile getProfile(){
        return new Profile(this.driver);
    }

    public Events getEvent(){
        return new Events(this.driver);
    }

}
