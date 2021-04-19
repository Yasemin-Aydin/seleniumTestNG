package renastech.day2;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_facebookTitleVerification {

    public static void main(String[] args) {
        //TC #1: Facebook title verification
        //Task - 1
        //Open Chrome Browser
        //Go to https://www.facebook.com
        //Verify title: Expected: "Facebook - Log In or Sign Up"

        //1.Open Chrome Browser
        //setup browser and create connection between selenium and browser
        WebDriverManager.chromedriver().setup();
        //create instance of driver
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3.Verify title: Expected: "Facebook - Log In or Sign Up"
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Facebook Title Verifiction Passed!!");
        }else {
            System.out.println("Facebook Title Verification Failed!!!");
            System.out.println("Current title is : "+actualTitle);
        }


        //manually import on the mac option enter
        //control enter for windows
    }
}
