package renastech.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

public class C7_AbsulateXpath {

    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("http://renastech.com/?amp");

        WebElement header=driver.findElement(By.xpath("/html/body/h1"));

        //isdisplayed check if the webelement is present on the page.
        if (header.isDisplayed()){
            System.out.println("Header is displayed");
        }else{
            System.out.println("Header is not displayed");
        }

    }
}
