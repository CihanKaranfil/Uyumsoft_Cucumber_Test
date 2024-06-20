Feature: Uyumsoftta e fatura olusturma ve gönderme

  Scenario: Uyumsoftta e fatura olusturur ve gönderir
    Given Kullanici "uyumsoftUrl" sayfasına gider
    When Kullanıcı uyumsoft için kullanıcı adi ve parola girer
    Then Kullanıcı Oturum Aç butonuna tıklar
    When e-Fatura ve e-Arsiv olustura tıkla
    And Alıcı VKN bilgisi girer ve firma secer
    And Ulke Sehir ve Mahalle seçimi yapar
    Then e-Fatura kayıt butonuna tıkla
    And Mal Hizmet butonuna tıklar
    And Mal Hizmet bilgileri girilir
    And Birim Fiyat girilir
    And KDV oranı girilir
    And Tamam butonuna tıklar
    Then Faturanın olustugu dogrulanir
    And Gönder butonuna tiklanir

    # Bu test çalışıyor