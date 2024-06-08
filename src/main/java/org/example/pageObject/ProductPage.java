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



    @FindBy(id = "shopping_cart_container")
    private WebElement cart;

    @FindBy (xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;


    @FindBy (xpath = "//option[.='Name (A to Z)']")
    private WebElement sortAtoZ;

    @FindBy (xpath = "//option[.='Name (Z to A)']")
    private WebElement sortZtoA;

    @FindBy (xpath = "//option[.='Price (low to high)']")
    private WebElement sortPricelowtohigh;

    @FindBy (xpath = "//option[.='Price (high to low)']")
    private WebElement sortPricehightolow;

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement BtnaddtocartSaucelabsOnesie;

    @FindBy (xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement BtnaddtocartTshirtRed;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddTocardSauceLabsBackpackk;

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement BtnaddtocartSaucelabsbikelight;




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


    //Add To cart Feature
    public void clickAddToCartSauceLabsBackpack(){
        scrollIntoView(btnAddTocardSauceLabsBackpackk);
        waitForElementClickable(btnAddTocardSauceLabsBackpackk);
        click(btnAddTocardSauceLabsBackpackk);
    }

    public void clickAddToCartSaucelabsBikeLight(){
        scrollIntoView(BtnaddtocartSaucelabsbikelight);
        waitForElementClickable(BtnaddtocartSaucelabsbikelight);
        click(BtnaddtocartSaucelabsbikelight);
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

    public boolean verifySortProductSauceLabIsDisplay(){
        return isDisplayed(sortProduct);
    }

    public void clickSortProductSauceLab(){
        scrollIntoView(sortProduct);
        waitForElementClickable(sortProduct);
        click(sortProduct);
    }

//Sort Feature
    public void clickSortZtoA(){
        sortProduct.click();
        scrollIntoView(sortProduct);
        waitForElementClickable(sortProduct);
        click(sortZtoA);
    }

    public void clickSortAtoZ(){
//        selectByVisibleText(sortAtoZ,filterAtoZ);
        scrollIntoView(sortProduct);
        waitForElementClickable(sortProduct);
        sortProduct.click();  // Klik dropdown pengurutan
        waitForElementClickable(sortAtoZ);
        sortAtoZ.click();
    }

    public void clickSortLowtoHigh(){
        sortProduct.click();
        scrollIntoView(sortProduct);
        waitForElementClickable(sortProduct);
        click(sortPricelowtohigh);
    }

    public void clickSortHightoLow(){
        sortProduct.click();
        scrollIntoView(sortProduct);
        waitForElementClickable(sortProduct);
        click(sortPricehightolow);
    }


}
