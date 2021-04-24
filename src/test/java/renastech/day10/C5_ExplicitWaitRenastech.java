package renastech.day10;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import renastech.pages.RenasTechPracticePage;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class C5_ExplicitWaitRenastech {

    //go to http://renastech.com/?amp
    //click on show button
    //sent text to the box that appers adter clicking show button

    RenasTechPracticePage renasTechPracticePage;
    @Test
    public void TC1_hiddenElelemntTest(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("RenasTech_url"));
        renasTechPracticePage=new RenasTechPracticePage();
//
//        WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),15);
//        //click on show button
////        renasTechPracticePage.showButton.click();
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(renasTechPracticePage.showButton)).click();
//
//        //sent text to the box that appers after clicking show button
////        renasTechPracticePage.hiddenBox.sendKeys("hello");
//        webDriverWait.until(ExpectedConditions.visibilityOf(renasTechPracticePage.hiddenBox)).sendKeys("hello");
//
//        //using explicit wait with condition of element is going to make more secure when you locate elements


        renasTechPracticePage.sentTextToHiddenBox("hello");
    }
}
