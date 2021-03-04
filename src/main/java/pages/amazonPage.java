package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {
    public WebDriver driver;

    public amazonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*
     * ELEMENTS
     */
    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchTxt;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal' and contains(text(), 'Amarillo')]")
    public WebElement item;

    @FindBy(id = "quantity")
    public WebElement quantityDropbox;

    @FindBy(xpath = "//option[contains(text(),'2')]")
    public WebElement quantityOption;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(id = "nav-cart")
    public WebElement cartButton;

    /*
     * ACTIONS
     */
    public void setSearchTxt(String value){
        searchTxt.sendKeys(value);
        searchTxt.sendKeys(Keys.ENTER);
    }

    public void clickOnItem(){
        item.click();
    }

    public void clickOnQuantityDropbox(){
        quantityDropbox.click();
    }

    public void clickOnQuantityOption(){
        quantityOption.click();
    }

    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }

    public void clickOnCartButton(){
        cartButton.click();
    }

}
