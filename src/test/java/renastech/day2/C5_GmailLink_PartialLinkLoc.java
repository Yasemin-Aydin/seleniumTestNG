package renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C5_GmailLink_PartialLinkLoc {
    public static void main(String[] args) {
        //1- Open a chrome browser and go to google
        //2- Click to Gmail link from top right
        //3- Verify Title contains Gmail, expected: "Gmail"

        //1- Open a chrome browser and go to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //2- Click to Gmail link from top right
//        driver.findElement(By.linkText("Gmail")).click(); //checks for exact match
        driver.findElement(By.partialLinkText("Gma")).click(); // this will check for matching Gma text
        //this method will check html code and see which link has "Gmail" as a text
        //Then it will click

        //3- Verify Title contains Gmail, expected: "Gmail"
        String actualTitle=driver.getTitle();
        String containTitle="Gmail";

        if (actualTitle.contains(containTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }

    }
}
