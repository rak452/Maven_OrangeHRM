package Maven2;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage

{
    LoadProp loadProp = new LoadProp();
    BrowserSetup browserSetup = new BrowserSetup();

    @Before
    public void setUp() {
        browserSetup.selectBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    //Its giving error Class configuration

//    @After
//    public void captureScreenshot()
//    {
//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        try
//        {
//            FileUtils.copyFile(src,new File("src\\test\\Resources\\ScreenShot" + System.currentTimeMillis() + "\\error.png"));
//            System.out.println("Screenshot taken");
//        } catch (IOException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//
//    }
        @After
        public void teardown()
        {
            driver.close();
        }

}

