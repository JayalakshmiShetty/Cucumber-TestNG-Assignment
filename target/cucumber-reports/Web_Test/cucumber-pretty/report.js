$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Web_Test/Controlgroup_Page_Test.feature");
formatter.feature({
  "name": "Home Page Verifications",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch \"chrome\" browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_Page_Steps.launchBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to JQueryUI WebPage",
  "keyword": "And "
});
formatter.match({
  "location": "Home_Page_Steps.userNavigatesToJQueryUIWebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that mulpitple options can be selected on ControlGroup tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ui_tests"
    },
    {
      "name": "@controlgroup"
    }
  ]
});
formatter.step({
  "name": "User selects Controlgroup option from left menu available under Widgets",
  "keyword": "When "
});
formatter.match({
  "location": "Home_Page_Steps.userSelectsControlgroupOptionFromLeftMenuAvailableUnderWidgets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects \"SUV\" from the horizontal dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "Controlgroup_Page_Steps.userSelectsFromTheHorizontalDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on car type Automatic and Insurance for SUV",
  "keyword": "And "
});
formatter.match({
  "location": "Controlgroup_Page_Steps.userClicksOnCarTypeAutomaticAndInsuranceForSUV()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inputs number of cars as \"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "Controlgroup_Page_Steps.inputsNumberOfCarsAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects \"Truck\" from the vertical dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "Controlgroup_Page_Steps.selectsFromTheVerticalDropdown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on car type Standard and Insurance option for truck",
  "keyword": "And "
});
formatter.match({
  "location": "Controlgroup_Page_Steps.userClicksOnCarTypeStandardAndInsuranceOptionForTruck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enters number of Cars as \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "Controlgroup_Page_Steps.entersNumberOfCarsAs(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on book now for truck",
  "keyword": "And "
});
formatter.match({
  "location": "Controlgroup_Page_Steps.clicksOnBookNowForTruck()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Web_Test/Droppable_Page_Test.feature");
formatter.feature({
  "name": "Home Page Verifications",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch \"chrome\" browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_Page_Steps.launchBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to JQueryUI WebPage",
  "keyword": "And "
});
formatter.match({
  "location": "Home_Page_Steps.userNavigatesToJQueryUIWebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify drap and drop functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ui_tests"
    },
    {
      "name": "@droppable"
    }
  ]
});
formatter.step({
  "name": "User clicks on droppable menu",
  "keyword": "When "
});
formatter.match({
  "location": "Home_Page_Steps.userClicksOnDroppableMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User drags \"Drag me to my target\" and drops on \"Drop here\"",
  "keyword": "And "
});
formatter.match({
  "location": "Droppable_Page_Steps.user_drags_and_drops_on(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that success message \"Dropped!\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Droppable_Page_Steps.verify_that_success_message_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Web_Test/Selectable_Page_Test.feature");
formatter.feature({
  "name": "Home Page Verifications",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch \"chrome\" browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Home_Page_Steps.launchBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to JQueryUI WebPage",
  "keyword": "And "
});
formatter.match({
  "location": "Home_Page_Steps.userNavigatesToJQueryUIWebPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify multiple element select functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ui_tests"
    },
    {
      "name": "@selectable"
    }
  ]
});
formatter.step({
  "name": "User clicks on selectable menu",
  "keyword": "When "
});
formatter.match({
  "location": "Home_Page_Steps.userClicksOnSelectableMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects multiple elements on page",
  "rows": [
    {
      "cells": [
        "Item 1",
        "Item 3",
        "Item 7"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Selectable_Page_Steps.userSelectsMultipleElementsOnPage(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that multiple elements are selected",
  "rows": [
    {
      "cells": [
        "Item 1",
        "Item 3",
        "Item 7"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Selectable_Page_Steps.verifyThatMultipleElementsAreSelected(String\u003e)"
});
formatter.result({
  "status": "passed"
});
});