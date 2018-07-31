package Dropdown_Date;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Dropdown_Date.BasePage.driver;

public class Utils extends BasePage

{
    public static void clickOnElement(By by) {
        driver.findElement(by).click();

    }

    public static void entertext(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void dropday(By by) {
        //int dropday = new Select(driver.findElement(By.xpath("//*[@name=\"DateOfBirthDay\"]")));
    }

//    public static String reusableEmailId(String text, long ts)
//    {
//
//        Date date = new date();
//        Timestamp ts = new Timestamp(date.getTime());
//
//
//    }


    public static void waitForElementToBeClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
