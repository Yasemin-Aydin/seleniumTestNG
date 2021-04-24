package renastech.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import renastech.utilities.DriverUtil;

public abstract class  BasePage {
//    IN POM Design you need to have some structure for each page :
//            1.PageFactory.initElements(driver, this);    this one will be coomen for all page so we are going to store in the base

    //others  is unique for each page
//		-> It creates connection in between driver and object of the class.
//            2. @FindBy annotation to locate webElements.
//            -> Using this FindBy annotation, help us to locate web elements.
//3. Create methods related webelements

    protected WebDriverWait webDriverWait=new WebDriverWait(DriverUtil.getDriver(),15);

    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

}
