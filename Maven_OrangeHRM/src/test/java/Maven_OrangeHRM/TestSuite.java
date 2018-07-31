package Maven_OrangeHRM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuite extends BaseTest
{
    String result;
//public void toVerfiyUserIsOnHomePage()
//{
//
//
//
//}
    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully()
{
    System.out.println("Hello");
    enterText(By.xpath("//input[@id=\"txtUsername\"]"),"Admin");
    enterText(By.xpath("//input[@id=\"txtPassword\"]"),"admin123");
    clickOnElement(By.xpath("//input[@id=\"btnLogin\"]"));
    Assert.assertEquals((result=getTextfromElement(By.xpath("//a[@id=\"welcome\"]"))),"Welcome Admin");
    System.out.println(result);
}
}
