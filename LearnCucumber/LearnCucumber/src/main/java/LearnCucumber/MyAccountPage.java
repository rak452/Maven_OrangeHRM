package LearnCucumber;

import org.openqa.selenium.By;
import org.testng.Assert;


public class MyAccountPage extends Utils {

    private By myAccountpageHeadingText = By.xpath("//h1[@class='page-heading']");
    private By errorMesssageText = By.cssSelector("div.alert.alert-danger>ol>li");

    String expectedPageTitleText = "MY ACCOUNT";

    public void verifyUserIsSuccessfullyLoggedIn(){
        //System.out.println(getTextFromElement(myAccountpageHeadingText));
        Assert.assertTrue(getTextFromElement(myAccountpageHeadingText).contains(expectedPageTitleText));
    }

    public void verifyUserIsNotLoggedIn(String errorMessage){
        Assert.assertTrue(getTextFromElement(errorMesssageText).contains(errorMessage));
    }

}
