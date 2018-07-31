package LearnCucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;


public class Hooks extends BasePage{

    BrowserFactory browserFactory = new BrowserFactory();
    LoadProperties loadProperties = new LoadProperties();

    @Before
    public void setUp() {
        browserFactory.selectBrowser();
        driver.get(loadProperties.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
