package renastech.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C2_RelativeXpath {
//    1-//tagname[@attribute='value']-- looks for tagname attribute and value
//            2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
//            3-//tagname[.='text'] --looks for exact text match for any attribute
    public static void main(String[] args) {

        //Go to http://renastech.com/?amp
        //Locate the search box and type Renastech

        WebDriver driver=WebDriverUtil.getDriver("chrome");
        driver.get("http://renastech.com/?amp");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //    1-//tagname[@attribute='value']-- looks for tagname attribute and value
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Renastech");
//            2-//tagname[contains(@attribute, 'value') --locate webelemnt  with the given value if contains
        driver.findElement(By.xpath("//input[contains(@id,'auto')]")).sendKeys("School");

        //            3-//tagname[.='text'] --looks for exact text match for any attribute
        WebElement headar=driver.findElement(By.xpath("//h1[.='Practice Page']"));

        if (headar.isDisplayed()){
            //isDisplayed method will check if the webelement present in the page
            System.out.println("Header PAssed");
        }else {
            System.out.println("Header Failed");
        }
    }
}
