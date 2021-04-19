package renastech.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C5_RenastechDropDown {

    //1. Open Chrome browser
    //2. Go to http://renastech.com/?amp
    //confirm default selected dropdown is select
    //choose  option 2 from dropdown
    //choose select from dropdown
    //choose option 3 from dropdown

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //1. Open Chrome browser
        //2. Go to http://renastech.com/?amp
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://renastech.com/?amp");
    }

    @Test
    public void TC1_dropdownTest() throws InterruptedException {
        //confirm default selected dropdown is select
        //choose  option 2 from dropdown
        //choose select from dropdown

        //1- Select dropdowns: are created by using <select> tag in HTML
        //and if it is select dropdown you can locate using Select Class

        Select dropDown=new Select(driver.findElement(By.id("dropdown-class-example")));
        //confirm default selected dropdown is select

        String defaultDropdownOption=dropDown.getFirstSelectedOption().getText();
        String expectedDropdown="Select";

        Assert.assertEquals(defaultDropdownOption,expectedDropdown ,"Default option is not select");

        Thread.sleep(2000); // no need to pass its only for making slower and see how it is selecting
        //choose  option 2 from dropdown
        dropDown.selectByVisibleText("Option2");
        Thread.sleep(2000);
        //choose select from dropdown
        dropDown.selectByIndex(0);
        Thread.sleep(2000);
        //choose option 3 from dropdown
        dropDown.selectByValue("option3");

    }

    @Test
    public void TC2_selectDropDown(){
        //choose option 3 from dropdown
        Select dropDown=new Select(driver.findElement(By.id("dropdown-class-example")));
        dropDown.selectByIndex(3);
    }


}
