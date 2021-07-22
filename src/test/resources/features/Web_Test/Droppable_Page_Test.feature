#Author: Jayalakshmi
Feature: Home Page Verifications

  Background:
    Given  Launch "chrome" browser
    And User navigates to JQueryUI WebPage

  @ui_tests @droppable
  Scenario: Verify drap and drop functionality
    When User clicks on droppable menu
    And User drags "Drag me to my target" and drops on "Drop here"
    Then Verify that success message "Dropped!" is displayed