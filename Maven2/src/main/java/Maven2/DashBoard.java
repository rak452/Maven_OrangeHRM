package Maven2;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DashBoard extends Utils
{

    private By _pageTitleText = By.xpath("//div[@class='head']/h1");
    String expectedMessageTitle = "Dashboard";

    public void dashboardPage()
    {
        Assert.assertEquals(getTextFromElement(_pageTitleText),expectedMessageTitle);
    }

}
