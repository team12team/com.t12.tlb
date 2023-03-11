Feature: US_024_TC_005 Setting sayfasına gidilmelidir.

  Scenario: US_024_TC_005 Setting sayfasına gidilmelidir.

    Given Kullanici trendlifebuy sayfasina gider
    Then  Login butonunu tiklar
    Then  Email adresini yazar
    Then  Password yazar
    And   Sign in butonunu tiklar
    Then  Dashboard butonu tiklanir
    Then  Notification butonu tiklanir
    And   Settings sekmesinin bulundugu dogrulanir
