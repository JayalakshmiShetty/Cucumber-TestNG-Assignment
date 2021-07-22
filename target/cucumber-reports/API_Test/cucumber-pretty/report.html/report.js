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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "GET HTTP request to URI \"https://reqres.in\" and resource \"/api/users?page\u003d2\"",
  "keyword": "Given "
});
formatter.match({
  "location": "APISteps.getHTTPRequestToURIAndResource(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that GET status code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "APISteps.verifyThatGETStatusCodeIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that the value of \"first_name\" for id 10 in response is \"Byron\"",
  "keyword": "And "
});
formatter.match({
  "location": "APISteps.verifyThatTheValueOfForIdInResponseIs(String,int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Payload with name \"Bryant\" and job \"BA\"",
  "keyword": "Given "
});
formatter.match({
  "location": "APISteps.payload_with_name_and_job(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "POST HTTP request to URI \"https://reqres.in\" and resource \"/api/users\"",
  "keyword": "When "
});
formatter.match({
  "location": "APISteps.post_HTTP_request_to_URI_and_resource(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that POST status code is 201",
  "keyword": "Then "
});
formatter.match({
  "location": "APISteps.verifyThatPOSTStatusCodeIs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that id is generated",
  "keyword": "And "
});
formatter.match({
  "location": "APISteps.verify_that_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify response JSON schema",
  "keyword": "And "
});
formatter.match({
  "location": "APISteps.verify_response_JSON_schema()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});