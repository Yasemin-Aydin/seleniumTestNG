package renastech.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {

    //to make it singleton driver we need to have priavete constractor
    //so noone can create an object from class directlly

    private DriverUtil(){ // since i made priavate you wont be able to create an object from here
    }

    private static WebDriver driver; //making private will help us to get in the getter method
    //this also an example of how you use encapsulation

    //you need a getter method to use your priavate singleton webdriver
    public static WebDriver getDriver(){
        if (driver==null) {
            //since we have properties file we will get browser type from there
            String browser=PropertiesReadingUtil.getProperties("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break; // break means if the case correct it wont check other cases
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }
        }

        return driver;
    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit(); // quit will close everytingh
            //close only close current tab that you are working
            driver=null;
        }
    }

}
