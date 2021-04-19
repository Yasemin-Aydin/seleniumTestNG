package renastech.day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.BrowserUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C6_AlertPractice {

    //open chrome browser
    //go to http://renastech.com/?amp
    //locate the alert button to click it
    //click button
    //handle alert

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://renastech.com/?amp");
    }

    @Test
    public void TC1_alertPractice(){
        //locate the alert button to click it
        //click button
        //handle alert

        //locate the alert button to click it
        WebElement allertButton=driver.findElement(By.xpath("//input[@id='alertbtn']"));
        //click button
        allertButton.click();

        //handle alert
        //since alert will be on new popup you need to switch focus of driver from webpage to alert
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept(); // accept is going to click on ok
        BrowserUtils.wait(2);
        allertButton.click();
        BrowserUtils.wait(2);
        alert.dismiss(); // dismiss one will click on cancel

    }

}
