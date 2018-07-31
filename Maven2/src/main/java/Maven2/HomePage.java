package Maven2;
import org.testng.Assert;
import org.openqa.selenium.By;

public class HomePage extends Utils

{

    LoadProp loadProp=new LoadProp();
    private By _usernameFeild= By.xpath("//input[@id=\"txtUsername\"]");
    private By _passwordFeild=By.xpath("//input[@id=\"txtPassword\"]");
    private By _logoinButton=By.xpath("//input[@id=\"btnLogin\"]");
    private By _getMessageText=By.xpath("//span[@id=\"spanMessage\"]");

    public void enterValidCredentials()
    {

        enterText(_usernameFeild,loadProp.getProperty("Username"));
        enterText(_passwordFeild,loadProp.getProperty("Password"));
    }

    public void enterInValidCredentials(String username,String password)
    {

        enterText(_usernameFeild,username);
        enterText(_passwordFeild,password);
    }

    public void clickOnLoginButton()
    {
      clickOnElement(_logoinButton);
    }
    public void userIsNotLoggedIn(String errormessage)
    {
        Assert.assertTrue(getTextFromElement(_getMessageText).contains(errormessage));
    }
}
