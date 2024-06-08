package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="checkout")
    private WebElement btnCheckout;

    @FindBy (xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement btnremovetshirtred;

    @FindBy (xpath = "//button[@id='continue-shopping']")
    private WebElement btnContinueshopping;

    @FindBy (xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement tittleProductAllTheThingsTShirtRed;

    public void clickCheckout(){
        waitForElementClickable(btnCheckout);
        click(btnCheckout);
    }

    public void clickRemove(){
        waitForElementClickable(btnremovetshirtred);
        click(btnremovetshirtred);
    }
    public boolean verifyRemoveProductAllTheThingsTShirtRed(){
        return isDisplayed(tittleProductAllTheThingsTShirtRed);
    }

    public void clickContinueShopping(){
        waitForElementClickable(btnContinueshopping);
        click(btnContinueshopping);
    }


}
