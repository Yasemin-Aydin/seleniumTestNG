package renastech.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class DriverUtilPractice extends TestBase2 {

    //go to google
    //and search for hello
    //verify title contains hello
    @Test
    public void driver_Practice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox=DriverUtil.getDriver().findElement(By.name("q"));

        String searchItem= PropertiesReadingUtil.getProperties("googleSearch");
        //this line will take search date from properties

        searchBox.sendKeys(searchItem + Keys.ENTER);

        //expectedConttain
        String expectedContainTitle= searchItem;

        System.out.println("searchItem = " + searchItem);
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(expectedContainTitle));

        //change browser type from properties if you wanna run with headless mode

    }
}
