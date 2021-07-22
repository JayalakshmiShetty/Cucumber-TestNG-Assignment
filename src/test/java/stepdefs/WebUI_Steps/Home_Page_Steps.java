package stepdefs.WebUI_Steps;

import ApplicationPages.ControlgroupPage;
import ApplicationPages.DroppablePage;
import ApplicationPages.HomePage;
import ApplicationPages.SelectablePage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

public class Home_Page_Steps extends webconnector {
    private HomePage homePage;
    private DroppablePage droppablePage;
    private SelectablePage selectablePage;
    private ControlgroupPage controlgroupPage;
	public String scenDesc;

    public Home_Page_Steps() {
        this.homePage = new HomePage();
        this.droppablePage = new DroppablePage();
        this.selectablePage= new SelectablePage();
        this.controlgroupPage = new ControlgroupPage();
    }
    
    @BeforeMethod
	public void before(Scenario scenario) {
		this.scenDesc = scenario.getName();
		setUpDriver();
	}
    
    @AfterMethod
    public void after(Scenario scenario){
    	closeDriver(scenario);
    }

//	@BeforeStep
//	public void beforeStep() throws InterruptedException {
//		Thread.sleep(1000);
//	}





    @Then("Verify that success messge {string} is displayed")
    public void verify_that_success_messge_is_displayed(String string) {

    }

    @Given("Launch {string} browser")
    public void launchBrowser(String arg0) {
        this.homePage.loadWebBrowser();
    }

    @Given("User navigates to JQueryUI WebPage")
    public void userNavigatesToJQueryUIWebPage() throws IOException, InvalidFormatException {
        this.homePage.goToHomePage();
    }

    @When("User clicks on selectable menu")
    public void userClicksOnSelectableMenu() throws Exception {
        this.homePage.clickOnSelectableMenu();
    }

    @When("User clicks on droppable menu")
    public void userClicksOnDroppableMenu() throws Exception {
        this.homePage.clickOnDroppableMenu();
    }

    @When("User selects Controlgroup option from left menu available under Widgets")
    public void userSelectsControlgroupOptionFromLeftMenuAvailableUnderWidgets() throws Exception {
        this.homePage.clickControlgroup();
    }



}
