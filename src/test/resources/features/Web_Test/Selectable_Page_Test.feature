#Author: Jayalakshmi
Feature: Home Page Verifications

  Background:
    Given  Launch "chrome" browser
    And User navigates to JQueryUI WebPage


  @ui_tests @selectable
  Scenario: Verify multiple element select functionality
    When User clicks on selectable menu
    And user selects multiple elements on page
      |Item 1  |Item 3  |Item 7  |
    Then Verify that multiple elements are selected
      |Item 1  | Item 3  | Item 7  |