package renastech.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C4_GoogleTestNG {

    //1- Go to google
    //2- Verify title is google

    //1- Go to google
    //search laptop
    //make sure title contains laptop

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //1- Go to google
        driver.get("https://www.google.com");
    }

    @Test
    public void TC1_googleTitleVerification(){
        //1- Go to google  --- this  is done on beforemethod
        //2- Verify title is google
        System.out.println("TC1 is running");
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle,"Title verification Failed");
        //message will be printed if the assert failed
    }

    @Test
    public void TC2_googleSearch(){
        //1- Go to google --- this  is done on beforemethod
        //search laptop
        //make sure title contains laptop
        System.out.println("Tc2 Running");
        WebElement searchBox= driver.findElement(By.name("q"));
        //search laptop
        searchBox.sendKeys("laptop" , Keys.ENTER);
        String actualTitle=driver.getTitle();
        String containedTitle="laptop";

        Assert.assertTrue(actualTitle.contains(containedTitle) , " title doesnt contain laptop");


    }
}
