package renastech.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.utilities.DriverUtil;

public class C3_BinanceAutomation {

    @Test
    public void TC1_BinanceExample(){
        DriverUtil.getDriver().get("https://www.binance.com/en");
        //next step to move trade dropdown
        //and click on convert button
        //make sure title has changed

        //since our dropdown doesnt have select tag so this dropdown is not select dropdown
        //so you cant use select classes to handle this
        //you need to locate and handle this is html dropdown

        WebElement tradeButton=DriverUtil.getDriver().findElement(By.xpath("//span[.='Trade']")); //only locating
//        //this element is not clickable
//        //and we see dorpdown when we move to the element
//        //lets use action class to move our mouse
//
        Actions actions=new Actions(DriverUtil.getDriver());
        actions.moveToElement(tradeButton).perform(); // we move the mouse to trade button
//
        WebElement converButton=DriverUtil.getDriver().findElement(By.id("ba-BasicCONVERT"));
//        //first regular click
////        converButton.click();
//        //second try with action class
////        actions.click(converButton).perform();
////        actions.moveToElement(converButton).click().perform();
//
//        //third try jsexuter
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) DriverUtil.getDriver();
        javascriptExecutor.executeScript("arguments[0].click();",converButton);

        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains("Convert"));

    }
}
