import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory extends Utils
{

    LoadProp loadProp = new LoadProp();
    String selectBrowser = loadProp.getProperty("browser");

    public void selectBrowser(){
        if (selectBrowser.equalsIgnoreCase("Chrome")){
            System.getProperty("webdriver.chrome.driver", "BrowerDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (selectBrowser.equalsIgnoreCase("firefox"))

        {
            System.getProperty("webdriver.gecko.driver", "BrowerDriver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    public void closeBrowser(){
        driver.quit();
    }
}
