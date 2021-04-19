package renastech.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3_GoogleTitleVerification {

    public static void main(String[] args) throws InterruptedException {
        //        Task
        //1.Open Chrome Browser
        //2.Go to google
        //3.Verify title : Expected : Google


        //1.Open Chrome Browser
        //Create connection between driver and selenium
        WebDriverManager.chromedriver().setup();
        //Create an instance of driver
        WebDriver driver=new ChromeDriver();

        //Maximaze page
        driver.manage().window().maximize();

        //2.Go to google
        driver.get("https://www.google.com");
        driver.navigate().back();
        Thread.sleep(2000);

//        System.out.println(driver.getTitle());
        //3.Verify title : Expected : Google
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Google Title Verification Has Passed !");
        }else {
            System.out.println("Google Title Verification Has Failed!!!");
            System.out.println("Title is :"+driver.getTitle());
        }

        driver.close();

    }
}
