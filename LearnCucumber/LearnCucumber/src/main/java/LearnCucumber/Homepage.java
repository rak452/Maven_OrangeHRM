package LearnCucumber;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    LoadProperties loadProperties = new LoadProperties();

    private By enterUserNameField = By.id("email");
    private By enterPasswordField = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");

    public void enterLogInCredentials(){
        typeText(enterUserNameField ,loadProperties.getProperty("username"));
        typeText(enterPasswordField, loadProperties.getProperty("password"));
    }

    public void enterInValidCredentials(String username, String password){
        typeText(enterUserNameField, username);
        typeText(enterPasswordField, password);
    }

    public void clicksOnSubmitButton(){
        clickOnElement(signInButton);
    }
}
