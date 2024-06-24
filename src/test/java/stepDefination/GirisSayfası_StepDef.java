package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.GirisSayfasiPages;

import utilities.ConfigReader;
import utilities.Driver;

public class GirisSayfası_StepDef {
    GirisSayfasiPages girisSayfasiPage = new GirisSayfasiPages();
    @When("Kullanıcı uyumsoft için kullanıcı adi ve parola girer")
    public void kullanıcıUyumsoftIçinKullanıcıAdiVeParolaGirer() {
        girisSayfasiPage.kullaniciAdi.click();
        girisSayfasiPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("kullaniciAdi"),
                Keys.TAB,ConfigReader.getProperty("parola"));
    }

    @Then("Kullanıcı Oturum Aç butonuna tıklar")
    public void kullanıcıOturumAçButonunaTıklar() throws InterruptedException {
        girisSayfasiPage.oturumAcButton.click();
        Thread.sleep(2000);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(girisSayfasiPage.bilgilendirmekapat).perform();

    }

    @When("Keypad menusune tıklar")
    public void keypadMenusuneTıklar() {
        girisSayfasiPage.keypadMenusu.click();

    }

    @And("Cıkıs ikonuna tıklar")
    public void cıkısIkonunaTıklar() {
        girisSayfasiPage.cıkışİconu.click();
    }

    @Given("Kullanici {string} sayfasına gider")
    public void kullaniciSayfasınaGider(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @And("Sayfayı kapar")
    public void sayfayıKapar() {
        Driver.closeDriver();
    }

    @When("Kullanici adi bilgilerini girer")
    public void kullaniciAdiBilgileriniGirer() {
        girisSayfasiPage.kullaniciAdi.click();
        girisSayfasiPage.kullaniciAdi.sendKeys("Uyum");

    }

    @And("Kullanici parola bilgilerini girer")
    public void kullaniciParolaBilgileriniGirer() {
        girisSayfasiPage.parola.sendKeys("Uyumsoft");
    }

    @And("Hatalı kullanici adi ya da sifresi uyarısını dogrular")
    public void hatalıKullaniciAdiYaDaSifresiUyarısınıDogrular() {
       // girisSayfasiPage.uyarıYazısı.isDisplayed();
    }
}
