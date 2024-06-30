package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdukPage extends BasePage {

    public ProdukPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[6]/div[@class='css-ewi1jp']")
    private WebElement buttonproduk;

    @FindBy(xpath = "//a[contains(.,'/ produk')]")
    private WebElement tittleprodukpage;

    @FindBy (xpath = "//a[.='tambah']")
    private WebElement buttonTambahProduk;

    @FindBy (xpath = "//input[@id='kode']")
    private WebElement fieldInputKodeproduk;

    @FindBy (xpath = "//input[@id='nama']")
    private WebElement fieldInputnamaproduk;

    @FindBy (xpath = "//input[@id='deskripsi']")
    private WebElement fieldInputdeskripsiproduk;

    @FindBy (xpath = "//input[@id='harga beli']")
    private WebElement fieldInputHargabeliproduk;

    @FindBy (xpath = "//input[@id='harga jual']")
    private WebElement fieldInputHargajualproduk;

    @FindBy (xpath = "//input[@id='stok']")
    private WebElement fieldInputstokproduk;

    @FindBy (xpath = "//input[@id='kategori']")
    private WebElement fieldInputkategoriproduk;

    @FindBy (xpath = "//td[.='Susu']")
    private WebElement KategoriProduk1;

    @FindBy (xpath = "//tr[2]/td[@class='css-u3dlpe']")
    private WebElement KategoriProduk2;

    @FindBy (xpath = "//button[@class='chakra-button css-l5lnz6']")
    private WebElement butttonSimpan;

    @FindBy (className = "css-u3dlpe")
    private WebElement verifyprodukkategoriisdisplayed;


    public void clickbuttonproduk () {
        scrollIntoView(buttonproduk);
        waitForElementVisible(buttonproduk);
        click(buttonproduk);
    }

    public boolean verifyprodukpage (){
        waitForElementVisible(tittleprodukpage);
        return isDisplayed(tittleprodukpage);
    }

    public void clickbuttonTambahproduk () {
        click(buttonTambahProduk);
    }

    public void inputkodeproduk (String kode) {sendKeys(fieldInputKodeproduk,kode);}
    public void inputNamaproduk (String Nama){sendKeys(fieldInputnamaproduk, Nama);}
    public void inputDeskripsiproduk (String Description) {sendKeys(fieldInputdeskripsiproduk, Description);}
    public void inputHargabeliproduk (Float HargaBeli) {sendKeys(fieldInputHargabeliproduk, String.valueOf(HargaBeli));}
    public void inputHargajualproduk (Float HargaJual) {sendKeys(fieldInputHargajualproduk, String.valueOf(HargaJual));}
    public void inputStokproduk (int StokProduk) {
        clear(fieldInputstokproduk);
        sendKeys(fieldInputstokproduk, String.valueOf(StokProduk));}
    public void inputKategoriProduk (){
       click(fieldInputkategoriproduk);
        waitForElementVisible(fieldInputkategoriproduk);
        scrollIntoView(fieldInputkategoriproduk);
        click(KategoriProduk1);
//        click(KategoriProduk2);

    }

    public void clickButtonsimpan (){
        click(butttonSimpan);
    }






}
