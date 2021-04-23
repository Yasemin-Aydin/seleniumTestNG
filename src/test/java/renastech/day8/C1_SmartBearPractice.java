package renastech.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.PropertiesReadingUtil;
import renastech.utilities.SmartBearUtils;

import java.util.List;

public class C1_SmartBearPractice extends TestBase {

    //open chrome browser
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //click on box which belongs "charles Dodgeson"
    //click on delete button
    //verify if charles deleted from the list


    //open chrome browser is done on testbase

    @Test
    public void TC1_charlesDeleteVerification(){
        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //since we have util class to read properties file instead of harcoding url
        //i will take it from properties file with help of utility class
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        //since we have login util for smart bear i will just call the method
        SmartBearUtils.loginForSmartBear(driver);

        //click on box which belongs "charles Dodgeson"
        WebElement charlesBox=driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        charlesBox.click();

        //click on delete button
        WebElement deleteButton=driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();

        //after deleting name if you store everyy name in the list and check after that if the name is still there
        List<WebElement> listOfNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        //with for loop check each name that you stored in the list and check if you still see charles
        for (WebElement name:listOfNames){
            Assert.assertFalse(name.getText().equals("Charles Dodgeson"), "Charles Dodgeson is still in the list");
//            Assert.assertFalse(name.getText().equals("Paul Brown"), "Paul Brown is still in the list");
        }

    }

    //create a utils for smartbear names
    //and try with charlesdeleteverifactiion
}
