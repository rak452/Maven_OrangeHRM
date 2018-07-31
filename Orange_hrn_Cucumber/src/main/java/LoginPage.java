import org.openqa.selenium.By;

public class LoginPage extends Utils

{

    LoadProp loadProp = new LoadProp();

    private By _enterUserNameField = By.xpath("//input[@id='txtUsername']");
    private By _enterPasswordField = By.xpath("//input[@id='txtPassword']");
    private By _signInButton = By.xpath("//input[@id='btnLogin']");

    public void enterLogInCredentials()
    {
        enterText(_enterUserNameField,loadProp.getProperty("txtUsername"));
        enterText(_enterPasswordField,loadProp.getProperty("txtPassword"));
//        enterText(_enterUserNameField,loadProp.getProperty("txtUsername"));
//        enterText(_enterPasswordField,loadProp.getProperty("txtPassword"));
    }

//    public void enterInValidCredentials(String username, String password)
//    {
//        typeText(_enterUserNameField, username);
//        typeText(_enterPasswordField, password);
//    }

    public void clicksOnSubmitButton()
    {
        clickOnElement(_signInButton);
    }
}
