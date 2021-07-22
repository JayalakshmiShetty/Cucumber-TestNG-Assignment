Feature: Validating Selendroid mobile app testcases

Background:
	Given The selendroid application is launched

	@appium_tests @chrome_tests @Chrome1
	Scenario: Verify Name and Preferred car on Chrome
		When User taps on Chrome logo Button
		Then Verify that chrome screen title equals "selendroid-test-app"
		Then Verify that chrome screen has text "Hello, can you please tell me your name?"
		When User enters name as "Test" and preferred car as "Mercedes"
		And User taps on SendName button
		Then verify that the text hello "This is my way of saying hello" appears on the next screen
		And Verify that name is "Test" and preferred car is "mercedes" is available in the next screen
		When clicked on Here on the bottom of the page
		Then Verify that the previous page is displayed
		And Verify that default Preferred car selected is "Volvo"