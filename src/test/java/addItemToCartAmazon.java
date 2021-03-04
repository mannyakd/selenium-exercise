import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.amazonPage;

public class addItemToCartAmazon extends setup{
    @BeforeTest
    public void openUrl(){
        openBrowser();
        goToUrl("https://www.amazon.com.mx/");
    }

    @Test
    public void runTest() throws InterruptedException {
        // initialize
        amazonPage amazonPage = new amazonPage(driver);

        // Go to the url
        driver.get("https://www.amazon.com.mx/");

        // Search an item in amazon
        amazonPage.setSearchTxt("switch");

        // Select the item
        amazonPage.clickOnItem();

        //Select the quantity
        amazonPage.clickOnQuantityDropbox();
        amazonPage.clickOnQuantityOption();

        //Click on add to cart button
        amazonPage.clickOnAddToCartButton();

        //Click on add to cart button
        amazonPage.clickOnCartButton();


        Thread.sleep(3000);

    }


    @AfterTest
    public void close(){
        closeBrowser();
    }
}
