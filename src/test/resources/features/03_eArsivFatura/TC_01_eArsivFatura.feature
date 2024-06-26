@eArsiv
Feature: Uyumsoftta e Arsiv Fatura Olusturma

  Scenario:Kullanıcı e-Arşiv fatura oluşturur
    Given Kullanici "uyumsoftUrl" sayfasına gider
    When Kullanıcı uyumsoft için kullanıcı adi ve parola girer
    And Kullanıcı Oturum Aç butonuna tıklar
    When e-Fatura ve e-Arsiv olustura tıkla
    And Alıcı vkn tckn bilgileri girilir
    And Alıcı ad soyad bilgileri girilir
    And Alıcı Sehir ve Mahalle bilgileri girilir
    And Kaydet butonuna tıklar
    Then Mal Hizmet butonuna tıklar
    And Mal Hizmet bilgileri girilir
    And Birim Fiyat girilir
    And KDV oranı girilir
    And Tamam butonuna tıklar
      #bu test çalışıyor


