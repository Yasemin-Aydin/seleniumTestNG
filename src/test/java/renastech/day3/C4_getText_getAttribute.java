package renastech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_getText_getAttribute {

    public static void main(String[] args) {
        //create connection between selenium and browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        //locate gmail button
       WebElement gmailButton= driver.findElement(By.linkText("Gmail"));

        System.out.println(gmailButton.getText());
        System.out.println(gmailButton.getAttribute("href"));

        WebElement aboutButton=driver.findElement(By.className("MV3Tnb")) ;
        System.out.println("aboutButton.getText() = " + aboutButton.getText());


    }
}
