package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    @Given("User open the web kasir demo")
    public void userOpenTheWebKasirDemo() {
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input {string} as email and {string} as password and click login")
    public void userInputAsEmailAndAsPasswordAndClickLogin(String email, String password) {
        loginPage.inputFieldUserName(email);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }

    @When("User input {string} as email and click login")
    public void userInputAsEmailAndClickLogin(String email) {
        loginPage.inputFieldUserName(email);
        loginPage.clickButtonLogin();

    }

    @When("User input {string} as password and click login")
    public void userInputAsPasswordAndClickLogin(String password) {
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }

    @Then("User should be directed to the dashboard page")
    public void userShouldBeDirectedToTheDashboardPage() {
        Assert.assertTrue(loginPage.verifyLabelProduct());
    }


    @Then("system gives pop up message {string}")
    public void systemGivesPopUpMessage(String expectedMessage) {
        String actualMessage = loginPage.getPopUpMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
