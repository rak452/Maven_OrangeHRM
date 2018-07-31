package Maven2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef

{

    HomePage homePage=new HomePage();
    DashBoard dashBoard=new DashBoard();
   // MyAccountPage myAccountPage=new MyAccountPage();
    @Given("^user is on login page$")
    public void user_is_on_login_page()
    {

    }

    @When("^user enters Username and Password$")
    public void user_enters_Username_and_Password()
    {
        homePage.enterValidCredentials();

    }
    @When("^user clicks on login page$")
    public void user_clicks_on_login_page()
    {
        homePage.clickOnLoginButton();
    }

    @Then("^user should be able to login successfully$")
    public void user_should_be_able_to_login_successfully()
    {

        //myAccountPage.verifyUserIsSuccessfullyLoggedIn();
       dashBoard.dashboardPage();
    }

    @When("^enters invalid\"([^\"]*)\" and \"([^\"]*)\"$")
    public void enters_invalid_and(String username, String password)
    {
        homePage.enterInValidCredentials(username,password);

    }

    @When("^user click on login button$")
    public void user_click_on_login_button()
    {

        homePage.clickOnLoginButton();
    }

    @Then("^user should not be able to login with \"([^\"]*)\"$")
    public void user_should_not_be_able_to_login_with(String errormessage)

    {
        homePage.userIsNotLoggedIn(errormessage);
        //myAccountPage.verifyUserIsNotLoggedIn(errormessage);
    }

}
