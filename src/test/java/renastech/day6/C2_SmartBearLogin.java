package renastech.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.BrowserUtils;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C2_SmartBearLogin {

    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click “Login” button
    //6- Verify title equals: Web Orders

    WebDriver driver; // the reason of why we are putting this one outside of methods
    // becasue we want to use same driver instance for each method
    @BeforeMethod
    public void setUp(){

        //1. Open Chrome browser
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(2);
        driver.close();
    }

    @Test
    public void TC1_smartBearLoginVerification(){

        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        //6- Verify title equals: Web Orders

        //3- Enter username --->Tester
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        //4- Enter password --->test
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //5- Click “Login” button
        BrowserUtils.wait(3);
        WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

    }

    @Test
    public void TC2_smartBearLogin(){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        SmartBearUtils.loginForSmartBear(driver);

        //6- Verify title equals: Web Orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"),"Titlle Failed");
    }


}
