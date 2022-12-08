@login
Feature: Login Functionality

  Background:
    Given the user is on the login page

  @firstValidUser
  Scenario: Login as first valid user
    When the user enters the first valid credentials
    Then the user should be able to login

  @secondValidUser
  Scenario: Login as second valid user
    When the user enters the second valid credentials
    Then the user should be able to login

  @thirdValidUser
  Scenario: Login as third valid user
    When the user enters the third valid credentials
    Then the user should be able to login


