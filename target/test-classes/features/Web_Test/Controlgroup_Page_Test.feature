#Author: Jayalakshmi
Feature: Home Page Verifications

  Background:
    Given  Launch "chrome" browser
    And User navigates to JQueryUI WebPage

  @ui_tests @controlgroup
  Scenario: Verify that mulpitple options can be selected on ControlGroup tab
    When User selects Controlgroup option from left menu available under Widgets
    And User selects "SUV" from the horizontal dropdown
    And User clicks on car type Automatic and Insurance for SUV
    And inputs number of cars as "2"
    And selects "Truck" from the vertical dropdown
    And User clicks on car type Standard and Insurance option for truck
    And Enters number of Cars as "1"
    And Clicks on book now for truck
