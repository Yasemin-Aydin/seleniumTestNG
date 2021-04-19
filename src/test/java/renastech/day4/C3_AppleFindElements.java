package renastech.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import renastech.utilities.WebDriverUtil;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C3_AppleFindElements {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        //3. Click to iPhone
        //4. Print out the texts of all links


        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        //3. Click to iPhone
        //xpath has abilty to go from child to parent
        //to be able to go from child to parrent you will need to use /..
        driver.findElement(By.xpath("//span[.='iPhone']/..")).click();

        //4. Print out the texts of all links
        //Also get all links and count how many has text
        //also check how many doesnt has any text

        //First store every element in the list who has a tag
        //a tag means which also might have href which link attribute
        List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));

        int linkWithoutText=0; // empty int to count eleements that doesnt have any text
        int linkWithText=0;  // empty int to count eleements that  have  text

        //since we dont know the size we will use foreach loop to cehck everything in list
        for (WebElement link : allLinks){
            String textElements=link.getText(); // ""  "apple"
            System.out.println(textElements);

            if (textElements.isEmpty()){
                linkWithoutText++; //"" 1
            }else {
                linkWithText++; //"apple" 1
            }
        }

        System.out.println("linkWithoutText = " + linkWithoutText);
        System.out.println("linkWithText = " + linkWithText);
        System.out.println("allLinks.size() = " + allLinks.size());

    }
}
