package renastech.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C5_WebTableTask {

//    Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  “9, Maple Valley”

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
        //3- Login
        SmartBearUtils.loginForSmartBear(driver);
    }
    @Test
    public void TC1_verifyMarkStreetName(){
//        2. Click on View all orders
        driver.findElement(By.linkText("View all orders")).click();
//       3. Verify Mark Smith has street as  “9, Maple Valley”

        //td[.='9, Maple Valley'] -- one way to locate if its unique
        //td[.='9, Maple Valley']//..//td[6]
        //td[.='Mark Smith']/following-sibling::td[4]
        WebElement markStreetName= driver.findElement(By.xpath("//td[.='Mark Smith']/following-sibling::td[4]"));

        System.out.println("markStreetName.getText() = " + markStreetName.getText());

        String actualStreet=markStreetName.getText();
        String expectedStreet="9, Maple Valley";

        Assert.assertEquals(actualStreet,expectedStreet,"street name verification has failed");

    }





}


