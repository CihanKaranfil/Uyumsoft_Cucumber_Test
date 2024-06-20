package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EArsivPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class eArsivStepDef extends ReusableMethods {

    EArsivPages eArsivPages = new EArsivPages();
    Actions actions = new Actions(Driver.getDriver());


    @And("Alıcı vkn tckn bilgileri girilir")
    public void alıcıVknTcknBilgileriGirilir() {
        eArsivPages.alici.sendKeys("12345678908");
        eArsivPages.vknTckn.sendKeys("12345678908");
    }

    @And("Alıcı ad soyad bilgileri girilir")
    public void alıcıAdSoyadBilgileriGirilir() {
        eArsivPages.aliciAdi.sendKeys("Ahmet");
        eArsivPages.aliciSoyadi.sendKeys("Yılmaz");
    }

    @And("Alıcı Sehir ve Mahalle bilgileri girilir")
    public void alıcıSehirVeMahalleBilgileriGirilir() {
        eArsivPages.sehirBilgisi.sendKeys("Malatya");
        eArsivPages.mahalleBilgisi.sendKeys("Battalgazi");

    }

    @And("Kaydet butonuna tıklar")
    public void kaydetButonunaTıklar() throws InterruptedException {
        eArsivPages.kaydetButton.click();
        Thread.sleep(2000);
        eArsivPages.tamamButton.click();
        Thread.sleep(2000);
        actions.moveByOffset(50, 70).click().perform();//Bilgilendirme mesajı kapat
    }

    @Then("Mal Hizmet butonuna tıklar")
    public void malHizmetButonunaTıklar() {
        scroll(eArsivPages.malHizmetButton);
        eArsivPages.malHizmetButton.click();
        click(eArsivPages.malHizmetBilgileri);
    }

    @And("Mal Hizmet bilgileri girilir")
    public void malHizmetBilgileriGirilir() {
        eArsivPages.malHizmetBilgileri.sendKeys("Bilgisayar");
    }


    @And("Birim Fiyat girilir")
    public void birimFiyatGirilir() {
        eArsivPages.birimFiyat.sendKeys("25000");
    }

    @And("KDV oranı girilir")
    public void kdvOranıGirilir() {
        eArsivPages.kdvOrani.click();
        eArsivPages.kdvOrani.clear();
        eArsivPages.kdvOrani.sendKeys("20", Keys.ENTER);
    }

    @And("Tamam butonuna tıklar")
    public void tamamButonunaTıklar() {
        eArsivPages.tamamButton2.click();
    }

    @Then("Faturanın olustugu dogrulanir")
    public void faturanınOlustuguDogrulanir() {
    }

    @And("Gönder butonuna tiklanir")
    public void gönderButonunaTiklanir() throws InterruptedException {
        eArsivPages.gonderButton.click();
        Thread.sleep(1000);
        eArsivPages.gonderTamamButton.click();
    }
}
