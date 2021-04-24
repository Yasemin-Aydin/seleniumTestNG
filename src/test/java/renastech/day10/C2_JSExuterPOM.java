package renastech.day10;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import renastech.pages.RenasTechPracticePage;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;
import renastech.utilities.PropertiesReadingUtil;

public class C2_JSExuterPOM {
    //go to "http://renastech.com/?amp"
    //scrol down to iframes on pthe page

    RenasTechPracticePage renasTechPracticePage;//empty object

    @Test
    public void TC1_JSExuterScroolPOMExamople(){
        renasTechPracticePage=new RenasTechPracticePage();
        // you can get url from properties file or pas it under here
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("RenasTech_url"));

        //we need to locate our iframe to be able to scrol down to the element
        //since we created in the page
        //i will call from page and use it in here
        WebElement ifreme= renasTechPracticePage.iframe;

        //to be able to do scroll down
        //you have 2 option
            //1.actions move to the element
        //need to create an object from actions
        Actions actions=new Actions(DriverUtil.getDriver());
        actions.moveToElement(ifreme).perform();

            //2.JS excuter

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) DriverUtil.getDriver();
        //to make jsexecuter works you need to do casting between driver and jsexcuter

        BrowserUtils.wait(3);
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",ifreme);
    }


}
