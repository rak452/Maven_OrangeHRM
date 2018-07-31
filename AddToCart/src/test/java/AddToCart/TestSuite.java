package AddToCart;

import org.junit.Test;

import static AddToCart.BasePage.driver;

public class TestSuite
{
    @Test
    public void addToCartButtonCheck() {

        By itemBoxesfield=By.className("item-box");
        By addcartButtonfield=By.cssSelector("[type='button'][value='Add to cart']");
        By productnamefield=By.cssSelector("h2.product-title > a");

        List<WebElement> webElementList = driver.findElements(itemBoxesfield);
        int count = 0, nobutton = 0;
        for (WebElement element : webElementList) {

            if (element.findElements(addcartButtonfield).size() == 1) {
                count++;

            }
            if (element.findElements(addcartButtonfield).size() != 1) {
                nobutton++;
                System.out.println(getTextFromElement(productnamefield) + "   NO ADD TO CART BUTTON ");
            }
        }
        System.out.println(count);
        assertEquals(webElementList.size(), count);
    }
