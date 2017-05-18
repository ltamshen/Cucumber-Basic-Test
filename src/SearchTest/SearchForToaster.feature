#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Searching Google for various items


@Search 
Feature: Search Google
  I want to use this template for my feature file

  @toaster
  Scenario: Search Google for toaster
    Given I am on the Google search page
    When I enter "toaster"
    Then I see at least one result
