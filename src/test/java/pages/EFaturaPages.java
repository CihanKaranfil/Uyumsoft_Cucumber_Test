package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EFaturaPages {
    public EFaturaPages(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "//*[@id=\"txtCountry\"]") public WebElement ulkesec;
    @FindBy(xpath = "//*[@id=\"btnCloseAnnouncement\"]") public WebElement bilgilendirmekapat;
    @FindBy(xpath = "//*[@id=\"invoiceoperations\"]/li[1]/a") public WebElement efaturaDuzenle;
    @FindBy(xpath = "//*[@id=\"invoice-create\"]/li[1]/a") public WebElement efaturaOlustur;
    @FindBy(xpath = "//*[@id=\"txtReceiverDistrict\"]") public WebElement mahallesec;
    @FindBy(xpath = "//*[@id=\"scrollable-dropdown-menu-invoice-items\"]/span[1]/span[2]/div/span/div[2]/div[2]") public WebElement Ddmuyumsoft;
    @FindBy(xpath = "//*[@id=\"txtCity\"]") public WebElement sehir;
    @FindBy(xpath = "//*[@id=\"btnSaveInvoice\"]") public WebElement kaydetButon;
    @FindBy(xpath = "//*[@id=\"guideModal\"]/div/div[1]/span") public WebElement uyarimesaji;
    @FindBy(xpath = "//*[@id=\"txtAlias\"]") public WebElement aliciVkn;
    @FindBy(xpath = "//*[@id=\"scrollable-dropdown-menu-invoice-items\"]/span[1]/span[2]/div/span/div") public WebElement firmaSecim;




}
