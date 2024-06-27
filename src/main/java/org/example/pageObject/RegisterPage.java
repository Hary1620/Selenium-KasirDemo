package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
     @FindBy (xpath = "//a[.='ingin mencoba, daftar ?']")
    private WebElement buttonregisterpage;

    @FindBy (xpath = "//input[@id='name']")
    private WebElement fieldshopname;

    @FindBy (xpath = "//input[@id='email']")
    private WebElement fieldemail;

    @FindBy (xpath = "//input[@id='password']")
    private WebElement fieldPassword;

    @FindBy (xpath = "//button[@class='chakra-button css-1n8i4of']")
    private WebElement buttonregister;

    @FindBy (xpath = "//button[@class='chakra-button css-1n8i4of']")
    private WebElement verifyloginpage;




    public void clickButtonRegisterPage(){
        scrollIntoView(buttonregisterpage);
        waitForElementClickable(buttonregisterpage);
        click(buttonregisterpage);

    }

    public boolean verifyregisterpage(){
        waitForElementVisible(buttonregister);
        return isDisplayed(buttonregister);
    }

    public boolean verifyloginpage(){
        waitForElementVisible(verifyloginpage);
        return isDisplayed(verifyloginpage);
    }

    public void inputfieldShopName(String ShopName) {sendKeys(fieldshopname,ShopName);}
    public void inputfieldEmail(String Email) {sendKeys(fieldemail,Email);}
    public void inputfieldPassword(String Password) {sendKeys(fieldPassword,Password);}
    public void clickButtonRegister(){
        scrollIntoView(buttonregister);
        waitForElementClickable(buttonregister);
        click(buttonregister);

    }

}
