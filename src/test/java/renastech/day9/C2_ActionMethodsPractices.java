package renastech.day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import renastech.base.TestBase2;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;

public class C2_ActionMethodsPractices extends TestBase2 {

    Actions actions; // instead of creating this object for each test i will specify at the top
    //then call in the each test

    //go to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double click button
    //then accept the alert that pops up
    @Test
    public void TC1_doubleClickExample(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");

        //first locate the element that you wanna work on
        //then create action object
        //use actions method to perfom action

        WebElement doubleClickButton=DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions=new Actions(DriverUtil.getDriver());
        actions.doubleClick(doubleClickButton).perform(); //this method asking the element that needs to be double clicked

        BrowserUtils.wait(3);
        //then accept the alert that pops up
        //first you need to create an allert object
        //to be able to handle this one you need to switch
        //beacause selenium can not focus on 2 things in one time
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.accept();

    }

    //go to http://demo.guru99.com/test/simple_context_menu.html
    //right click to right click button
    //then click on edit button
    //then accept the allert that pops up

}
