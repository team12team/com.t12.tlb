Feature: US_024_TC_004 View sayfasına gidilmelidir.

  Scenario: US_024_TC_004 View sayfasına gidilmelidir.

    Given Kullanici trendlifebuy sayfasina gider
    Then  Login butonunu tiklar
    Then  Email adresini yazar
    Then  Password yazar
    And   Sign in butonunu tiklar
    Then  Dashboard butonu tiklanir
    Then  Notification butonu tiklanir
    Then  View sekmesi tiklanir
    Then  İlgili sayfaya gittigi dogrulanir