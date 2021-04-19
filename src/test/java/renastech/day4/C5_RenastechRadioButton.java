package renastech.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class C5_RenastechRadioButton {

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        //2. Go to http://renastech.com/?amp
        //testing radio button
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("http://renastech.com/?amp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //if you want to locate by index to get siblings use [number]
        WebElement radioButton1=driver.findElement(By.xpath("//div[@class='radio'][1]"));
        WebElement radioButton2=driver.findElement(By.xpath("//div[@class='radio'][2]"));

        //if you want to locate elements that has multiple result and if they are not siblings youu will need to use  ()[1]
        radioButton1=driver.findElement(By.xpath("(//input[@name='optradio'])[1]"));
        radioButton2=driver.findElement(By.xpath("(//input[@name='optradio'])[2]"));

        if (radioButton1.isSelected()){
            System.out.println("radio1 is selected by default");
        }else{
            System.out.println("radio1 is not selected by default");
        }

        if (radioButton2.isSelected()){
            System.out.println("radio2 is selected by default");
        }else{
            System.out.println("radio2 is not selected by default");
        }

        WebElement radioButton3=driver.findElement(By.xpath("(//input[@name='optradio'])[3]"));

        if (radioButton3.isEnabled()){
            if (radioButton3.isSelected()){
                System.out.println("is enabled and is selected by default");
            }else{
                System.out.println("is enabled but not selected");
            }
        }else {
            System.out.println("element is not enable no need to check if it is selected");
        }


        radioButton2.click();
        Thread.sleep(2000);
        radioButton3.click();
        Thread.sleep(2000);
//        radioButton1.click();

    }
}
