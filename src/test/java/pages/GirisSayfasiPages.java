package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GirisSayfasiPages {
    public GirisSayfasiPages(){
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//*[@id=\"Username\"]") public WebElement kullaniciAdi;
    @FindBy(xpath = "//*[@id=\"form-login\"]/button") public WebElement oturumAcButton;
    @FindBy(xpath = "//*[@id=\"btnCloseAnnouncement\"]") public WebElement bilgilendirmekapat;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/div[1]/div/ul/li[4]")  public WebElement keypadMenusu;
    @FindBy(xpath = "//*[@id=\"layout\"]/div[2]/div/div[1]/div/ul/li[4]/div/div/div/div[2]/div[3]") public WebElement cıkışİconu;
}
