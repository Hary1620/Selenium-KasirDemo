package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.KategoriPage;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class KategoriSteps {
    private final WebDriver driver = Hooks.driver;
    KategoriPage kategoriPage = new KategoriPage(driver);


    @And("User click kategori button")
    public void userClickKategoriButton() {
        kategoriPage.clickbuttonKategori();
    }

    @And("user should be dirrected to kategori page")
    public void userShouldBeDirrectedToKategoriPage() {
        Assert.assertTrue(kategoriPage.verifykategoripage());
    }

    @And("User click tambah button")
    public void userClickTambahButton() {
        kategoriPage.clickbuttontambah();
    }

    @And("User input {string} as name and {string} as description and user click simpan")
    public void userInputAsNameAndAsDescriptionAndUserClickSimpan(String Nama, String Deskripsi) {
        kategoriPage.inputnamakategori(Nama);
        kategoriPage.inputdeskripsikategori(Deskripsi);
        kategoriPage.clickButtonSimpan();
    }

    @Then("verify the product is already on list")
    public void verifyTheProductIsAlreadyOnList() {
        Assert.assertTrue(kategoriPage.verifyNewProductInKategoriIsDisplayed());
    }
}
