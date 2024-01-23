Feature:
  Scenario Outline: Is user's name Jack?
    Given I have a name "<name>"
    When I ask if my name is correct
    Then I should see "<result>"

    Examples:
      | name  | result |
      | Jack  | Yes    |
      | Mary  | No     |
      | Simon | No     |