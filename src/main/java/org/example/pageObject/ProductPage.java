package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement titleProductSauceLabsBackpack;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement btnRemoveSauceLabsBackpack;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddTocardSauceLabsBackpackk;

    @FindBy(id = "shopping_cart_container")
    private WebElement cart;

    @FindBy (xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;

    @FindBy (xpath = "//option[.='Name (Z to A)']")
    private WebElement sortZtoA;

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement BtnaddtocartSaucelabsOnesie;

    @FindBy (xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement BtnaddtocartTshirtRed;




    public boolean verifyTitleProductSauceLabsBackpack(){
        return isDisplayed(titleProductSauceLabsBackpack);
    }

    public boolean verifyRemoveButtonDisplayOnTheProductSauceLabBackpack(){
        return isDisplayed(btnRemoveSauceLabsBackpack);
    }

    public void clickRemoveButtonProductSauceLabBackpack(){
        scrollIntoView(btnRemoveSauceLabsBackpack);
        waitForElementClickable(btnRemoveSauceLabsBackpack);
        click(btnRemoveSauceLabsBackpack);
    }
    public boolean verifyAddToCartSauceLabsBackpack(){
        return isDisplayed(btnAddTocardSauceLabsBackpackk);
    }
    public void clickAddToCartSauceLabsBackpack(){
        scrollIntoView(btnAddTocardSauceLabsBackpackk);
        waitForElementClickable(btnAddTocardSauceLabsBackpackk);
        click(btnAddTocardSauceLabsBackpackk);
    }
    public void clickAddToCartSauceLabsOnesie() {
        scrollIntoView(BtnaddtocartSaucelabsOnesie);
        waitForElementClickable(BtnaddtocartSaucelabsOnesie);
        click(BtnaddtocartSaucelabsOnesie);
    }

    public void clickAddToCartTShirtRed() {
        scrollIntoView(BtnaddtocartTshirtRed);
        waitForElementClickable(BtnaddtocartTshirtRed);
        click(BtnaddtocartTshirtRed);
    }

    public void clickCart(){
        waitForElementClickable(cart);
        click(cart);
    }

    public boolean verifySortProductSauceLabBackpackIsDisplayed(){
        return isDisplayed(sortProduct);
    }

    public void clickSortProductSauceLabsbackpack(){
        scrollIntoView(sortProduct);
        waitForElementClickable(sortProduct);
        click(sortProduct);
    }

    public void clickSortAtoZ(){
        scrollIntoView(sortProduct);
        waitForElementClickable(sortProduct);
        click(sortZtoA);
    }



}
