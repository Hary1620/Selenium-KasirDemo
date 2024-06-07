package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement fieldUserName;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement fieldPassword;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement buttonLogin;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelProduct;
    @FindBy(xpath = "//h3[.='Epic sadface: Sorry, this user has been locked out.']")
    private WebElement errorMessage;
    @FindBy (xpath = "//div[@class='login_wrapper']")
    private WebElement loginPage;
    @FindBy (xpath = "//img[@alt='Sauce Labs Backpack']")
    private WebElement problemdashboard;



    public void inputFieldUserName(String userName){
        sendKeys(fieldUserName, userName);
    }
    public void inputFieldPassword(String password){
        sendKeys(fieldPassword, password);
    }
    public void clickButtonLogin(){
        scrollIntoView(buttonLogin);
        waitForElementClickable(buttonLogin);
        click(buttonLogin);
    }
    public boolean verifyLabelProduct(){
        waitForElementVisible(labelProduct);
        return isDisplayed(labelProduct);
    }

//    public boolean isLabelProductPresent() {
//        try {
//            return loginPage.isDisplayed();
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
    public boolean loginpage(){
        waitForElementVisible(loginPage);
        return isDisplayed(loginPage);
    }

    public boolean verifyLoginPage(){
        waitForElementVisible(fieldUserName);
        waitForElementVisible(fieldPassword);
        waitForElementVisible(buttonLogin);
        return isDisplayed(fieldUserName) && isDisplayed(fieldPassword) && isDisplayed(buttonLogin);
    }
    public String getPopUpMessage() {
        // Menunggu hingga elemen pesan kesalahan muncul
        waitForElementVisible(errorMessage);
        return errorMessage.getText();
    }

    public boolean verifyproblemdashboard(){
        waitForElementVisible(problemdashboard);
        return isDisplayed(problemdashboard);
    }



}
