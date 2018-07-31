package LearnCucumber;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory extends Utils {

    LoadProperties loadProperties = new LoadProperties();
    String selectBrowser = loadProperties.getProperty("browser");

    public void selectBrowser(){
        if (selectBrowser.equalsIgnoreCase("Chrome")){
            System.getProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        }

        else if (selectBrowser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

}
