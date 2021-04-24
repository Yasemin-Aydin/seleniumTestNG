package renastech.day10;

import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.pages.SmartBearLoginPage;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class C1_SBNegativeLogin {

    //assigment
    //try login funcnality with unvalid username and pasworrd
    //at the end verify you see message as a Invalid Login or Password.

    SmartBearLoginPage smartBearLoginPage; //empty smarbearloginpage object
    @Test
    public void TC1_SBNegativeLoginTest(){
        //to be able to use pages you need create an object from the page
        smartBearLoginPage=new SmartBearLoginPage();

        //get the website first
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));

        smartBearLoginPage.loginSmartBear(PropertiesReadingUtil.getProperties("SmartBear_Invalidusername"),
                PropertiesReadingUtil.getProperties("SmartBear_Invalidpassword"));

        String expectedText="Invalid Login or Password.";
        String actualText=smartBearLoginPage.getStatusMessage();

        Assert.assertEquals(expectedText,actualText);
    }
}
