package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EFaturaPages;
import utilities.Driver;

public class e_FaturaStepDef {
    EFaturaPages eFaturaPages = new EFaturaPages();

    Actions actions = new Actions(Driver.getDriver());


    @When("e-Fatura ve e-Arsiv olustura tıkla")
    public void eFaturaVeEArsivOlusturaTıkla() throws InterruptedException {
        eFaturaPages.efaturaDuzenle.click();
        actions.moveByOffset(50, 70).click().perform();//Bilgilendirme mesajı kapat
    }

    @Then("e-Fatura kayıt butonuna tıkla")
    public void eFaturaKayıtButonunaTıkla() throws InterruptedException {
        eFaturaPages.kaydetButon.click();
        Thread.sleep(3000);
    }

    @And("Alıcı VKN bilgisi girer ve firma secer")
    public void alıcıVKNBilgisiGirerVeFirmaSecer() {
        eFaturaPages.aliciVkn.sendKeys("1111113283");
        eFaturaPages.firmaSecim.click();
    }

    @And("Ulke Sehir ve Mahalle seçimi yapar")
    public void ulkeSehirVeMahalleSeçimiYapar() {
        eFaturaPages.ulkesec.sendKeys("Türkiye");
        eFaturaPages.sehir.sendKeys("İstanbul");
        eFaturaPages.mahallesec.sendKeys("Kadıköy");
    }
}
