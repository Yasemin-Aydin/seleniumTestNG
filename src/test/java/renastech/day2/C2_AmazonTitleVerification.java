package renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //Task - 2
        //Open Chrome Browser
        //Go to google
        //Navigate back
        //Navigate forward
        //Navigate to https://www.amazon.com
        //Verify title contains : Electronics

        //1.Open Chrome Browser
        //setup connection
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2.Go to google
        driver.get("https://www.google.com");

        //navigate back
        driver.navigate().back(); // this will take you back to to empty page
        //navigate forword
        driver.navigate().forward(); // this line will take you to google
        //Navigate to https://www.amazon.com
        Thread.sleep(2000); // we waited 2 second
        driver.navigate().to("https://www.amazon.com"); // navigate to amazon.com

        //Verify title contains : Electronics
        String actualTitle=driver.getTitle();
        String containsTitle="Electronics";
        if (actualTitle.contains(containsTitle)) {
            System.out.println("Amazon Title Contains Electronics Passed!");
        }else{
            System.out.println("Amazon Title Doesnt contain Electronics Failed");
            System.out.println(actualTitle);
        }


    }
}
