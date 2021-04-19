package renastech.day6;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import renastech.utilities.SmartBearUtils;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C4_SmartBearTests {

    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Login
    //4. Click on Order
    //5. Select familyAlbum from product, set quantity to 5
    //6. Click to “Calculate” button
    //7. Fill address Info with JavaFaker
    //8. Click on “visa” radio button
    //9. Generate card number using JavaFaker
    //10Enter expiration date
    //11. Click on “Process”
    //12.Verify success message “New order has been successfully added.” is displayed.

    WebDriver driver; // the reason of why we are putting this one outside of methods
    // becasue we want to use same driver instance for each method
    @BeforeMethod
    public void setUp(){
        //1. Open Chrome browser
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        //3- Login
        SmartBearUtils.loginForSmartBear(driver);
    }

    @Test
    public void TC1_orderVerificationTest(){
        //4. Click on Order
        WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
        //a[@href='Process.aspx'] another way to locate
        orderLink.click();

        //5. Select familyAlbum from product, set quantity to 5
        Select dropDownProduct=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropDownProduct.selectByVisibleText("FamilyAlbum");

        //set quantity to 5
        WebElement quantity=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
//        quantity.clear();
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("5");

        //6. Click to “Calculate” button
        WebElement calculateButton=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();
        //7. Fill address Info with JavaFaker
            //locate every element under adrees info
        WebElement customerName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement stateName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zipName=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        Faker faker=new Faker();
        customerName.sendKeys(faker.name().fullName());
//        streetName.sendKeys(faker.address().fullAddress()); // its not good test data since its passing full adrress for street
        streetName.sendKeys(faker.address().streetAddress());
        cityName.sendKeys(faker.address().cityName());
        stateName.sendKeys(faker.address().state());
        zipName.sendKeys(faker.address().zipCode().replaceAll("-",""));
        //8. Click on “visa” radio button
        WebElement visaButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaButton.click();
        //9. Generate card number using JavaFaker
        WebElement cardNumber=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));

        //credit card method returned with number and -
        //but this format is not valid for the credit card number box
        //we need replace - with empty space
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        //10Enter expiration date
        WebElement expDateBox= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expDateBox.sendKeys("05/25");
        //11. Click on “Process”
        WebElement proccessButton=driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        proccessButton.click();
        //12.Verify success message “New order has been successfully added.” is displayed.
        WebElement succesMessage= driver.findElement(By.xpath("//strong"));

        Assert.assertEquals(succesMessage.getText(),"New order has been successfully added.","succes mesage is not displayed");


    }

}
