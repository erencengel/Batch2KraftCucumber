Feature: Navigation Menu
  @navigate
  Scenario: Navigating components-alerts
    Given the user is on the login page
    And the user enters the first valid credentials
    When navigate to components
    Then title should be alerts
  @navigate
  Scenario: Navigating forms-inputs
    Given the user is on the login page
    And the user enters the first valid credentials
    When navigate to forms
    Then title should be inputs
  @navigate @db
  Scenario: Navigating javascripts-clicks
    Given the user is on the login page
    And the user enters the first valid credentials
    When navigate to javascripts
    Then title should be clicks