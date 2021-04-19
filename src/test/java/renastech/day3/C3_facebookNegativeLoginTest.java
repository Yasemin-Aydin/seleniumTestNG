package renastech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_facebookNegativeLoginTest {

    public static void main(String[] args) throws InterruptedException {
        //TASK: Facebook incorrect login title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Enter incorrect username
        //4. Enter incorrect password
        //5. Verify title changed to:
        //Expected: "Log into Facebook"

        //1. Open Chrome browser
        //2. Go to https://www.facebook.com

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("aasdasdmnbmadq23234");
//        driver.findElement(By.name("email")).sendKeys("aasdasdmnbmadq23234");
        //4. Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("asdasd"+ Keys.ENTER);
        //5. Verify title changed to:
        //Expected: "Log into Facebook"
        Thread.sleep(2000);
        //verifacation
        String actualTitle=driver.getTitle();
        String expectedTitle="Log into Facebook";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Facebook negative test Passed");
        }else {
            System.out.println("Facebook negative test has Failed");
            System.out.println("actualTitle = " + actualTitle);
        }
    }
}
