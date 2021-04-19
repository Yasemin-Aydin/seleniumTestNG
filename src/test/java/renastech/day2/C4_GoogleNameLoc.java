package renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C4_GoogleNameLoc {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write “orange” in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with “orange” word
        //6-navigate back
        //7-write banana in search box
        //8-verify title contains banana.

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Write “orange” in search box
//        driver.findElement(By.name("q")).sendKeys("renastech");
        driver.findElement(By.name("q")).sendKeys("orange");
        //findElement method will check all html code which has name tag whihc equal =q ;
        //sendkeys will sent a key to the web element

        Thread.sleep(2000);
        //4- Click google search button
        driver.findElement(By.name("btnK")).click();
        //first it is going to locate search button then it will click the button


        //5- Verify title:
        //Expected: Title should start with “orange” word
        String expectedTitle="orange";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Passed for orange");
        }else{
            System.out.println("Failed for orange");
            System.out.println(actualTitle);
        }



        //6-navigate back
        driver.navigate().back();
        //7-write banana in search box
        driver.findElement(By.name("q")).sendKeys("Banana" + Keys.ENTER);
        //first it will find the search box element then it will click enter with Keys.Enter method
        //8-verify title contains banana.
        String expectedTitle2="Banana";
        String actualTitle2=driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Passed for Banana");
        }else{
            System.out.println("Failed for Banana");
            System.out.println(actualTitle);
        }

        driver.close();
    }
}
