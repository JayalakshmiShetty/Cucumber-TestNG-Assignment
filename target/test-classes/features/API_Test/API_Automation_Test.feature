Feature: Verify that API requests are giving expected responses

  @api_tests @Test1
  Scenario: Verify that GET HTTP request is successful
    Given  GET HTTP request to URI "https://reqres.in" and resource "/api/users?page=2"
    Then Verify that GET status code is 200
    And Verify that the value of "first_name" for id 10 in response is "Byron"

  @api_tests @Test2
  Scenario: Verify that POST request is successful
    Given  Payload with name "Bryant" and job "BA"
    When POST HTTP request to URI "https://reqres.in" and resource "/api/users"
    Then Verify that POST status code is 201
    And Verify that id is generated
    And Verify response JSON schema


