package stepdefs.WebUI_Steps;

import ApplicationPages.ControlgroupPage;
import ApplicationPages.DroppablePage;
import ApplicationPages.HomePage;
import ApplicationPages.SelectablePage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class Selectable_Page_Steps extends webconnector {
    private HomePage homePage;
    private SelectablePage selectablePage;
    public String scenDesc;

    public Selectable_Page_Steps() {
        this.homePage = new HomePage();
        this.selectablePage = new SelectablePage();
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

    @And("user selects multiple elements on page")
    public void userSelectsMultipleElementsOnPage(List<String> items) throws Exception {
        this.selectablePage.selectMultipleItems(items);
    }

    @Then("Verify that multiple elements are selected")
    public void verifyThatMultipleElementsAreSelected(List<String> itemList) throws Exception {
        System.out.println("++====="+this.selectablePage.verifyItemSelected(itemList));
    }

}