Feature: Shopping Items on site

Scenario: Search for a Faded Short Sleeve and buy it.
Given User Log in Site
And User looks for a "Faded Short Sleeve"
When User add it to shopping cart
And User buy it
Then Validate item was bougth successfully