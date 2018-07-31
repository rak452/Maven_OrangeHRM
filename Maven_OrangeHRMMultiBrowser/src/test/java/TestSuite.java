import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends Utils
{
    String result;
    LoadProp loadProp=new LoadProp();
    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully()
    {

        System.out.println("Hello");
//      enterText(By.xpath("//input[@name=\"txtUsername\"]"),loadProp.getProperty("txtUsername"));
//      enterText(By.xpath("//input[@name=\"txtPassword\"]"),loadProp.getProperty("txtPassword"));
        enterText(By.xpath("//input[@id=\"txtUsername\"]"),loadProp.getProperty("txtUsername"));
        enterText(By.xpath("//input[@id=\"txtPassword\"]"),loadProp.getProperty("txtPassword"));
        clickOnElement(By.xpath("//input[@id=\"btnLogin\"]"));
        Assert.assertEquals((result=getTextFromElement(By.xpath("//a[@id=\"welcome\"]"))),"Welcome Admin");
        System.out.println(result);
    }
}
