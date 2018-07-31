import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage
{

    BrowserFactory browserFactory = new BrowserFactory();
    LoadProp loadProp = new LoadProp();

    @Before
    public void setUp() {
        browserFactory.selectBrowser();
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
