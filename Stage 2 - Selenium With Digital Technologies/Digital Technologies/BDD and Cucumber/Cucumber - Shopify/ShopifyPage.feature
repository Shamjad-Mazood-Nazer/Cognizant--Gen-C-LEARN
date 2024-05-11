# Add the 'Feature' name as 'Shopify form submission'
Feature: Shopify form submission

# Add the 'Scenario' name as 'Add Shopify Details'
Scenario: Add Shopify Details
    Given Start firefox browser
    Then user navigate to the application home page
    When user enters Firstname as "John", Lastname as "David", Username as "johntestuser", City as "Chennai", Gender as "male" and Password as "john@123"
    When user click Register button
    Then it should display the result get the Firstname
    Then close the driver


#Implement code with the scenario needed for adding shopify details as mentioned in problem description
#Match the Statements with Step Definition file.


