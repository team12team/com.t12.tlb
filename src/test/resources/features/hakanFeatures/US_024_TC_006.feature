Feature: US_024_TC_006 Type kısmındaki butonlar kaldırılmalıdır.

  Scenario: US_024_TC_006 Type kısmındaki butonlar kaldırılmalıdır.

    Given Kullanici trendlifebuy sayfasina gider
    Then  Login butonunu tiklar
    Then  Email adresini yazar
    Then  Password yazar
    And   Sign in butonunu tiklar
    Then  Dashboard butonu tiklanir
    Then  Notification butonu tiklanir
    Then  Setting butonu tiklanir
    Then  Type kısmındaki butonlar kaldirilir
    And   Success yazisinin ciktigi dogrulanir
