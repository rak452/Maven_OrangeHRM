import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage
{
    BrowserSetup browserSetup= new BrowserSetup();

    @BeforeMethod
    public void openBrowser()
    {
        browserSetup.selectBroswer();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @AfterMethod
    // For taking screenshots when any test cases get fail.
    public  void captureScreenshoot() {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            // System.currentTimeMillis() for taking multiple screenshots. If you dont use it, it will re write old image
            // so if you dont use that you will able to take only one image at a time.
            FileUtils.copyFile(src, new File("src\\test\\Resources\\Properties\\Faliure.png" + System.currentTimeMillis() + "Failure.png"));
            System.out.println("Screenshot taken");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
    @AfterMethod
    public void closeBrowser()
    {
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //driver.close();
    }

}
