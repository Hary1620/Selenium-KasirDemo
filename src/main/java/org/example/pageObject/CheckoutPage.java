package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="first-name")
    private WebElement firstNameCheckout;

    @FindBy(id ="last-name")
    private WebElement lastNameCheckout;

    @FindBy(id ="postal-code")
    private WebElement postalCodeCheckout;

    @FindBy(id ="continue")
    private WebElement continueCheckout;

    @FindBy(id ="finish")
    private WebElement btnFinish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement titleThankYouForOrder;

    public void inputFirstNameCheckout(String firstName){
        clear(firstNameCheckout);
        sendKeys(firstNameCheckout, firstName);
    }

    public void inputLastNameCheckout(String lastName){
        clear(lastNameCheckout);
        sendKeys(lastNameCheckout, lastName);
    }

    public void inputPostalCodeCheckout(String postCode){
        clear(postalCodeCheckout);
        sendKeys(postalCodeCheckout, postCode);
    }

    public void clickContinueCheckoutButton(){
        waitForElementClickable(continueCheckout);
        click(continueCheckout);
    }

    public void clickFinishButton(){
        waitForElementClickable(btnFinish);
        click(btnFinish);
    }

    public String getTitleThankyouForOrder(){
        return getText(titleThankYouForOrder);
    }

}
