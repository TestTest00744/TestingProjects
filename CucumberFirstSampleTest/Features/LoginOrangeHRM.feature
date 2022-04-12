Feature: Checking Login & Logout Functionality

  Scenario: Successful Login with Valid Credentials
    Given User should Open Chrome Browser
    When User should Enter Url in Browser
    When User Should Navigate Home Page
    And Enter UserName and Password in Edit Box
    And Click On Login PushButton
    Then Message displayed Login Successfully
    Then User Should Navigate to Dashboard
    Then User Should Logout OranageHRM Application
    Then Message displayed Logout Successfully
