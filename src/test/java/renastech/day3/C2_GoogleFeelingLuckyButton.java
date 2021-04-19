package renastech.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_GoogleFeelingLuckyButton {

    public static void main(String[] args) throws InterruptedException {
        //TASK: Google Feeling lucky button
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write "apple" in search box
        //click i am feeling lucky button
        //Verify title is Apple

        //1- Open a chrome browser
        //2- Go to: https://google.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        //3- Write "apple" in search box
        //lets try with clasname
//        driver.findElement(By.className("gLFyf gsfi")).sendKeys("Apple");
        //if classname has space in it it is not good idea to use most of the case you will recive an error.
//        driver.findElement(By.className("gLFyf")).sendKeys("Apple");
        //you can remove after space and try to locate if classname is unique
        driver.findElement(By.name("q")).sendKeys("Apple");

        //click i am feeling lucky button
        Thread.sleep(2000);
        driver.findElement(By.className("RNmpXc")).click();


        //verifacation
        String actualTitle=driver.getTitle();
        String expectedTitle="Apple";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Apple Title Verification has Passed");
        }else {
            System.out.println("Apple Title Verification has Failed");
            System.out.println("actualTitle = " + actualTitle);
        }
    }
}
