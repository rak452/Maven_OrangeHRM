package nopCommerce_Registration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSetup extends BasePage {
    LoadProp loadProp=new LoadProp();

    public void selectBroswer()
    {

        String browser = loadProp.getProperty("browser");

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver", "BrowserDriver/IEDriverServer.exe");
            driver =  new InternetExplorerDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.FireFox.driver", "BrowserDriver/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else
        {
            System.out.println("wrong browser name or empty :"+browser);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
//      public void selectBrowser()
//      {
//        LoadProp loadProp = new LoadProp;
//        String browser = loadProp.getProperty("browser"); }
//    if(browser.equalsIgnoreCase("Chrome"))
//    {
//
//    }

}
