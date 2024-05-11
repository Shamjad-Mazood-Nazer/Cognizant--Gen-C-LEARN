# Add the 'Feature' name as 'User form submission'
Feature: User form submission
# Add the 'Scenario' name as 'Add User Details'
    Scenario: Add User Details
#Implement code with the scenario needed for adding user details as mentioned in problem description
#Match the Statements with Step Definition file.
        Given Start firefox browser
        Then user navigate to the application home page
        When user enters Name as "Rajesh", Address as "Coimbatore", Mobile as "1213124536" and Email as "rajesh@test.com"
        When user click submit button
        Then it should display the result
        Then close the driver