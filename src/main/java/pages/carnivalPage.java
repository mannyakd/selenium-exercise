package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class carnivalPage {
    public WebDriver driver;

    public carnivalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    /*
     * ELEMENTS
     */
    @FindBy(css = "body:nth-child(2) > div.vifp-sweeps-modal:nth-child(2)")
    public WebElement popup;

    @FindBy(css = "body:nth-child(2) div.vifp-sweeps-modal:nth-child(2) div.vifp-blue-background > div.vifp-close:nth-child(12)")
    public WebElement popupXBtn;

    @FindBy(css = "div.clearfix.ccl-desktop:nth-child(8) div.cclr-global-header-wrapper header.cgh-header div.cgh-header__menu-wrapper nav.cgh-header__main-menu div.cgh-header__main-menu-options-wrapper ul.cgh-header__main-menu-options.cgh-header__main-menu-options--left:nth-child(1) li.cgh-header__main-menu-item:nth-child(4) div.cgh-accordion a.cgh-accordion__toggle.cgh-accordion__toggle--desktop:nth-child(1) > span.cgh-accordion__toggle-text")
    public WebElement planBtn;

    /*
     * CLICKS
     */
    public void clickOnElement (WebElement element){
        element.click();
    }





}
