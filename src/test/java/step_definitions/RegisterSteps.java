package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {
    private final WebDriver driver = Hooks.driver;
    RegisterPage registerPage = new RegisterPage(driver);


    @When("user click a teks {string}")
    public void userClickATeks(String register) {
        registerPage.clickButtonRegisterPage();
    }

    @And("User should be directed to the register page")
    public void userShouldBeDirectedToTheRegisterPage() {
        Assert.assertTrue(registerPage.verifyregisterpage());
    }

    @And("User input {string} as shop name and user input {string} as email and user input {string} as password and click register")
    public void userInputAsMarketNameAndUserInputAsEmailAndUserInputAsPasswordAndClickRegister(String shopName, String email, String password) {
        registerPage.inputfieldShopName(shopName);
        registerPage.inputfieldEmail(email);
        registerPage.inputfieldPassword(password);
        registerPage.clickButtonRegister();
    }

    @Then("User should be directed to login page")
    public void userShouldBeDirectedToLoginPage() {
        Assert.assertTrue(registerPage.verifyloginpage());
    }
}
