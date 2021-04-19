package renastech.day6;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C8_WebTablePractice {

    WebDriver driver; // the reason of why we are putting this one outside of methods
    // becasue we want to use same driver instance for each method
    @BeforeMethod
    public void setUp(){
        //1. Open Chrome browser
        //2. Go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    //3- Login
//        SmartBearUtils.loginForSmartBear(driver);
    @Test
    public void TC1_verifyLoginSmartBear(){
        SmartBearUtils.loginForSmartBear(driver);
        Assert.assertEquals(driver.getTitle(),"Web Orders");
    }

    @Test
    public void TC2_verifyStreetNames(){
        SmartBearUtils.loginForSmartBear(driver);
//        SmartBearUtils.verifyStreetName(driver,"7, Flower Street");
        SmartBearUtils.verifyStreetName(driver,"bakery");
    }

}
