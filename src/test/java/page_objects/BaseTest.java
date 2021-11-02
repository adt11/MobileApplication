package page_objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.hubilo.appium_engine.AndroidDriverInit;
import com.hubilo.common_functions.Path;
import com.hubilo.common_functions.Util;
import com.hubilo.configuration.ConfigPropertiesReader;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;

public class BaseTest {

    protected AppiumDriver driver;
    public ExtentReports extent = new ExtentReports();
    public ExtentSparkReporter spark;
    public Util util = new Util();

    @BeforeTest
    public void init() throws MalformedURLException {
        spark = new ExtentSparkReporter(Path.reportPath);
        extent.attachReporter(spark);
        driver = AndroidDriverInit.startAndroidDriver();
    }


    @AfterTest
    public void quit(){
        extent.flush();
        if(driver!=null){
            driver.removeApp(ConfigPropertiesReader.ANDROID_APP_PACKAGE);
            driver.quit();
            driver=null;
        }
    }
}
