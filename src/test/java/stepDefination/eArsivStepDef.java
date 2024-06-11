package stepDefination;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import pages.EArsivPages;

public class eArsivStepDef {

    EArsivPages eArsivPages = new EArsivPages();

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
        eArsivPages.sehirBilgisi.sendKeys("Ankara");
        eArsivPages.mahalleBilgisi.sendKeys("Çankaya");

    }

    @And("Kaydet butonuna tıklar")
    public void kaydetButonunaTıklar() {

    }
}
