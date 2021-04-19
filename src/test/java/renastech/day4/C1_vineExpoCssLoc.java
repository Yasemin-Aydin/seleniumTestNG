package renastech.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C1_vineExpoCssLoc {

    public static void main(String[] args) throws InterruptedException {
        //1.open browser
        //2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button

        WebDriver driver=WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



        WebElement attendButton=driver.findElement(By.cssSelector("a[href='/attend']"));
//        String str=10;
//        Thread.sleep(5000);
        attendButton.click();

        WebElement exchibitorButton=driver.findElement(By.cssSelector("a[href='/exhibitor-list/']"));
        exchibitorButton.click();

    }
}
