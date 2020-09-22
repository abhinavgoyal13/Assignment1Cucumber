Feature: To Register,Login and validate user
This features include registering ,login and validating if user is correctly registered

  Background:
    Given I am able to navigate to landing page

  Scenario Outline: Register with multiple users
    When I click on SignUp button
    When I enter firstname as "<firstname>"
    When I enter lastname as "<lastname>"
    When I enter email as "<email>"
    When I enter username as "<username>"
    When I enter password as "<password>"
    Then click on Register button
    And Validate if correct email ID "<email>" is populated
    Examples:
      |  Abhinav  | Goyal | abhinavgoyal13@gmail.com | abhinav | goyal |
      |  Abhilash  | Goyal | abhilashgoyal13@gmail.com | abhilash | goyal |




