Feature: user validate the weather page

Scenario: user search for weather
Given user is in home page
When user clicks weather tab
And user enters "Bexleyheath" to the search box
And user hit the search button
Then weather results are displyed
And user close the browser

