package renastech.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

public class C6_cssLocater {

    public static void main(String[] args) {
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.amazon.com");

        //locate search box with css
//        1- tagname[attribute='value']
//        WebElement amazonSearch=driver.findElement(By.cssSelector("input[dir='auto']"));
//        WebElement amazonSearch=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
//        3-tagname#value # means id in css
        WebElement amazonSearch=driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        amazonSearch.sendKeys("Laptop"+ Keys.ENTER);
    }
}
