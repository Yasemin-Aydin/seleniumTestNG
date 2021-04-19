package renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C7_facebookClassNameLoc {
    public static void main(String[] args) {
        //TC #3: Facebook header verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Verify header text is as expected:
        //Expected: “Connect with friends and the world around you on Facebook.”

        //1.open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");


        //3. Verify header text is as expected:
        //Expected: “Connect with friends and the world around you on Facebook.”

        String actualHeadar=driver.findElement(By.className("_8eso")).getText();
        String expectedHeader="Connect with friends and the world around you on Facebook.";

        if (actualHeadar.equals(expectedHeader)){
            System.out.println("Facebook Header Verification Passed");
        }else{
            System.out.println("Facebook Header Verification Failed");
        }

    }
}
