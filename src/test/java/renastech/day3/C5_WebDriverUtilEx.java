package renastech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import renastech.utilities.WebDriverUtil;

public class C5_WebDriverUtilEx {

    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com");
//        WebDriver driver= WebDriverUtil.getDriver("Chrome");
        WebDriver driver= WebDriverUtil.getDriver("firefox");

        driver.get("https://www.google.com");
    }
}
