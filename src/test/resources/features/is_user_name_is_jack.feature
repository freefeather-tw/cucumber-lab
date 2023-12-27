Feature: Is user's name Jack?

  Scenario Outline:
    Given I have a name "<name>"
    When I ask if my name is correct
    Then I should see "<result>"

    Examples:
      | name  | result |
      | Jack  | Yes    |
      | Mary  | No     |
      | Simon | No     |
#  Scenario:
#    Given I have a name "Jack"
#    When I ask if my name is correct
#    Then I should see "Yes"
#
#  Scenario:
#    Given I have a name "Mary"
#    When I ask if my name is correct
#    Then I should see "No"