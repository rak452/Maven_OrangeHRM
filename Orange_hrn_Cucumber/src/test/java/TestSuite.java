import org.junit.Test;

public class TestSuite extends Utils
{

    //LoadProp loadProp= new LoadProp();
    LoginPage loginPage = new LoginPage();

    @Test
    public void toverfiyusershouldbeloginsuccessfully()
    {
        loginPage.enterLogInCredentials();
        loginPage.clicksOnSubmitButton();

    }

}
