Feature: Formular

  # komentář
  Scenario: Kontrola radiobutton u pohlavi
    Given Uzivatel je na strance s formularem
    When Uzivatel napise do input jmeno "Jacob Hill"
    And Uzivatel napise do input email "jacobhill@email.com"
    #And Uzivatel klikne na radiobutton Male
    And Uzivatel klikne na radiobutton Female
    Then Uzivatel vidi zaskrtnuty radiobutton Female
    And Uzivatel vidi odskrtnuty radiobutton Male
    
  Scenario: Novy test
    Given Uzivatel je na strance s formularem
    When Uzivatel napise do input email "email@email.com"
    And Uzivatel klikne na radiobutton Female
    Then Uzivatel vidi zaskrtnuty radiobutton Female

    Scenario Outline: Novy test pomoci Scenario Outline
      Given Uzivatel je na strance s formularem
      When Uzivatel napise do input jmeno "<jmeno>"
      And Uzivatel napise do input email "<email>"
      And Uzivatel klikne na radiobutton Female
      Then Uzivatel vidi zaskrtnuty radiobutton Female
      And Uzivatel vidi odskrtnuty radiobutton Male

    Examples:
      | jmeno   | email              |
      | Jana    | jana@email.com     |
      | Petra   | petra@email.com    |
      | Martina | martina@email.com  |
      | Katka   | katka@email.com    |
      | Zuzana  | zuzana@email.com   |
      | Alice   | alice@email.com    |
      | Jitka   | jitka@email.com    |
      | Ludmila | ludmila@email.com  |
      | Daniela | daniela@email.com  |
      | Marie   | marie@email.com    |