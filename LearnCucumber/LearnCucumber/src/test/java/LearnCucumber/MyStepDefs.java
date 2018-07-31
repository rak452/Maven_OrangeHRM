package LearnCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    Homepage homepage = new Homepage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Given("^user is on log in page$")
    public void user_is_on_log_in_page()  {
    }

    @When("^he enters username and password$")
    public void he_enters_username_and_password()
    {
        homepage.enterLogInCredentials();

    }

    @When("^he clicks on log in button$")
    public void he_clicks_on_log_in_button()  {
        homepage.clicksOnSubmitButton();
    }

    @Then("^he should able to log in successfully$")
    public void he_should_able_to_log_in_successfully()  {
        myAccountPage.verifyUserIsSuccessfullyLoggedIn();
    }

    @When("^he enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void heEntersInvalidAnd(String username, String password)  {
        homepage.enterInValidCredentials(username, password);
    }

    @Then("^he should not able to log in with \"([^\"]*)\"$")
    public void heShouldNotAbleToLogInWith(String errorMessage)  {
        myAccountPage.verifyUserIsNotLoggedIn(errorMessage);
    }


}
