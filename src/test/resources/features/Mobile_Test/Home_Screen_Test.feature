Feature: Validating Selendroid mobile app testcases

	Background:
		Given The selendroid application is launched
		
	@appium_tests @home_tests @Home1
	Scenario: Verify app page title
		Then Verify that homepage title equals "selendroid-test-app"
		And Verify the elements on the home screen
			|Textbox_CD|Button_ProgressBar|Button_DisplayTextView|Button_DisplayToast|Button_DisplayPopUp|Button_Button_DisplayAndFocusOnLayout|
	
	@appium_tests @home_tests @Home2
	Scenario: Verify Registration page is available after clicking on Show ProgressBar
		When User clicked on Show Progress Bar for a while button
		And Wait for the loader to disappear
		Then User registration page is available after waiting for the progress bar to disappear
	
	@appium_tests @home_tests @Home3
	Scenario:
		And Tap on Display Toast BUTTON
		Then Verify that toast text displayed is "Hello selendroid toast!"
	
	@appium_tests @home_tests @Home4
	Scenario: Verify that Popup window disappears on clicking Dismiss button
		When Tap on Display PopupWindow Button
		And Tap on Dismiss button
		Then Verify that popup Window disappears
	
	@appium_tests @home_tests @Home5
	Scenario: Verify that homescreen disappears on clicking throw unhandled exception
		When User clicked on Press to throw unhandled exception Button
		But Verify that homepage title equals "selendroid-test-app"
	
	@appium_tests @home_tests @Home6
	Scenario: Verify that homescreen disappears on typing text in throw unhandled exception
		When User types "Test" in throw unhandled exception field
		But Verify that homepage title equals "selendroid-test-app"