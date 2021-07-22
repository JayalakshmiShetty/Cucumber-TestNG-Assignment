package stepdefs.MobileApp_Steps;

import AppScreens.ChromeWebScreen;
import AppScreens.HomeScreen;
import AppScreens.RegisterUserScreen;
import WebConnector.appiumWebConnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class Home_Screen_Steps extends appiumWebConnector {
    private HomeScreen homeScreen;
    private RegisterUserScreen registerUserScreen;
    private ChromeWebScreen chromeWebScreen;
	public String scenDesc;
    appiumWebConnector wc= new appiumWebConnector();
    Alert alert;

    public Home_Screen_Steps() {
        this.homeScreen=new HomeScreen();
        this.registerUserScreen = new RegisterUserScreen();
        this.chromeWebScreen =new ChromeWebScreen();
    }
    
    @BeforeMethod
	public void before(Scenario scenario) {
		this.scenDesc = scenario.getName();
	}
    
    @AfterMethod
    public void after(Scenario scenario){
    	closeDriver(scenario);
    }

//	@BeforeStep
//	public void beforeStep() throws InterruptedException {
//		Thread.sleep(1000);
//	}



    @Given("The selendroid application is launched")
    public void theSelendroidApplicationIsLaunched() throws Exception {
        wc.setUpDriver();
        //this.homeScreen.tapOnContinueAndOkButtons();
    }



    @When("User taps on {string}")
    public void userTapsOn(String arg0) throws Exception {
        this.homeScreen.tapOnEnButton();
    }

    @And("selects Option {string}")
    public void selectsOption(String arg0) throws Exception {
        this.homeScreen.tapOnNonoButton();
    }

    @Then("Verify that homepage is displayed")
    public void verifyThatHomepageIsDisplayed() throws Exception {
        Assert.assertTrue(wc.verifyThatElementIsDisplayed("File_Logo"), "Homepage File logo is not displayed");
    }

    @When("User taps on Chrome logo Button")
    public void userTapsOnChromeLogoButton() throws Exception {
        this.homeScreen.clickOnChromeLogo();
    }

 

  

   








    @When("User clicked on Show Progress Bar for a while button")
    public void userClickedOnShowProgressBarForaWhileButton() throws Exception {
        PerformActionOnElement("Button_ProgressBar", "Click", "");
    }

    @And("Wait for the loader to disappear")
    public void waitForTheLoaderToDisappear() {
        waitForCondition("NotPresent", "ProgressBar",60);
    }

    @Then("User registration page is available after waiting for the progress bar to disappear")
    public void userRegistrationPageIsAvailableAfterWaitingForTheProgressBarToDisappear() throws Exception {
        Assert.assertTrue(FindAnElement("Get_Name").isDisplayed(),"Registration page title doesn't match");
    }

    @And("Tap on Display Toast BUTTON")
    public void tapOnDisplayToastBUTTON() throws Exception {
        PerformActionOnElement("Button_DisplayToast","Click","");
    }

    @Then("Verify that toast text displayed is {string}")
    public void verifyThatToastTextDisplayedIs(String expectedToast) throws Exception {
        String actualToast = this.homeScreen.getToastMessage();
        Assert.assertEquals(actualToast,expectedToast,"Toast message is incorrect");
    }

    @When("Tap on Display PopupWindow Button")
    public void tapOnDisplayPopupWindowButton() throws Exception {
        PerformActionOnElement("Button_DisplayPopUp","Click","");
    }

    @And("Tap on Dismiss button")
    public void tapOnDismissButton() throws Exception {
       alert=switchToPopup();
       alert.dismiss();
    }


    @When("User clicked on Press to throw unhandled exception Button")
    public void userClickedOnPressToThrowUnhandledExceptionButton() throws Exception {
        PerformActionOnElement("Button_ExceptionTest","Click","");
    }

    @When("User types {string} in throw unhandled exception field")
    public void userTypesInThrowUnhandledExceptionField(String arg0) throws Exception {
        PerformActionOnElement("Textbox_Exception","Type","");
    }



    @Then("Verify that popup Window disappears")
    public void verifyThatPopupWindowDisappears() {


    }


    @Then("Verify that homepage title equals {string}")
    public void verifyThatHomepageTitleEquals(String title) throws Exception {
        Assert.assertEquals(getTextFromScreen("Get_Title"),title,"Home screen title doesn't match");
    }

    @And("Verify the elements on the home screen")
    public void verifyTheElementsOnTheHomeScreen(List<String> stringList) throws Exception {
            Assert.assertTrue(verifyThatListOfAllElementsAreDisplayed(stringList),"All page Elements are not displayed on the creen");
    }
}
