package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RenasTechPracticePage extends BasePage {

    //locating iframe on the renastechpage
    @FindBy(id = "courses-iframe") // findby comes from selenium and it help us to locate our web elements
    public WebElement iframe;

    //locating show button
    @FindBy(id = "show-textbox")
    public WebElement showButton;

    @FindBy(id = "displayed-text")
    public WebElement hiddenBox;

    public void sentTextToHiddenBox(String text){
        //make sure is elemenet clickable
        webDriverWait.until(ExpectedConditions.elementToBeClickable(showButton)).click();

        //make sure element is visible
        webDriverWait.until(ExpectedConditions.visibilityOf(hiddenBox)).sendKeys(text);
    }

}
