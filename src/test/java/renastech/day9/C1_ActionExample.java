package renastech.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.DriverUtil;

public class C1_ActionExample extends TestBase2 {

    //go to http://renastech.com/?amp
    //move the mouse to Mouse Hover button
    //then move to Section 1
    //then move to section 1.2


    @Test
    public void TC1_hoverOverRenastechPractice(){
        //go to http://renastech.com/?amp

        DriverUtil.getDriver().get("http://renastech.com/?amp");

//        1- To get Actions methods, we need to create the instance of the actions interface.
//        2- And pass the driver instance into the constructor.
//        3- We must use : perform() method at the end to be able to perform any actions method.

        //move the mouse to Mouse Hover button
        //create the instance from action class
        Actions actions=new Actions(DriverUtil.getDriver()); // it is asking for driver

        //move the mouse to Mouse Hover button
            //you need to locate webelement to be able move with actions
        WebElement mouseHoverButton=DriverUtil.getDriver().findElement(By.linkText("Mouse Hover"));
             //after locating you can use your action methods to move to the element
        actions.moveToElement(mouseHoverButton).perform();
             // you always need to pass perform at the end to make your action works

        //then move to Section 1
        WebElement section1=DriverUtil.getDriver().findElement(By.linkText("Section 1"));
        //after locating you can use action method to move mouse
        actions.moveToElement(section1).perform();


        //then move to section 1.2
        WebElement section1_2=DriverUtil.getDriver().findElement(By.linkText("Section 1.2"));
        actions.moveToElement(section1_2).perform();

//        actions.moveToElement(section1_2).click().perform();
        // if there is something that you need to click you can also  use click option with actions
    }
}
