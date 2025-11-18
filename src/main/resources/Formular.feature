Feature: Formular

  Scenario: Kontrola radiobutton u pohlavi
    Given Uzivatel je na strance s formularem
    When Uzivatel napise do input jmeno "Jacob Hill"
    And Uzivatel napise do input email "jacobhill@email.com"
    And Uzivatel klikne na radiobutton Male
    And Uzivatel klikne na radiobutton Female
    Then Uzivatel vidi zaskrtnuty radiobutton Female
    And Uzivatel vidi odskrtnuty radiobutton Male