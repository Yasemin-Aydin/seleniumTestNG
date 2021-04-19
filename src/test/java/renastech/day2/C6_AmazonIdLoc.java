package renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C6_AmazonIdLoc {

    public static void main(String[] args) {
        //1.open Chrome browser
        //2.Go to https://www.amazon.com
        //3.type laptop on search box then
        //4.click on search button
        //5.verify title

        //1.open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //2.Go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3.type laptop on search box then
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
        //automation will check all html code who has id attribute which equals to twotabsearchtextbox
        //then it will locate and it will send key as laptop

        //4.click on search button
        driver.findElement(By.id("nav-search-submit-button")).click();

    }
}
