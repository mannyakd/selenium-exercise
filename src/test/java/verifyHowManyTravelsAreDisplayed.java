import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.carnivalPage;

import java.util.ArrayList;
import java.util.List;

public class verifyHowManyTravelsAreDisplayed extends setup{

    @BeforeTest
    public void openUrl(){
        openBrowser();
        goToUrl("https://www.carnival.com/");
    }

    @Test
    public void runTest() throws InterruptedException {
        // initialize elements
        carnivalPage carnivalPage = new carnivalPage(driver);

        // close the advertisement
        try{
            carnivalPage.popup.isDisplayed();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.querySelector('body:nth-child(2) div.vifp-sweeps-modal:nth-child(2) div.vifp-blue-background > div.vifp-close:nth-child(12)', ':before').click();");
        } catch (NoSuchElementException e){
            System.out.println("Popup is not displayed this time");
        }

        // click on Plan button
        carnivalPage.clickOnElement(carnivalPage.planBtn);

        // count how many travels are displayed
        List<WebElement> elements = driver.findElements(By.tagName("article"));

        System.out.println(elements.size());
            
        Thread.sleep(5000);

    }

    @AfterTest
    public void close(){
        closeBrowser();
    }

}
