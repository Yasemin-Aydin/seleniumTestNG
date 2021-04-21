package renastech.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.BrowserUtils;

import java.util.Set;

public class C1_WindowsTabs extends TestBase {

    @Test
    public void TC1_windowTabHandle(){
        driver.get("http://renastech.com/?amp");
        String currentWindow=driver.getWindowHandle(); // it is only storing one window
        //getwindowhandle will store current window that you are working
        System.out.println("currentWindow = " + currentWindow);
        System.out.println("driver.getTitle() = " + driver.getTitle());


        WebElement openTab=driver.findElement(By.id("opentab")); // we locate open new tab button
        openTab.click(); // click on open new tab
        //new tab is getting open

        System.out.println(" After new tab driver.getTitle() = " + driver.getTitle());
        //since we didnt change focus of driver title will still be same
        Set<String> allWindows=driver.getWindowHandles();//

        for (String window: allWindows){
            driver.switchTo().window(window);
            BrowserUtils.wait(2);
            //you need to switch driver focus on next tab to be able work on that page
            System.out.println(driver.getTitle());
        }




    }


}
