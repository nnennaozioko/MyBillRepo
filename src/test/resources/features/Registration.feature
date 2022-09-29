Feature: As a student I want to register successfully

  @test
  Scenario: valid Registration
    Given I navigates to the website
    When I click on the register button
    And I click on the personal button
	And I select country
    And I enter firstName
    And I enter lastName
	And I click dropdown
    And I enter contact number
    And I enter email
    And I enter PassWord
    And I click on the account button
    Then my account is successfully created