package stepdefs.WebUI_Steps;

import ApplicationPages.ControlgroupPage;
import ApplicationPages.DroppablePage;
import ApplicationPages.HomePage;
import ApplicationPages.SelectablePage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Droppable_Page_Steps extends webconnector {
    private HomePage homePage;
    private DroppablePage droppablePage;
    public String scenDesc;

    public Droppable_Page_Steps() {
        this.homePage = new HomePage();
        this.droppablePage = new DroppablePage();
    }

    @BeforeMethod
    public void before(Scenario scenario) {
        this.scenDesc = scenario.getName();
        setUpDriver();
    }

    @AfterMethod
    public void after(Scenario scenario) {
        closeDriver(scenario);
    }

//	@BeforeStep
//	public void beforeStep() throws InterruptedException {
//		Thread.sleep(100);
//	}


    @When("User drags {string} and drops on {string}")
    public void user_drags_and_drops_on(String drag, String drop) throws Exception {
        this.droppablePage.dragAndDrop(drag, drop);
    }

    @Then("Verify that success message {string} is displayed")
    public void verify_that_success_message_is_displayed(String string) throws Exception {
        Assert.assertEquals(this.droppablePage.getDroppableElement().getText(), "Dropped!");
    }
}