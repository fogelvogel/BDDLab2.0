Feature: creation of card

  Scenario:
    Given i have my Card class
    When i have entered "hearts" as first operand in Card
    And i have entered "jack" as second operand in Card
    Then the Card should be created with operands

Scenario:
Given i have my Durak class
And i have createCard function
When i have entered "hearts" as first operand
And i have entered "jack" as second operand
  Then the Card should be created

  Scenario:
    Given i have instance of Durak class
    When i want to create six cards
    Then six Cards should be created

