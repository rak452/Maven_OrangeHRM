package Dropdown_Date;

import com.sun.org.apache.bcel.internal.generic.Select;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Dropdown_Date.Utils.clickOnElement;
import static Dropdown_Date.Utils.entertext;
import static Dropdown_Date.Utils.getTextFromElement;

public class TestSuite extends BaseTest
{

    @Test
    public void verfiyUserShouldBeOnHomepage()
    {
        Assert.assertEquals(getTextFromElement(By.linkText("Register")),"Register");
    }
    @Test
    public void verfiyUserShouldBeAbleToRegisterSuccessfully()
    {
        //Assert.assertEquals(getTextFromElement(By.linkText("Register")),"Register");
        clickOnElement(By.linkText("Computers"));
        driver.findElement(By.xpath("//*[@class=\"forcheckbox\"]")).click();
        entertext(By.name("FirstName"),"Raj");
        entertext(By.name("LastName"),"Patel");
        Select dropday = new Select(driver.findElement(By.xpath("//*[@name=\"DateOfBirthDay\"]"));
        dropday.selectByIndex(5);
        Select dropmonth = new Select(driver.findElement(By.xpath("//*[@name=\"DateOfBirthMonth\"]"));
        dropmonth.selectByIndex(5);
        Select dropyear = new Select(driver.findElement(By.xpath("//*[@name=\"DateOfBirthYear\"]"));
        dropyear.selectByIndex(11);
        entertext(By.xpath("//input[@id=\"Email\"]"),"test123@gmail.com");
        //driver.findElement(By.id("//input[@id=\"Email\"]")).sendKeys("test123@gmail.com");
        entertext((By.xpath("//input[@id=\"Company\"]")),"ABC");
        //driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("ABC");
        clickOnElement(By.xpath("//input[@value=\"true\"]"));
        //driver.findElement(By.xpath("//input[@value=\"true\"]")).click();
        entertext(By.xpath("//input[@name=\"Password\"]"),"test123");
        //driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("test123");
        entertext(By.xpath("//input[@name=\"ConfirmPassword\"]"),"test123");
        // driver.findElement(By.xpath("//input[@name=\"ConfirmPassword\"]")).sendKeys("test123");
        //driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
        clickOnElement(By.xpath("//input[@value=\"Register\"]"));


    }
}
