$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Mobile_Test/Appium_Automation_Test.feature");
formatter.feature({
  "name": "Validating Selendroid mobile app testcases",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The selendroid application is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "SelendroidSteps.theSelendroidApplicationIsLaunched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify app page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@appium_tests"
    }
  ]
});
formatter.step({
  "name": "Verify that the title equals \"selendroid-test-app\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SelendroidSteps.verifyThatTheTitleEquals(String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "The selendroid application is launched",
  "keyword": "Given "
});
formatter.match({
  "location": "SelendroidSteps.theSelendroidApplicationIsLaunched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that homepage is displayed after clicking on No",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@appium_tests"
    }
  ]
});
formatter.step({
  "name": "User taps on \"EN Button\"",
  "keyword": "When "
});
formatter.match({
  "location": "SelendroidSteps.userTapsOn(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat WebConnector.appiumWebConnector.getElementWithLocator(appiumWebConnector.java:202)\n\tat WebConnector.appiumWebConnector.FindAnElement(appiumWebConnector.java:228)\n\tat AppScreens.HomeScreen.tapOnContinueAndOkButtons(HomeScreen.java:35)\n\tat AppScreens.HomeScreen.tapOnEnButton(HomeScreen.java:45)\n\tat stepdefs.MobileApp_Steps.SelendroidSteps.userTapsOn(SelendroidSteps.java:57)\n\tat ✽.User taps on \"EN Button\"(file:src/test/resources/features/Mobile_Test/Appium_Automation_Test.feature:11)\n",
  "status": "failed"
});
