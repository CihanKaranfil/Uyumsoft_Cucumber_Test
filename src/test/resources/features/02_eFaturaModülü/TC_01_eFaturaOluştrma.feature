@uyumsoft222
Feature:Uyumsoftta e fatura oluşturma

  Scenario: Kullanıcı Uyumsoftta e fatura oluşturur
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
   # Bu test çalışıyor









