package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CartPage;
import org.example.pageObject.ProductPage;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    private WebDriver driver = Hooks.driver;

    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);

    @And("sort product icon is displayed")
    public void sortProductIconIsDisplayed() {
        Assert.assertTrue(productPage.verifySortProductSauceLabIsDisplay());
    }

    @And("user click on sort product icon")
    public void userClickOnSortProductIcon() {
        productPage.clickSortProductSauceLab();
    }

    @And("Choose sort Name {string}")
    public void chooseSortName(String sort) {

        productPage.clickSortZtoA();
        productPage.clickSortAtoZ();
    }

    @And("Choose sort Price {string}")
    public void chooseSortPrice(String arg0) {
        productPage.clickSortLowtoHigh();
        productPage.clickSortHightoLow();
    }

//    @And("Choose sort Name \\(Z to A)")
//    public void chooseSortNameZToA() {
//        productPage.clickSortZtoA();
//    }
//
//
//    @And("Choose sort Name \\(A to Z)")
//    public void chooseSortNameAToZ() {
//        productPage.clickSortAtoZ();
//    }

    @And("user click add to cart product {string} and product {string}")
    public void userClickAddToCartProductAndProduct(String product1, String product2) {
        productPage.clickAddToCartSauceLabsOnesie();
        productPage.clickAddToCartTShirtRed();
//        productPage.clickAddToCartSauceLabsBackpack();
//        productPage.clickAddToCartSaucelabsBikeLight();
    }

    @And("click remove button on product {string}")
    public void clickRemoveButtonOnProduct(String arg0) {
        cartPage.clickRemove();
    }
    public boolean verifyRemoveProduct(){
        try {
            cartPage.verifyRemoveProductAllTheThingsTShirtRed();
            return true;
        }catch (TimeoutException e){
            return false;
        }
    }

    @And("user verify that the product has been deleted")
    public void userVerifyThatTheProductHasBeenDeleted() {
        Assert.assertFalse(verifyRemoveProduct());

    }

    @Then("user click continue shopping button")
    public void userClickContinueShoppingButton() {
        cartPage.clickContinueShopping();
    }



}
