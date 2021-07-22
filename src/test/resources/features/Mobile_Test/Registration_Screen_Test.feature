Feature: Validating Selendroid mobile app testcases

	Background:
		Given The selendroid application is launched

	@appium_tests @registration @Registration1
	Scenario: Verify that the user registration successful and verify the details on the page
		When User taps on File logo button
		Then Verify that registration page title equals "selendroid-test-app"
		And Verify all the elements on Registration screen
			|Textbox_Username|Textbox_Email|Textbox_Password|Textbox_RegName|Dropdown_programmingLanguage|Checkbox_Accept|Button_VerifyRegisterUser|
		And verify that the text Welcome "Welcome to register a new User" appears on the next screen
		Then Verify that the name field is prepopulated as "Mr. Burns"
		And Verify that "Ruby" is selected as Programming Language by default
		When Fill register user Page with respective values
			|jaya_test| "jaya_test_user@gmail.com| J2y2L#|Jaya|PHP|
		And User taps on Checkbox "Checkbox_Accept"
		When User taps on the button Verify Register User
		Then Verify the entered data in verify user screen
			|jaya_test| "jaya_test_user@gmail.com| J2y2L#|Jaya|PHP|
		When User taps on Register User button
		Then Verify that homepage is displayed