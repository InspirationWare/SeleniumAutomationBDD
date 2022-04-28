Feature: Aspiration_Feature

Background:
Given user is on home page

Scenario: User is able to visit products Page
When user selects products page link
Then user should see products image

Scenario: User is able to select product
When user selects button for standard
Then email address input field loads for standard

Scenario: User is able to select product
When user selects button for plus
Then email address input field loads for plus

