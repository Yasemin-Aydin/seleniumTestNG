package renastech.day9;

import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.pages.SmartBearLoginPage;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class C3_SmartBearPOMExample {

    //to be able to work with page you neeed to create an object from your page

    SmartBearLoginPage smartBearLoginPage; // this one is null
    //to be able to use you need create new object inside test

    @Test
    public void TC1_SmartBearPossitiveLogin(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        String userName=PropertiesReadingUtil.getProperties("SmartBear_username");
        String password=PropertiesReadingUtil.getProperties("SmartBear_password");

        smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginSmartBear(userName,password);

        //verify title changed to Web Orders
        String expectedTitle="Web Orders";
        String actualTitle=DriverUtil.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    //assigment
    //try login funcnality with unvalid username and pasworrd
    //at the end verify you see message as a Invalid Login or Password.
}
