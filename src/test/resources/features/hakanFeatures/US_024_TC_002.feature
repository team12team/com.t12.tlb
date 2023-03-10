Feature: US_024_TC_002 Kullanici Trendlifebuy Anasyafasına gider

  Scenario: US_024_TC_002_Siteden gönderilen bildirimlerin goruntulendigi dogrulanır

    Given Kullanici trendlifebuy sayfasina gider
    Then  Login butonunu tiklar
    Then  Email adresini yazar
    Then  Password yazar
    And   Sign in butonunu tiklar
    Then  Dashboard butonu tiklanir
    Then  Notification butonu tiklanir
    Then  Siteden gonderilen bildirimlerin goruntulendigi dogrulanır
    And   Sayfayi kapatir