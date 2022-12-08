Feature: Login as different users
  @wip
  Scenario: login as first user
    Given the user is on the login page
    When the user logs in using "eren@gmail.com" and "User123"
    Then the user should be able to login


  Scenario: login as second user
    Given the user is on the login page
    When the user logs in using "alperen@gmail.com" and "User5678"
    Then the user should be able to login
