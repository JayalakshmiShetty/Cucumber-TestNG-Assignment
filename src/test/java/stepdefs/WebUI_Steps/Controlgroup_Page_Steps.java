package stepdefs.WebUI_Steps;

import ApplicationPages.ControlgroupPage;
import ApplicationPages.DroppablePage;
import ApplicationPages.HomePage;
import ApplicationPages.SelectablePage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.events.AfterScenario;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

public class Controlgroup_Page_Steps extends webconnector {
    private HomePage homePage;
    private ControlgroupPage controlgroupPage;
    public String scenDesc;

    public Controlgroup_Page_Steps() {
        this.homePage = new HomePage();
        this.controlgroupPage = new ControlgroupPage();
    }

    @Before
    public void before(Scenario scenario) {
        this.scenDesc = scenario.getName();
        //setUpDriver();
    }

    @After("@ui_tests")
    public void after(Scenario scenario) {
        closeDriver(scenario);
    }

    //	@BeforeStep
//	public void beforeStep() throws InterruptedException {
//		Thread.sleep(1000);
//	}
    @And("User selects {string} from the horizontal dropdown")
    public void userSelectsFromTheHorizontalDropdown(String text) throws Exception {
        this.controlgroupPage.switchToFrame();
        this.controlgroupPage.selectVehicleFromDropdown("List_CartypeHorizontal", "Horizontal_CarType", text);
    }

    @And("selects {string} from the vertical dropdown")
    public void selectsFromTheVerticalDropdown(String text) throws Exception {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_END);
        this.controlgroupPage.selectVehicleFromDropdown("List_CartTypeVertical", "Vertical_CarType", text);
    }

    @And("User clicks on car type {string} and {string} for truck")
    public void userClicksOnCarTypeAndForTruck(String arg0, String arg1) throws Exception {
        this.controlgroupPage.clickOnOptionsStandardAndInsurance();
    }

    @And("inputs number of cars as {string}")
    public void inputsNumberOfCarsAs(String carCount) throws Exception {
        this.controlgroupPage.inputNumberOfCarsForHorizontalView(carCount);
    }

    @And("Enters number of Cars as {string}")
    public void entersNumberOfCarsAs(String carCount) throws Exception {
        this.controlgroupPage.inputNumberOfCarsForVerticalView(carCount);
    }


    @And("Clicks on book now for {string}")
    public void clicksOnBookNowFor(String arg0) throws Exception {
        this.controlgroupPage.clickOnBookNowForTrucks();
    }

    @And("Clicks on book now for truck")
    public void clicksOnBookNowForTruck() throws Exception {
        this.controlgroupPage.clickOnBookNowForTrucks();
    }


    @And("User clicks on car type Automatic and Insurance for SUV")
    public void userClicksOnCarTypeAutomaticAndInsuranceForSUV() throws Exception {
        this.controlgroupPage.clickOnOptionsAutomaticAndInsurance();
    }

    @And("User clicks on car type Standard and Insurance option for truck")
    public void userClicksOnCarTypeStandardAndInsuranceOptionForTruck() throws Exception {
        this.controlgroupPage.clickOnOptionsStandardAndInsurance();
    }
}