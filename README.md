#Cucumber-TestNG_Assignment 
## _Pre-requisites_

- Java installed in the system
- Maven installed in the system
- Intellij (OR Eclipse)
- Android studio installed in the system
- Java and Android environment paths should be set
- Appium desktop installed in the system
- Emulator or real android device for execution


## Execution from Terminal
Run below commands on Intellij terminal
```
 mvn clean verify -Dcucumber.options="--tags '@api_tests'"
```
```
 mvn clean verify -Dcucumber.options="--tags 'ui_tests'"
``` 
```
 mvn clean verify -Dcucumber.options="--tags 'appium_tests'"
``` 
>Note:Based on the execution tag is configurable.

## Execution From Intellij:
> - Right click on testng.xml file and click on "Run"
> - Right click on .feature file and click on "Run"  

## Steps To Run selenium and rest-assured Scripts
- In Intellij termninal execute appium command mentioned in "Execution from Terminal"
- Or execute steps mentioned in Execution From Intellij

## Steps To Run Appium Scripts
- Make sure that ANDDROID_HOME and nodeJS paths are set
- Start appium server using Appium Desktop app
-  Connect an android device or open an emulator.
-  Execute the command "adb devices" on termnal
-  Copy the device name from terminal
-  Open the file '/Cucumber-TestNG-Assignment/src/test/config/mobileapp.properties', enter device name as shown on terminal and modify android version and other details as per the selected device.
-  In Intellij termninal execute appium command mentioned in "Execution from Terminal"

## Features
> - Hooks
> - Page Object Model
> - BDD framework
> - Data driven Framework
> - Maven Cucumber Reporting
> - TestNG extent reporting (Under test-output folder)
> - Junit reporting 
> - HTML  Cucumber reporting (This report is in target/cucumber-reports/API_Test)
> - JSON Cucumber reporting (This report is in target/json-cucumber-reports/cucumber-reports/API_Test)

# Cucumber-TestNG-Assignment
