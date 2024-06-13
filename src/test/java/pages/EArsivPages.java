package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EArsivPages {

    public EArsivPages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id=\"txtTaxNumber\"]") public WebElement vknTckn;
    @FindBy(xpath = "//*[@id=\"txtAlias\"]") public WebElement alici;
    @FindBy(xpath = "//*[@id=\"txtTitle\"]") public WebElement aliciAdi;
    @FindBy(xpath = "//*[@id=\"txtReceiverPersonSurName\"]") public WebElement aliciSoyadi;
    @FindBy(xpath = "//*[@id=\"txtCity\"]") public WebElement sehirBilgisi;
    @FindBy(xpath = "//*[@id=\"txtReceiverDistrict\"]") public WebElement mahalleBilgisi;
    @FindBy(xpath = "//*[@id=\"btnSaveInvoice\"]") public WebElement kaydetButton;
    @FindBy(xpath = "//*[@id=\"btnAlertModalOk\"]") public WebElement tamamButton;
    @FindBy(xpath = "//*[@id=\"container1\"]/div[3]/div[1]/div/header/div[2]/div/nav/div/span[5]/button") public WebElement malHizmetButton;
    @FindBy(xpath = "//*[@id=\"txtGoodsService\"]") public WebElement malHizmetBilgileri;
    @FindBy(xpath = "//*[@id=\"txtRateOfTax\"]") public WebElement kdvOrani;
    @FindBy(xpath = "//*[@id=\"txtUnitPrice\"]") public WebElement birimFiyat;


}
