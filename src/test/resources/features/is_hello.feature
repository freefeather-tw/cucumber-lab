Feature: Is HelloController working?

  Scenario:
    Given I am on the homepage
    When I call hello API
    Then I should see the response body "Hello World!"