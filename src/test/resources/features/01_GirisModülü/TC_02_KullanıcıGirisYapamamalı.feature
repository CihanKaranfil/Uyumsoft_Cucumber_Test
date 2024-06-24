@girişmodül

Feature: Kullanıcı Hesap Bilgilerini Yanlış girerek Login Olamamalı
  Scenario: Kullanıcı Uyumsoft sayfasına giriş yapamaz
    Given Kullanici "uyumsoftUrl" sayfasına gider
    When Kullanici adi bilgilerini girer
    And Kullanici parola bilgilerini girer
    And Kullanıcı Oturum Aç butonuna tıklar
    And Hatalı kullanici adi ya da sifresi uyarısını dogrular
    #bu test çalışmıyor doğrulama kısmında sıkıntı var
