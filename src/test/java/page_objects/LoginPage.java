package page_objects;

import com.hubilo.configuration.Locators;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage implements Locators {

    By email = By.id(RESOURCE_BUNDLE.getString("editEmail_ID"));

    By emailContinueBtn = By.id(RESOURCE_BUNDLE.getString("emailContinueBtn_ID"));

    By otp = By.id(RESOURCE_BUNDLE.getString("otp_ID"));

    By continueOtp = By.id(RESOURCE_BUNDLE.getString("continueOtp_ID"));

    By skipPasswordBtn = By.id(RESOURCE_BUNDLE.getString("skipPasswordBtn_ID"));

    private AppiumDriver driver;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void setUser(String emailId) {
        this.driver.findElement(this.email).sendKeys(emailId);
        this.driver.findElement(this.emailContinueBtn).click();
    }

    public void setOtp(String otpNumber) {
        this.driver.findElement(this.otp).sendKeys(otpNumber);
        this.driver.findElement(this.continueOtp).click();
        this.driver.findElement(this.skipPasswordBtn).click();
    }




}
