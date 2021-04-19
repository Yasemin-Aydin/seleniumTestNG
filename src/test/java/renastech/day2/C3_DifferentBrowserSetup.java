package renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class C3_DifferentBrowserSetup {
    public static void main(String[] args) {
        //Setup for chrome
        //Before you run make sure you have chrome browser in your computer
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();

        //Before you run make sure you have opera browser in your computer
//        WebDriverManager.operadriver().setup();
//        WebDriver driver2=new OperaDriver();
        //Since i dont have opera in my computer i will receive an exception
        //selenium.WebDriverException: unknown error: cannot find Opera binary

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver3=new FirefoxDriver();
        WebDriverManager.iedriver().setup();
        WebDriverManager.edgedriver().setup();
    }
}
