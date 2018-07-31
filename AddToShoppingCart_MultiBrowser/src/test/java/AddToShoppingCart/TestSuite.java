package AddToShoppingCart;

//import com.sun.java.swing.plaf.windows.TMSchema;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static AddToShoppingCart.Utils.*;

public class TestSuite extends BaseTest

{

    @Test
    public void verfiyUserShouldBeAbleToRegisterSuccessfully()

    {
        clickOnElement(By.linkText("Register"));
        driver.findElement(By.xpath("//*[@class=\"forcheckbox\"]")).click(); //Selecting Gender

        // loadProp.getProperty("First name");
        //driver.findElement(By.xpath("//input[@id='FirstName']"));
        //prop.load.input()
        //enterText(By.xpath("//input[@id='FirstName']"),);
        //getClass.(By.name("FirstName"), "Raj");



//        entertext(By.name("LastName"), "Patel");
//        SelectFromDropdown("DateOfBirthDay", "22");
//        SelectFromDropdown("DateOfBirthMonth", "March");
//        SelectFromDropdown("DateOfBirthYear", "1981");
//        String email = "Raj" + timeStamp() + "@gmail.com";
//        clearAndEnterText(By.name("Email"), email);
//        entertext((By.xpath("//input[@id=\"Company\"]")), "ABC");
//        clickOnElement(By.id("Newsletter"));
//        entertext(By.id("Password"), "test123");
//        entertext(By.id("ConfirmPassword"), "test123");
//        clickOnElement(By.xpath("//input[@value=\"Register\"]"));
//       // waitForElementDisplay(By.xpath("//div[@class=\"result\"]"), 5);
//        String expectedConfirmationmethod = "Your registration completed";
//        Assert.assertEquals(getTextFromElement(By.className("result")), expectedConfirmationmethod);


        // Assert.assertEquals(getTextFromElement(By.className("result")), expectedConfirmationmethod);

    }
}
