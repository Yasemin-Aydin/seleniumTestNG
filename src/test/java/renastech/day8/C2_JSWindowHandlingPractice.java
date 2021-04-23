package renastech.day8;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.BrowserUtils;

import java.util.Set;

public class C2_JSWindowHandlingPractice extends TestBase {


    @Test
    public void TC1_handlingWindowWithJSExecuter(){
        driver.get("https://www.youtube.com");

        //this line
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windows=driver.getWindowHandles(); //this return set of string so you need store them in set

        for (String window:windows){
            BrowserUtils.wait(2);
            //normally selenium is focusing one thing at one time
            //so for example if you have frmae,alert,window or tab that you want to handle
            //then you need to change focus of selenium to spesific window ,frame ,alert or tab
            //in our case we switched betwwen each windows with foreach loop and using switchTo method
            driver.switchTo().window(window);
            String currentWindow=driver.getWindowHandle();
            System.out.println("currentWindow = " + currentWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }
}
