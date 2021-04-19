package renastech.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {


//        WebDriverManager.chromedriver().setup()
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com");

    public static WebDriver getDriver(String browser){
        //this method will accept String name which is a browser name
        //this will return a webdriver

        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Browser does not exist!!");
            System.out.println("Check Browser Name");
            System.out.println("Current Browser Name is "+browser);
            return null;
        }

    }


}
