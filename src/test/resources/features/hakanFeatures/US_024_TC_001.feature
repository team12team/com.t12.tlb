Feature: US_024_TC_001 Kullanici Trendlifebuy Anasyafasına gider

  Scenario: US_024_TC_001_Kullanici Trendlifebuy Anasyafasına gider

    Given Kullanici trendlifebuy sayfasina gider
    Then  Login butonunu tiklar
    Then  Email adresini yazar
    Then  Password yazar
    And   Sign in butonunu tiklar
    Then  Dashboard butonu tiklanir
    Then  Notification butonu tiklanir
    Then  Notifications yazisinin gorundugu dogrulanir
    And   Sayfayi kapatir