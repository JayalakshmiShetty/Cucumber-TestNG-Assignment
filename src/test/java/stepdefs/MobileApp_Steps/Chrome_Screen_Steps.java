package stepdefs.MobileApp_Steps;

import AppScreens.ChromeWebScreen;
import AppScreens.HomeScreen;
import AppScreens.RegisterUserScreen;
import WebConnector.appiumWebConnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class Chrome_Screen_Steps extends appiumWebConnector {
    private HomeScreen homeScreen;
    private RegisterUserScreen registerUserScreen;
    private ChromeWebScreen chromeWebScreen;
	public String scenDesc;
    appiumWebConnector wc= new appiumWebConnector();

    public Chrome_Screen_Steps() {
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

    @Then("Verify that chrome screen title equals {string}")
    public void verifyThatChromeScreenTitleEquals(String expectedTitle) throws Exception {
        Assert.assertEquals(wc.getTextFromScreen("Get_Title"), expectedTitle);
    }

    @Then("Verify that chrome screen has text {string}")
    public void verifyThatChromeScreenHasText(String expected) throws Exception {
        Assert.assertEquals(wc.getTextFromScreen("GetName"), expected, "Hello string Doesn't match");
    }

    @When("User enters name as {string} and preferred car as {string}")
    public void userEntersNameAsAndPreferredCarAs(String name, String car) throws Exception {
        this.chromeWebScreen.enterName(name);
        this.chromeWebScreen.selectPreferredCar(car);
    }


    @And("User taps on SendName button")
    public void userTapsOnSendNameButton() throws Exception {
        PerformActionOnElement("Button_SendName","Click","Unable to tap on button");
    }



    @And("Verify that name is {string} and preferred car is {string} is available in the next screen")
    public void verifyThatNameIsAndPreferredCarIsIsAvailableInTheNextScreen(String expectedName, String expectedLocation) throws Exception {
        Assert.assertEquals(verifyThatElementIsDisplayed("GetName"),expectedName);
        Assert.assertEquals(verifyThatElementIsDisplayed("GetCar"),expectedLocation);
    }

    @When("clicked on Here on the bottom of the page")
    public void clickedOnHereOnTheBottomOfThePage() throws Exception {
        this.chromeWebScreen.tapOnHereLink();
    }

    @Then("Verify that the previous page is displayed")
    public void verifyThatThePreviousPageIsDisplayed() throws Exception {
        Assert.assertTrue(verifyThatElementIsDisplayed("Button_SendName"), "Unable to fPrevious page Send me you name! button ");
    }

    @And("Verify that default Preferred car selected is {string}")
    public void verifyThatDefaultPreferredCarSelectedIs(String expectedCar) throws Exception {
        Assert.assertEquals(verifyThatElementIsDisplayed("GetCar"), expectedCar);
    }


    @Then("verify that the text hello {string} appears on the next screen")
    public void verifyThatTheTextHelloAppearsOnTheNextScreen(String expectedName) throws Exception {
            Assert.assertEquals(verifyThatElementIsDisplayed("GetNextPageText"),expectedName,"Verification failed");

    }
}
