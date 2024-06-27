package org.example.pageObject;

import org.example.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KategoriPage extends BasePage {
    public KategoriPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[5]/div[@class='css-ewi1jp']")
    private WebElement buttonKategori;

    @FindBy(xpath = "//a[contains(.,'/ kategori')]")
    private WebElement titleKategori;

    @FindBy(xpath = "//a[.='tambah']")
    private WebElement buttonTambah;

    @FindBy (xpath = "//label[@id='nama-label']")
    private WebElement tambahKategoriPage;

    @FindBy (xpath = "//input[@id='nama']")
    private WebElement fieldinputnamakategori;

    @FindBy (xpath = "//input[@id='deskripsi']")
    private WebElement fieldinputdeskripsikategori;

    @FindBy (xpath = "//button[@class='chakra-button css-l5lnz6']")
    private WebElement buttonSimpan;



    public void clickbuttonKategori (){
        scrollIntoView(buttonKategori);
        waitForElementVisible(buttonKategori);
        click(buttonKategori);
    }

    public boolean verifykategoripage (){
        waitForElementVisible(titleKategori);
        return isDisplayed(titleKategori);
    }

    public void clickbuttontambah (){
        scrollIntoView(buttonTambah);
        waitForElementVisible(buttonTambah);
        click(buttonTambah);
    }

    public void inputnamakategori(String Nama){sendKeys(fieldinputnamakategori,Nama);}
    public void inputdeskripsikategori (String Kategori){sendKeys(fieldinputdeskripsikategori,Kategori);}
    public void clickButtonSimpan(){
        scrollIntoView(buttonSimpan);
        waitForElementClickable(buttonSimpan);
        click(buttonSimpan);
    }



}
