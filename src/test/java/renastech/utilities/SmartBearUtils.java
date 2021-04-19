package renastech.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {

    //create a utilities that will have function to login smart bear page

    public static void loginForSmartBear(WebDriver driver){
        //3- Enter username --->Tester
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        //4- Enter password --->test
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

        //5- Click “Login” button
        BrowserUtils.wait(2);
        WebElement loginButton=driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }

    public static void verifyStreetName(WebDriver driver ,String streetName){
        // when you call this method  it will get street name from you
        // and it will compare with all street names that table has
        // at the end it is going to validate if the name that you passed is in the table.

        //table[@id='ctl00_MainContent_orderGrid'] --- this will locate whole table
        //table[@id='ctl00_MainContent_orderGrid']//tr  -- this will locate all rows 9 total togetger
        //table[@id='ctl00_MainContent_orderGrid']//tr[3] -- this will locate 3. row it will locate one row

        //this xpath is going to store every street name that we have in the table
        List<WebElement> stretList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[6]"));

        for (WebElement street : stretList){
            if (street.getText().equals(streetName)){
                Assert.assertTrue(street.getText().equals(streetName));
                return;
            }

        }

        //it will make the code fail anytime you call this method
        Assert.fail("Street Name :"+streetName+" is not present on the table");


    }



}
