package Maven_OrangeHRM;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils

{

    BrowserSetup browserSetup=new BrowserSetup();
    LoadProp loadProp=new LoadProp();
    @BeforeMethod
    public void openBrowser()
    {
        //System.setProperty("webdriver.chrome.driver","src/test/Resources/BrowserDriver/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","src/test/Resources/BrowserDriver/chromedriver.exe");
        browserSetup.selectBrowser();
        driver.get(loadProp.getProperty("url"));
        //driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterMethod
    public  void captureScreenshoot()
    {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try
        {
            // now copy the  screenshot to desired location
            // System.currentTimeMillis() for taking multiple screenshots. If you dont use it, it will re write old image
            // so if you dont use that you will able to take only one image at a time.
            FileUtils.copyFile(src, new File("src\\test\\Resourses\\Screenshot" + System.currentTimeMillis() + "\\error.png"));
            System.out.println("Screenshot taken");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }




    @AfterMethod
    public void closeBrowser()
    {
        // driver.close();
    }
}
