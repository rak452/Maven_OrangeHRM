package nopCommerce_Registration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static nopCommerce_Registration.Utils.*;

public class TestSuite extends BaseTest {

//    @Test
//    public void verfiyUserShouldBeOnHomepage() {
//        Assert.assertEquals(getTextFromElement(By.linkText("Register")), "Register");
//    }

    @Test

    public void verfiyUserShouldBeAbleToRegisterSuccessfully()

    {
        clickOnElement(By.linkText("Register"));
        driver.findElement(By.xpath("//*[@class=\"forcheckbox\"]")).click(); //Selecting Gender
        entertext(By.name("FirstName"), "Raj");
        entertext(By.name("LastName"), "Patel");
        SelectFromDropdown("DateOfBirthDay", "22");
        SelectFromDropdown("DateOfBirthMonth", "March");
        SelectFromDropdown("DateOfBirthYear", "1981");
        String email = "Raj" + timeStamp() + "@gmail.com";
        clearAndEnterText(By.name("Email"), email);
        entertext((By.xpath("//input[@id=\"Company\"]")), "ABC");
        clickOnElement(By.id("Newsletter"));
        entertext(By.id("Password"), "test123");
        entertext(By.id("ConfirmPassword"), "test123");
        clickOnElement(By.xpath("//input[@value=\"Register\"]"));
        waitForElementDisplay(By.xpath("//div[@class=\"result\"]"), 5);
        String expectedConfirmationmethod = "Your registration completed";
        Assert.assertEquals(getTextFromElement(By.className("result")), expectedConfirmationmethod);

    }


    @Test
    public void VerifyUserShouldBeAbleToSortBooksCategoryByLowtohighAndCompareTheValues()
    {
        clickOnElement(By.linkText("Books"));
        SelectFromDropList("products-orderby",3);
        SelectFromDropList("products-pagesize",0);
        String firstProductPriceText = getText(By.xpath("//div[1]/div/div[2]/div[3]/div[1]/span[2]"));
        String lastProductPriceText = getText(By.xpath("//div[3]/div/div[2]/div[3]/div[1]/span[2]"));
        double firstProductPrice=Double.parseDouble(firstProductPriceText.replace("$",""));
        double lastProductPrice=Double.parseDouble(lastProductPriceText.replace("$",""));
        Assert.assertTrue(lastProductPrice>firstProductPrice);
        System.out.println(firstProductPrice + ":"+lastProductPrice);
        Assert.assertEquals(getTextFromElement(By.className("prices")),"$35.00 $24.00");
        Assert.assertEquals(getTextFromElement(By.xpath("//*[contains(text(),'$51.00')]")),"$51.00");

    }

    @Test
    public void verifyUserShouldBeAbleToCompare2Products()

    {
        clickOnElement(By.linkText("Books"));
        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[2]/div[3]/div[2]/input[2]"));
        waitForElementDisappear(By.xpath("//*[@href='compareproducts']"), 10);
        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[3]/div/div[2]/div[3]/div[2]/input[2]"));
        //waitForElement(By.className("content"), 5);
       //clickOnElement(By.xpath("//*[@href='compareproducts']"));
        //Assert.assertEquals(getTextFromElement(By.className("content")),"The product has been added to your product comparison");

        clickOnElement(By.linkText("product comparison"));
       // waitForElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1"), 5);
        String expectedCompareMsg = "Compare products";
        Assert.assertEquals(getText(By.xpath("//div[@class='page-title']")),expectedCompareMsg);
        //clickOnElement(By.linkText("product comparison"));
        //String expectedCompareMsg = "Compare products";


    }

    @Test
    public void verifyUserShouldBeAbleToClearCompareProductList()

    {

        clickOnElement(By.xpath("//*[@class='button-2 add-to-compare-list-button'][1]"));
        clickOnElement(By.linkText("product comparison"));
        clickOnElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        clickOnElement(By.xpath("//*[@class='item-grid']/div[4]/div/div[2]/div[3]/div[2]/input[2]"));
        waitForElementDisplay(By.className("content"), 10);
        Assert.assertEquals(getTextFromElement(By.className("content")), "The product has been added to your product comparison");
        clickOnElement(By.linkText("product comparison"));
        clickOnElement(By.className("clear-list"));
        Assert.assertEquals(getTextFromElement(By.className("no-data")), "You have no items to compare.");
    }


    @Test

    public void VerifyUserShouldBeAbleToSeeAppleIcamInShoppingList()


    {

        clickOnElement(By.linkText("Electronics"));
        clickOnElement(By.linkText("Camera & photo"));
        clickOnElement(By.linkText("Apple iCam"));
        clickOnElement(By.id("add-to-cart-button-17"));
        waitForElementDisplay(By.className("content"),10);
        Assert.assertEquals(getTextFromElement(By.className("content")),"The product has been added to your shopping cart");
        clickOnElement(By.linkText("shopping cart"));
        Assert.assertEquals(getTextFromElement(By.className("sku-number")),"APPLE_CAM");
    }

}
