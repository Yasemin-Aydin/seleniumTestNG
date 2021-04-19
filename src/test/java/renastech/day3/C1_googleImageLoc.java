package renastech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_googleImageLoc {
    public static void main(String[] args) {
        //Task:Google Image link
        //1- Open a chrome browser and go to google
        //2- Click to Image link from top right
        //3- Verify Title contains Image

        //1- Open a chrome browser and go to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        //2- Click to Image link from top right
        driver.findElement(By.linkText("Images")).click();
//        driver.findElement(By.partialLinkText("Imag")).click();
        // webelemt also has classname attribute but it is not unique so it is not good idea to use.

        //3- Verify Title contains Image
        String actualTitle=driver.getTitle();
        String containedTitle="Image";

        if (actualTitle.contains(containedTitle)){
            System.out.println("Google Image Title Verification has Passed");
        }else {
            System.out.println("Google Image Title Verification has Failed");
            System.out.println("actualTitle = " + actualTitle);
        }
    }
}
