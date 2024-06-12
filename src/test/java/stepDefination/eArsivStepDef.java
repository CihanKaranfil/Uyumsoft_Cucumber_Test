package stepDefination;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EArsivPages;
import utilities.Driver;

public class eArsivStepDef {

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
}
