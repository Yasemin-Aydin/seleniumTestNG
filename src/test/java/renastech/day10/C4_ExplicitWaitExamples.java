package renastech.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import renastech.utilities.BrowserUtils;
import renastech.utilities.DriverUtil;

public class C4_ExplicitWaitExamples {

    @Test
    public void TC1_seleniumExplicitWaitPractice(){
        //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
        //click on start timer button
        //after clicking verify Webdriver is present on the page

        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        //to be able to use explicit wait you need to create an obcejt from WebDriverWait (which comes from selenium)
        //you can specify the time
        WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),20);

        //click on start timer button
        WebElement clickButton=DriverUtil.getDriver().findElement(By.xpath("//button[.='Click me to start timer']"));
//        clickButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(clickButton)).click();
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Click me to start timer']")));

        WebElement text=DriverUtil.getDriver().findElement(By.id("demo"));
        System.out.println("text.getText() = " + text.getText());

        //after clicking verify Webdriver is present on the page
//        BrowserUtils.wait(5);
        System.out.println("text.getText() = " + text.getText());

//        WebElement webdrivertext2=DriverUtil.getDriver().findElement(By.xpath("//p[.='WebDriver']")); this will fail beacuese element not presnet on the page
        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//p[.='WebDriver']"}


        //after clicking verify Webdriver is present on the page
        //this line will wait until element to be located in the page whihc we have webdriver
        WebElement webDriverText=webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.='WebDriver']")));

        System.out.println(webDriverText.getText());
        Assert.assertEquals(webDriverText.getText(),"WebDriver");



    }


    //org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located
    // by By.xpath: //p[.='WebDriver'] (tried for 5 second(s) with 500 milliseconds interval)
}
