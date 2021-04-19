package renastech.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C4_SeleniumEasy_Checkbox {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        //3. Verify “Success – Check box is checked” message is NOT displayed.
        //4. Click to checkbox under “Single Checkbox Demo” section
        //5. Verify “Success – Check box is checked” message is displayed.

        //1. Open Chrome browser
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement succesBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        //3. Verify “Success – Check box is checked” message is NOT displayed.
            //before this checked if it is also selected by default

        if (!succesBox.isSelected()){ // that means if it is not selected
            System.out.println("Default verification Passed");
        }else{
            System.out.println("Default verification Failed");
        }
        //4. Click to checkbox under “Single Checkbox Demo” section
        succesBox.click();

        //5. Verify “Success – Check box is checked” message is displayed.
        WebElement successMessage=driver.findElement(By.xpath("//div[@id='txtAge']"));
        if (successMessage.isDisplayed()){
            System.out.println("Passed for displaying message");
        }else {
            System.out.println("failed for not displaying message");
        }


    }
}
