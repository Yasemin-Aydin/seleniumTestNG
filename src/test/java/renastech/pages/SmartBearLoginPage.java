package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BasePage{ //example of inheritence to extending basepage

    //            2. @FindBy annotation to locate webElements.
//            -> Using this FindBy annotation, help us to locate web elements.
//3. Create methods related webelements

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox; // here you assign id locater to this element

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button" )
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    private WebElement statusMessage;
    //if it is private you cant acces outside of class you need to create a public mettod to get this element (Encapsulation)

    public void loginSmartBear(String username , String password){
        //either you can get from configuratuon file
        // or you can  pass in the method
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public String getStatusMessage(){
        return  statusMessage.getText();
    }


}
