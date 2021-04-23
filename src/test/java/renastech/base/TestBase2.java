package renastech.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import renastech.utilities.DriverUtil;

import java.util.concurrent.TimeUnit;

public abstract class TestBase2 { // you can say for abstraction example

    // no need to create a driver instance anymore
    //because we created in the driverutil as a singelton

    @BeforeMethod
    public void setup(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing(){
//        DriverUtil.closeDriver();
    }
}
