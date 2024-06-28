package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EİrsaliyePages;
import utilities.Driver;
import utilities.ReusableMethods;

public class eİrsaliyeStepDef  {

    EİrsaliyePages eIrsaliye = new EİrsaliyePages();
    Actions actions = new Actions(Driver.getDriver());

    @And("Kullanıcı e-İrsaliye butonuna tıklar")
    public void kullanıcıEİrsaliyeButonunaTıklar() throws InterruptedException {
        eIrsaliye.eİrsaliyeButton.click();
        Thread.sleep(1000);
    }

    @And("Kullanıcı olustur butonuna tıklar")
    public void kullanıcıOlusturButonunaTıklar() {
        eIrsaliye.olusturButton.click();
        actions.moveByOffset(50, 70).click().perform();

    }

    @And("Genel bilgilerde vkn tckn alanını doldurur")
    public void genelBilgilerdeVknTcknAlanınıDoldurur() throws InterruptedException {
        eIrsaliye.nknTckn.sendKeys("1111113273");
        Thread.sleep(1000);
        eIrsaliye.sirketsecim.click();
    }

    @And("Adres bilgileri doldurulur")
    public void adresBilgileriDoldurulur() {
        eIrsaliye.UlkeKutusu.sendKeys("Türkiye" , Keys.TAB, "Malatya");
        eIrsaliye.mahalleKutusu.sendKeys("Battalgazi");
    }

    @And("Teslimat adres bilgileri doldurulur")
    public void teslimatAdresBilgileriDoldurulur() {
        ReusableMethods.scroll(eIrsaliye.teslimatUlke);
        eIrsaliye.teslimatUlke
                .sendKeys("Türkiye" , Keys.TAB, "Malatya", Keys.TAB, Keys.TAB, "Battalgazi");
        eIrsaliye.postaKodu.sendKeys("44100");
    }

    @And("Kaydet butonuna tıklarr")
    public void kaydetButonunaTıklarr() throws InterruptedException {
        ReusableMethods.scroll(eIrsaliye.kaydetButton);
        eIrsaliye.kaydetButton.click();
        Thread.sleep(1000);
    }

    @Then("Kullanıcı e-İrsaliye oluşturuldugu dogrulanır")
    public void kullanıcıEİrsaliyeOluşturulduguDogrulanır() {
        eIrsaliye.bilgilendirme.isDisplayed();
    }

    @And("Bilgi mesajındaki tamam butonuna tıklar")
    public void bilgiMesajındakiTamamButonunaTıklar() {
        eIrsaliye.tamamButton.click();
    }

    @And("Sevk eden bilgilerine tıklar")
    public void sevkEdenBilgilerineTıklar() {
        eIrsaliye.sevkBilgileri.click();
    }

    @Then("Araç plaka bilgileri girilir")
    public void araçPlakaBilgileriGirilir() {
        eIrsaliye.plakaBilgisi.sendKeys("44ABC123");
    }

    @And("Şoför bilgileri girilir")
    public void şoförBilgileriGirilir() {
        eIrsaliye.soforBilgisi.click();
        eIrsaliye.soforTckn.sendKeys("54879865322", Keys.TAB , "Ali Can" , Keys.TAB , "Kaya");
        eIrsaliye.tamamButton2.click();
    }

    @And("Mal bilgileri ekle butonuna tıklar")
    public void malBilgileriEkleButonunaTıklar() throws InterruptedException {
        ReusableMethods.scroll(eIrsaliye.malHizmetArtı);
        eIrsaliye.malHizmetArtı.click();
        Thread.sleep(1000);
    }

    @And("Mal bilgileri doldurulur")
    public void malBilgileriDoldurulur() {
       actions.click(eIrsaliye.malHizmetEkle).perform();
       eIrsaliye.malHizmetEkle.sendKeys("Kalem");
       eIrsaliye.gonderilecekMiktar.click();
       eIrsaliye.gonderilecekMiktar.clear();
       eIrsaliye.gonderilecekMiktar.sendKeys("5");
       eIrsaliye.birimFiyat.clear();
       eIrsaliye.birimFiyat.sendKeys("100");
       eIrsaliye.tamamButton3.click();

    }
}
