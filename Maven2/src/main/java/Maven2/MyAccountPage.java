//package Maven2;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//
//public class MyAccountPage extends Utils
//
//{
//
//    private By _myAccountpageHeadingText = By.xpath("//a[@id='welcome']");
//    //private By _errorMesssageText = By.cssSelector("div.alert.alert-danger>ol>li");
//    private By _getMessageText=By.xpath("//span[@id=\"spanMessage\"]");
//
//    String expectedPageTitleText = "Welcome Admin";
//
//    public void verifyUserIsSuccessfullyLoggedIn(){
//        //System.out.println(getTextFromElement(myAccountpageHeadingText));
//        Assert.assertTrue(getTextFromElement(_myAccountpageHeadingText).contains(expectedPageTitleText));
//    }
//
//    public void verifyUserIsNotLoggedIn(String errormessage){
//        Assert.assertTrue(getTextFromElement(_getMessageText).contains(errormessage));
//    }
//}
