#Author: seltest1@gmail.com
Feature: WP Job Board Application Login Validation

  @Login
  Scenario: Verify if User able to Login to WP Job Board Application using valid credentials
    Given Launch the Application
    When User Enters "user" and "user"
    And User Clicks Login button
    Then User able to go to Home Page successfully

  @Loginmultiusers
  Scenario Outline: Verify if all Users are able to Login to WP Job Board Application using valid credentials
    Given Launch the Application
    When User Enters "<Username>" and "<Password>"
    And User Clicks Login button
    Then User able to go to Home Page successfully

    Examples: 
      | Username | Password |
      | user     | user     |
      | seluser1 | selpswd  |
