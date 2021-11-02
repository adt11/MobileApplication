package page_objects;

import com.hubilo.common_functions.Path;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Runner extends BaseTest{

    LoginPage loginPage;
    HomePage homePage;
    @Test(dataProvider = "getData")
    public void SmokeTest(String email, String otp, String postComments){

        extent.createTest("Login with OTP starts")
                .createNode("Enter Email Id and then enter 4 digit otp");
        loginPage = new LoginPage(driver);
        loginPage.setUser(email);
        loginPage.setOtp(otp);

        extent.createTest("Login with OTP finished")
                .createNode("logged in via OTP")
                .pass("login success full with OTP");

        homePage = new HomePage(driver);

        // post comments here
        extent.createTest("Event post comments start ")
                .createNode("Go to Event bottom tab")
                .pass("My post here..");
        homePage.getEvent().gotoEvents();

        extent.createTest("Feed comments-> something on your mind...")
                .createNode("add comment and just post it")
                        .pass("Posted comment");
        homePage.getEvent().feedComments(postComments);
        extent.createTest("Posted comment")
                .createNode("Get screenshot")
                .pass("Posted Comment Screenshot")
                .addScreenCaptureFromPath(util.getScreenshot(driver));

        extent.createTest("Profile verification start ")
                .createNode("Go to Profile tab")
                        .pass("Profile clicked");
        homePage.getProfile().gotoProfile();
        String profileName = homePage.getProfile().getProfileName();
        Assert.assertTrue(profileName.contains("pks"));
        extent.createTest("Profile verification finished")
                .createNode("verify user name under profile: "+profileName)
                .pass("user verification successfully");
        extent.createTest("user logged out")
                .createNode("user tap on logout button")
                .pass("logged-out successfully!");
        homePage.getProfile().logOut();

    }

    @DataProvider
    public Object[][]getData(){

        return new Object[][]{
            {"pks+22@hubilo.com", "1234", "Testing"}
        };
    }

}
