Feature: Get into Web Application

  Scenario Outline: Validation of login for site 'http://automationpractice.com'
    Given Initialized the browser on "http://automationpractice.com" site
    When User select sign in
    And User enter its credentials "ezequiel.gg\@gmail.com" and "Pass123"
    And User click on to get into
    Then Validate user was not logged in
