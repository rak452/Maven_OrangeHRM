import org.openqa.selenium.By;
import org.testng.Assert;

public class MyAccountPage extends Utils

{

    private By _myAccountpageHeadingText = By.xpath("//div[@class='head']");
   // private By _errorMesssageText = By.cssSelector("div.alert.alert-danger>ol>li");

    String expectedPageTitleText = "Dashboard";

    public void verifyUserIsSuccessfullyLoggedIn(){
        System.out.println(getTextFromElement(_myAccountpageHeadingText));
        Assert.assertTrue(getTextFromElement(_myAccountpageHeadingText).contains(expectedPageTitleText));
    }

    public void verifyUserIsNotLoggedIn(String errorMessage){
        //Assert.assertTrue(getTextFromElement(_errorMesssageText).contains(errorMessage));
    }
}
