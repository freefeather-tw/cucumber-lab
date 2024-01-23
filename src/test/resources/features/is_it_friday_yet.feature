Feature:
  Scenario Outline: Is it Friday yet? Everybody wants to know when it's Friday
    Given today is Year <year>, Month <month>, Day <day>
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | year | month | day | answer |
      | 2020 | 1     | 1   | Nope   |
      | 2020 | 1     | 3   | TGIF   |
      | 2019 | 9     | 6   | TGIF   |
      | 2019 | 9     | 7   | Nope   |
