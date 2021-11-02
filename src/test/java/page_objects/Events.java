package page_objects;

import com.hubilo.configuration.Locators;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class Events implements Locators {

    private By gotoEventsBtn= By.id(RESOURCE_BUNDLE.getString("gotoEventsBtn"));
    private By postProfilePicbtn= By.id(RESOURCE_BUNDLE.getString("postProfilePicbtn"));
    private By postComment= By.id(RESOURCE_BUNDLE.getString("postComment"));
    private By postBtn= By.id(RESOURCE_BUNDLE.getString("postBtn"));

    AppiumDriver driver;

    public Events(AppiumDriver driver){
        this.driver = driver;
    }

    public void gotoEvents(){
        this.driver.findElement(this.gotoEventsBtn).click();
    }

    public void feedComments(String postcomment){
        this.driver.findElement(this.postProfilePicbtn).click();
        this.driver.findElement(this.postComment).sendKeys(postcomment);
        this.driver.findElement(this.postBtn).click();
    }
}
