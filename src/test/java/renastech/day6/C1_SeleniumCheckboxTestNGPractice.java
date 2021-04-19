package renastech.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C1_SeleniumCheckboxTestNGPractice {

    //1. Open Chrome browser
    //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    //3. Verify “Check All” button text is “Check All”
    //4. Click to “Check All” button
    //5. Verify all check boxes are checked
    //6. Verify button text changed to “Uncheck All”

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //1. Open Chrome browser
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }
    @AfterMethod
    public void closing() throws InterruptedException {

        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void TC1_checkBoxVerification() throws InterruptedException {

        //3. Verify “Check All” button text is “Check All”
        //4. Click to “Check All” button
        //5. Verify all check boxes are checked
        //6. Verify button text changed to “Uncheck All”

        //3. Verify “Check All” button text is “Check All”
        WebElement checkAllButton=driver.findElement(By.xpath("//input[@id='check1']"));

        String actualText=checkAllButton.getAttribute("value");
        String expectedText="Check All";

        Assert.assertEquals(actualText,expectedText,"FAiled");

        //4. Click to “Check All” button
        checkAllButton.click();

        //5. Verify all check boxes are checked
        List<WebElement> listOfCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement checkbox: listOfCheckBox) {

            if (checkbox.isSelected()){
                System.out.println("checkbox selected"); // this will print out if checkbox is selected
            }else {
                System.out.println("checkbox Failed"); // this will print out if checkbox is not selected
            }
        }

        Thread.sleep(2000);
        //6. Verify button text changed to “Uncheck All”
        String actualText2=checkAllButton.getAttribute("value");
        String expectedText2="Uncheck All";

        Assert.assertEquals(actualText2,expectedText2);

    }
}
