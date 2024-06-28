package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EİrsaliyePages {

    public EİrsaliyePages(){
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "//*[@id=\"despatch_operations\"]") public WebElement eİrsaliyeButton;
    @FindBy(xpath = "//*[@id=\"despatchoperations\"]/li[1]") public WebElement olusturButton;
    @FindBy(xpath = "//*[@id=\"txtDeliveryCustomerPartyAlias\"]") public WebElement nknTckn;
    @FindBy(xpath = "//*[@id=\"scrollable-dropdown-menu-despatch-items\"]/span[1]/span[2]/div/span/div") public WebElement sirketsecim;
    @FindBy(xpath = "//*[@id=\"txtDeliveryCustomerPartyCountry\"]") public WebElement UlkeKutusu;
    @FindBy(xpath = "//*[@id=\"txtDeliveryCustomerPartyCitySubdivision\"]") public WebElement mahalleKutusu;
    @FindBy(xpath = "//*[@id=\"txtShipmentDeliveryAddressCountry\"]") public WebElement teslimatUlke;
    @FindBy(xpath = "//*[@id=\"txtShipmentDeliveryAddressPostalZone\"]") public WebElement postaKodu;
    @FindBy(xpath = "//*[@id=\"despatchHeader\"]/div/div/nav/div[2]/span[1]/button") public WebElement kaydetButton;
    @FindBy(xpath = "//*[@id=\"alertModalMessage\"]") public WebElement bilgilendirme;
    @FindBy(xpath = "//*[@id=\"btnAlertModalOk\"]") public WebElement tamamButton;
    @FindBy(xpath = "//*[@id=\"addDriverModal\"]/div[3]/button[2]") public WebElement tamamButton2;
    @FindBy(xpath = "//*[@id=\"AddDespatchLine\"]/div[3]/button[2]") public WebElement tamamButton3;
    @FindBy(xpath = "//*[@id=\"container1\"]/div[2]/div/div[1]/ul/li[1]/a") public WebElement sevkBilgileri;
    @FindBy(xpath = "//*[@id=\"licencePlate\"]") public WebElement plakaBilgisi;
    @FindBy(xpath = "//*[@id=\"tab5\"]/div[1]/div[2]/div[2]/header/button") public WebElement soforBilgisi;
    @FindBy(xpath = "//*[@id=\"txtDespatchDriverNationalityId\"]") public WebElement soforTckn;
    @FindBy(xpath = "//*[@id=\"btnAddDespatchLine\"]/button") public WebElement malHizmetArtı;
    @FindBy(xpath = "//*[@id=\"txtDespathcLineName\"]") public WebElement malHizmetEkle;
    @FindBy(xpath = "//*[@id=\"txtDespathcLineDeliveredQuantity\"]") public WebElement gonderilecekMiktar;
    @FindBy(xpath = "//*[@id=\"txtDespathcLineUnitPrice\"]") public WebElement birimFiyat;

}
