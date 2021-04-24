package renastech.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver; //each time creates new driver from webdriverutil

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverUtil.getDriver("chrome"); //each time creates new driver from webdriverutil
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing(){
//        driver.close();
    }
}
