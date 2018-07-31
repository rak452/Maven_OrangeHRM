import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class MyStepDefs
{

    LoginPage loginPage = new LoginPage();
    BrowserFactory browserFactory=new BrowserFactory();
    MyAccountPage myAccountPage=new MyAccountPage();

    @Given("^User is on the home page$")
    public void user_is_on_the_home_page()

    {
     // browserFactory.selectBrowser();
    }


    @When("^user enter username and password$")
    public void user_enter_username_and_password()
    {
        loginPage.enterLogInCredentials();
        //loginPage.enterLogInCredentials();

    }
    @When("^user Click on login button$")
    public void user_Click_on_login_button()
    {
        loginPage.clicksOnSubmitButton();
    }

    @Then("^User should be navigate to dashboard$")
    public void user_should_be_navigate_to_dashboard()
    {
        myAccountPage.verifyUserIsSuccessfullyLoggedIn();

    }



}
