package renastech.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_helloSelenium {

    public static void main(String[] args) throws InterruptedException {

        //Create Connection between selenium and browser
        //setup browser type
        WebDriverManager.chromedriver().setup();

        //Create an instance of chromedriver to be able to test with chrome
        WebDriver driver=new ChromeDriver();

        Thread.sleep(2000); // it is going to stop your compiler for 2 second
        driver.manage().window().maximize(); // this line will maximaze your browser

        Thread.sleep(2000);
        //lets go to the renastech page
//        driver.get("https://www.renastech.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println("Url for Driver: " + driver.getCurrentUrl());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // this will print current url that you have

        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl()); //https://www.amazon.com

        System.out.println(driver.getTitle()); // Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
        // This one will print title that you have on your driver

        Thread.sleep(2000);
        driver.close(); // this will close whole browser
//        driver.quit(); // this will close current page

    }
}
