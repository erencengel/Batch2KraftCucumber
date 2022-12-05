Feature: Login Functionality
  @firstValidUser @login @regression @smoke
  Scenario: Login as first valid user
    Given the user is on the login page
    When the user enters the first valid credentials
    Then the user should be able to login
  @secondValidUser @login @regression @smoke
  Scenario: Login as second valid user
    Given the user is on the login page
    When the user enters the second valid credentials
    Then the user should be able to login
  @thirdValidUser @login @regression
  Scenario: Login as third valid user
    Given the user is on the login page
    When the user enters the third valid credentials
    Then the user should be able to login


