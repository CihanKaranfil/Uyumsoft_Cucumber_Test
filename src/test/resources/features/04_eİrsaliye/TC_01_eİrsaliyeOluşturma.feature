@eİrsaliye
Feature: Uyumsoftta e-İrsaliye Oluşturma

  Scenario: Kullanıcı e-İrsaliye oluşturur
    Given Kullanici "uyumsoftUrl" sayfasına gider
    When Kullanıcı uyumsoft için kullanıcı adi ve parola girer
    And Kullanıcı Oturum Aç butonuna tıklar
    And Kullanıcı e-İrsaliye butonuna tıklar
    And Kullanıcı olustur butonuna tıklar
    And Genel bilgilerde vkn tckn alanını doldurur
    And Adres bilgileri doldurulur
    And Teslimat adres bilgileri doldurulur
    And Kaydet butonuna tıklarr
    Then Kullanıcı e-İrsaliye oluşturuldugu dogrulanır
    And Bilgi mesajındaki tamam butonuna tıklar
    And Sevk eden bilgilerine tıklar
    Then Araç plaka bilgileri girilir
    And Şoför bilgileri girilir
    And Mal bilgileri ekle butonuna tıklar
    And Mal bilgileri doldurulur

    #And Gönder butonuna ardından tamam a tıklar
    #And e-İrsaliye gönderildigini  doğrular




