package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.ProdukPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductSteps {
    private final WebDriver driver = Hooks.driver;
    ProdukPage produkPage = new ProdukPage(driver);


    @And("User click product button")
    public void userClickProductButton() {
        produkPage.clickbuttonproduk();
    }

    @And("User should be directed to the product page")
    public void userShouldBeDirectedToTheProductPage() {
        Assert.assertTrue(produkPage.verifyprodukpage());
    }

    @And("User click tambah produk button")
    public void userClickTambahProdukButton() {
        produkPage.clickbuttonTambahproduk();
    }




    @And("User input {string} as code and {string} as name and {string} as description and {string} as price and {string} as purchase price and {string} as stock and {string} as category")
    public void userInputAsCodeAndAsNameAndAsDescriptionAndAsPriceAndAsPurchasePriceAndAsStockAndAsCategory(String kode, String nama, String deskripsi, String hargaBeli, String hargaJual, String stok, String kategori) {
        produkPage.inputkodeproduk(kode);
        produkPage.inputNamaproduk(nama);
        produkPage.inputDeskripsiproduk(deskripsi);
        produkPage.inputHargabeliproduk(Float.valueOf(hargaBeli));
        produkPage.inputHargajualproduk(Float.valueOf(hargaJual));
        produkPage.inputStokproduk(Integer.parseInt(stok));
        produkPage.inputKategoriProduk();
    }

    @Then("User click simpan button")
    public void userClickSimpanButton() {
        produkPage.clickButtonsimpan();
    }

//    @Then("Verify produk is already onlist")
//    public void verifyProdukIsAlreadyOnlist() {
//    }
}
