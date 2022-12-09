@eren
Feature: Login as different users

  Scenario: login as first user
    Given the user is on the login page
    When the user logs in using "eren@gmail.com" and "User1234"
    Then the user should be able to login

  Scenario: login as second user
    Given the user is on the login page
    When the user logs in using "alperen@gmail.com" and "User567"
    Then the user should be able to login
