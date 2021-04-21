package renastech.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import renastech.base.TestBase;
import renastech.utilities.BrowserUtils;

import java.util.Set;

public class C2_WindowsPractice extends TestBase {

    //go to http://renastech.com/?amp
    //click on open window button
    //make sure title is changed
    //click on program button on next window

    @Test
    public void TC1_multipleWindowsHandiling(){
        //go to http://renastech.com/?amp
        driver.get("http://renastech.com/?amp");

        System.out.println("Before clicking button driver.getTitle() = " + driver.getTitle());

        //click on open window button
        WebElement openWindowButton=driver.findElement(By.id("openwindow"));
        openWindowButton.click();
        //after this line you will have 2 different windows
        //and to be able to work on next window you need to change selenium foucs on next window
        // for this purpose you need to have windowhandles

        System.out.println("After clicking button driver.getTitle() = " + driver.getTitle());
        // this still will be same since we diddnt change driver focus
        Set<String> allWindows=driver.getWindowHandles(); //store all windows
        //that means set will store 2 window that we have practice and renastech

        for (String window:allWindows){
            BrowserUtils.wait(2);
            driver.switchTo().window(window); // this will switch between windows that is stored in set allwindos
            System.out.println("after switcingh driver.getTitle() = " + driver.getTitle());
        }

        //at the end loop will switch driver focus on next window now we can locate our element

        //click on program button on next window
        driver.findElement(By.linkText("Program")).click();



    }

}
