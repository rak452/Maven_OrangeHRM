package AddToShoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

//    public static void waitForElementToBeSelected(By by, int time)
//    {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeSelected(by));
//    }
//    public static void waitForElementToBeClickable(int time,By by)
//    {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(by));
//    }
    public static void SelectFromDropdown(String dropdown, String chooseValue)

    {
        Select droplist = new Select(driver.findElement(By.name(dropdown)));
        droplist.selectByVisibleText(chooseValue);

    }

    public static void SelectFromDropList(String droplist, int chooseValue)

    {
        Select list = new Select(driver.findElement(By.id(droplist)));
        list.selectByIndex(chooseValue);
    }

    public static void clearAndEnterText(By by, String text)

    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static void enterText(By by, String text)

    {
        driver.findElement(by).sendKeys(text);

    }

    // select from visible text
    public static  void selectFromListByText(By element, String text)

    {
        new Select(driver.findElement(element)).selectByVisibleText(text);
    }

    //Select from visible number

    public static  void selectFromListBynumber(By element, int number)

    {
        new Select(driver.findElement(element)).selectByVisibleText(String.valueOf(number));
    }

    //Select from visible number

    public static  void selectFromByIndex(By element, int number)

    {
        new Select(driver.findElement(element)).selectByIndex(number);
    }

    //Select from value

    public static  void selectFromListByValue(By element, String text)

    {
        new Select(driver.findElement(element)).selectByValue(text);
    }

    //Wait for element for given time in second

//    public static  void waitForElement(By by, int time)
//
//    {
//        WebDriverWait wait = new WebDriverWait(driver, time);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//    }

    //wait and click

//    public static  void waitAndClick(By by,int time)
//
//    {
//        WebDriverWait wait = new WebDriverWait(driver,time);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//        driver.findElement(by).click();
//    }

    //return timestamp with current yy-day-month-hour-minute

    public static  String timeStamp()

    {
        DateFormat format= new SimpleDateFormat("ddMMyyHHmm");
        return  format.format(new Date());
    }

    //Get text from given location

    public static  String getText(By by)

    {
        driver.findElement(by).isDisplayed();
        return driver.findElement(by).getText();
    }

    //wait for specific text to present on given location

//    public static void waitForText(By by, String text, int time)
//
//    {
//        WebDriverWait wait=new WebDriverWait(driver,time);
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(by,text));
//    }

    //verify element present

    public static boolean isElementDisplayed(By by)

    {
        return driver.findElement(by).isDisplayed();
    }

    //verify element is enabled

    public static boolean isElementEnabled(By by)

    {
        return driver.findElement(by).isEnabled();
    }

    public static void navigateToBack()

    {
        driver.navigate().back();
    }

    //wait for alert to be present
//    public static void isAlertPresent( int time)
//
//    {
//
//        WebDriverWait wait = new WebDriverWait(driver, time);
//        wait.until(ExpectedConditions.alertIsPresent());
//    }

    //wait for element to dis-appear

//    public static void waitForElementDisappear(By by, int time)
//
//    {
//
//        WebDriverWait wait = new WebDriverWait(driver, time);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));//changed
//    }

    //wait for element clickable

//    public static void waitForClickable(By by, int time)
//
//    {
//
//            WebDriverWait wait = new WebDriverWait(driver, time);
//            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
//    }

    //wait for element display

//    public static void waitForElementDisplay(By by, int time)
//
//    {
//
//        WebDriverWait wait = new WebDriverWait(driver, time);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
//    }

//    public static void waitForElementToBeClickable(By by, int time)
//
//    {
//        WebDriverWait wait = new WebDriverWait(driver, time);
//        wait.until(ExpectedConditions.elementToBeClickable(by));
//    }


}
