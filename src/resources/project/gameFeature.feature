Feature: game organisation

  Scenario:
    Given i have instance of Durak class in game
    When i am creating player
    And i have Table class
    And player is laying its card number 1 on table
    Then the table has one card

  Scenario:
    Given i have another instance of Durak class in game
    When i am creating new player
    And player is accepting card
    Then player should have one card