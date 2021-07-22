$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/API_Test/API_Automation_Test.feature");
formatter.feature({
  "name": "Verify that API requests are giving expected responses",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that GET HTTP request is successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api_tests"
    },
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "GET HTTP request to URI \"https://reqres.in\" and resource \"/api/users?page\u003d2\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that the status code is 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that the value of \"first_name\" for id 10 in response is \"Byron\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Verify that POST request is successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api_tests"
    },
    {
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "name": "Payload with name \"Bryant\" and job \"BA\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "POST HTTP request to URI \"https://reqres.in\" and resource \"/api/users\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that the status code is 201",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify that id is generated",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Verify response JSON schema",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});