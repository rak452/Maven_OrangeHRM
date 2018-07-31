import org.openqa.selenium.By;

public class Utils extends BasePage
{
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    public static String getText(By by)
    {
        driver.findElement(by).isDisplayed();
        return driver.findElement(by).getText();
    }
}
