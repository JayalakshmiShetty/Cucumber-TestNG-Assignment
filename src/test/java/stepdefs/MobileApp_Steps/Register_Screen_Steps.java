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

public class Register_Screen_Steps extends appiumWebConnector {
    private HomeScreen homeScreen;
    private RegisterUserScreen registerUserScreen;
    private ChromeWebScreen chromeWebScreen;
	public String scenDesc;
    appiumWebConnector wc= new appiumWebConnector();

    public Register_Screen_Steps() {
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


    @When("User taps on File logo button")
    public void userTapsOnFileLogoButton() throws Exception {
        PerformActionOnElement("File_Logo","Click","");
    }

    @Then("Verify that registration page title equals {string}")
    public void verifyThatRegistrationPageTitleEquals(String arg0) {

    }
    @When("User taps on the button Verify Register User")
    public void userTapsOnTheButtonVerifyRegisterUser() throws Exception {
        PerformActionOnElement("Button_VerifyRegisterUser","Click","");
    }

    @When("User taps on Register User button")
    public void userTapsOnRegisterUserButton() throws Exception {
        PerformActionOnElement("Button_RegisterUser","Click","");
    }


    @Then("Verify that the name field is prepopulated as {string}")
    public void verifyThatTheNameFieldIsPrepopulatedAs(String expectedName) throws Exception {
        Assert.assertEquals(verifyThatElementIsDisplayed("Textbox_RegName"),expectedName, "Name field is not pre-populated");
    }

    @And("verify that the text Welcome {string} appears on the next screen")
    public void verifyThatTheTextWelcomeAppearsOnTheNextScreen(String expectedName) throws Exception {
            Assert.assertEquals(verifyThatElementIsDisplayed("GetNextPageText"),expectedName,"Verification failed");
    }

    @And("Verify that {string} is selected as Programming Language by default")
    public void verifyThatIsSelectedAsProgrammingLanguageByDefault(String expectedLanguage) throws Exception {
        Assert.assertEquals(getTextFromScreen("Dropdown_programmingLanguages"),expectedLanguage,"Ruby not selected as a Programming language");
    }

    @When("Fill register user Page with respective values")
    public void fillRegisterUserPageWithRespectiveValues(List<String> data) throws Exception {
        this.registerUserScreen.registerUserWithDetails(data);

    }

    @And("User taps on Checkbox {string}")
    public void userTapsOnCheckbox(String arg0) throws Exception {
        this.registerUserScreen.tapOnAcceptAddCheckbox();
    }


    @Then("Verify the entered data in verify user screen")
    public void verifyTheEnteredDataInVerifyUserScreen(List<String> expectedData) throws Exception {
     Assert.assertTrue(this.registerUserScreen.getTextUser(FindAnElement("Get_Username")).equalsIgnoreCase(expectedData.get(0))
             && this.registerUserScreen.getTextUser(FindAnElement("Get_Username")).equalsIgnoreCase(expectedData.get(1))
             && this.registerUserScreen.getTextUser(FindAnElement("Get_Password")).equalsIgnoreCase(expectedData.get(2))
     );
    }

    @And("Verify all the elements on Registration screen")
    public void verifyAllTheElementsOnRegistrationScreen(List<String> stringList) throws Exception {
        Assert.assertTrue(verifyThatListOfAllElementsAreDisplayed(stringList),"All page Elements are not displayed on the creen");

    }
}
