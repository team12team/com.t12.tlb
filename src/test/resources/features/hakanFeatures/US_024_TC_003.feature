Feature: US_024_TC_003 Title ve Date yazısının bilgilerinin listelendiği dogrulanmalıdır

  Scenario: US_024_TC_003 Title ve Date yazısının bilgilerinin listelendiği dogrulanmalıdır

    Given Kullanici trendlifebuy sayfasina gider
    Then  Login butonunu tiklar
    Then  Email adresini yazar
    Then  Password yazar
    And   Sign in butonunu tiklar
    Then  Dashboard butonu tiklanir
    Then  Notification butonu tiklanir
    Then  Title ve Date yazisinin bilgilerinin listelendigi dogrulanmalidir
