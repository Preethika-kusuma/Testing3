
Feature: Title of your feature
  I want to use this template for my feature file
 
  Scenario Outline: Login to the HotelApp1
    Given Successful login into HotelApp1
    When I enter the username as <username>
    And When I enter the password as <password>
    And When I click on login button
    Then I should be redirected to the HotelApp1
    Examples: 
      |username|password| 
      |"vasuvespag"|"vasu1234"|
      |"aswinishiva"|"Ashu@2001"|