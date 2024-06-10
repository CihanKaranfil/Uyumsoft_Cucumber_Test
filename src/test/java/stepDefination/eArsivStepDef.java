package stepDefination;

import io.cucumber.java.en.And;
import pages.EArsivPages;

public class eArsivStepDef {

    EArsivPages eArsivPages = new EArsivPages();

    @And("Alıcı vkn tckn bilgileri girilir")
    public void alıcıVknTcknBilgileriGirilir() {
        eArsivPages.vknTckn.sendKeys("1234567890");

    }
}
