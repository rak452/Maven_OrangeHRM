package Maven_OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage

{

    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static String getTextfromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    public static void waitForTheElementToBeClickable(By by,int time)

    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
}

