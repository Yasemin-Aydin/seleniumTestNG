package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RenasTechPracticePage extends BasePage {

    //locating iframe on the renastechpage
    @FindBy(id = "courses-iframe") // findby comes from selenium and it help us to locate our web elements
    public WebElement iframe;

}
