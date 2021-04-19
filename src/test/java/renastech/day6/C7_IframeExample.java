package renastech.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C7_IframeExample {


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://renastech.com/?amp");
    }

    @Test
    public void TC1_iframePractice(){
        //first of all you need to locate iframe same as an webelemnt
        WebElement iframe=driver.findElement(By.id("courses-iframe"));
        //to be able to tell selenium focus on iframe
        //you need to tell selenium to change the focus from page to iframe
        driver.switchTo().frame(iframe);

        // you can also locate webelemnts inside iframe.
    }
}
