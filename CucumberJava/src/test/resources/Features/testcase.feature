#Author: your.email@your.domain.com
@tag
Feature: Login features

  @tag1
  Scenario: Login test
    Given Im in Homepage
    When I enter the username and password
    And I click on the login button
    Then Im able to login and see the Dashboard