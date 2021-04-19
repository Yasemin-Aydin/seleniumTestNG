package renastech.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_browserNavigation {

    public static void main(String[] args) throws InterruptedException {
        //Create connection between browser and selenium
        WebDriverManager.chromedriver().setup();

        //create an instance of chrome driver
        WebDriver driver=new ChromeDriver();

        //maximaze the page
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        Thread.sleep(2000);
        driver.navigate().back(); // will navigate your browser one step back
        Thread.sleep(2000);
        driver.navigate().forward(); // will navigate your browser one step forward

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        driver.close();


    }
}
