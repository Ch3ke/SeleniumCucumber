Feature: Creating Account

Scenario: Go to site and create a new account page
    Given Initialized the browser on "http://automationpractice.com" site
    And User select sign in
    Then User enter email address
    When User select Create New Account
    And Fill out all required fields
    Then create the account and add items
    
