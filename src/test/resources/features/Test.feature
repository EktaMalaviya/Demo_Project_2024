Feature: Login functionaliy

  Scenario: Navigate to chrome browser
    Given I am on home page
    When I click on accept cookies
    And I click on Contact
    Then User should be able to navigate to URL "https://www.version1.com/contact/"

  Scenario: Verify Contact version1 button
    Given I am on home page
    When I click on accept cookies
    And I click on Contact
    And I click on ContactVersionone button
    Then User should be able to see form "Talk to us"

  Scenario: Verify user should be able to see error message Please complete all required fields.
    Given I am on home page
    When I click on accept cookies
    And I click on Contact
    And I click on ContactVersionone button
    And Enter "Ekta","Malaviya","Version 1","ekta.malaviya@version1.com","Tester","Capital Markets"
    And Click on Submit button
    Then user should be able to see error message "Please complete all required fields."





