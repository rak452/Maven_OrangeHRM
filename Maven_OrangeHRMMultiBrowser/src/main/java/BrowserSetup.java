import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserSetup extends BasePage

{

    LoadProp loadProp = new LoadProp();

    public void selectBroswer() {

        String browser = loadProp.getProperty("browser");

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/Resources/BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "src/test/Resources/BrowserDriver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.FireFox.driver", "src/test/Resources/BrowserDriver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("wrong browser name or empty :" + browser);
        }
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}