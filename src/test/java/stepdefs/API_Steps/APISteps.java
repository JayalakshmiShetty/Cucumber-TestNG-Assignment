package stepdefs.API_Steps;
import io.cucumber.java.AfterStep;
import net.serenitybdd.core.annotations.events.AfterScenario;
import org.testng.ITestResult;
import com.cucumber.listener.Reporter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import com.sun.xml.bind.v2.schemagen.xmlschema.Schema;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import ApplicationPages.Blogpage;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.testng.Assert;
import static org.hamcrest.Matchers.notNullValue;

import org.hamcrest.MatcherAssert;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
///import testDataBuild.TestData;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

import static io.restassured.RestAssured.given;

public class APISteps {
    RequestSpecification request;
    static ExtentReports report;
    static ExtentTest logger;
    Response response;

    PrintStream log;
    JSONObject payload;
    public Scenario scenario;

    public APISteps() {
    }


    @Before
    public synchronized void  before(Scenario scenario) throws FileNotFoundException {
        report = new ExtentReports(System.getProperty("user.dir") + "/test-output/klipClearTestReport_Extent.html", true);
        report
                .addSystemInfo("Host Name", "Jayalakshmi Shetty")
                .addSystemInfo("Automation Type", "API Automation Testing")
                .addSystemInfo("Application Name", "Test Application");
        report.loadConfig(new File(System.getProperty("user.dir") + "/Users/jayalakshmishetty/Downloads/Selenium-Cucumber-TestNG-Maven-master/target/testng-cucumber-reports/API_Test/cuketesting.xml"));
        log =new PrintStream(new FileOutputStream("logging_Data.txt"));
        request=new RequestSpecBuilder().setBaseUri("https://reqres.in")
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .setContentType(ContentType.JSON).build();

        
    }

    @AfterScenario
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
            logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
        }
        report.endTest(logger);
    }

    @After
    public void after(Scenario scenario) {

    }








    @Given("GET HTTP request to URI {string} and resource {string}")
    public void getHTTPRequestToURIAndResource(String arg0, String resource) {

       logger = report.startTest("Validate the JSON response as per following and add assertions");
        response= given().spec(request).when().get(resource).then().extract().response();
    }


    @And("Verify that the value of {string} for id {int} in response is {string}")
    public void verifyThatTheValueOfForIdInResponseIs(String arg0, int id, String expectedName) {
        System.out.println(response.asString());
        List<String> firstNames=response.path("data.first_name");
        for(String firstName: firstNames){
            if(firstName.equalsIgnoreCase(expectedName)){

                Assert.assertEquals(firstName, expectedName,"First name is not as expected");
                }
            }

        }


    @Given("Payload with name {string} and job {string}")
    public void payload_with_name_and_job(String string, String string2) {
        payload = new JSONObject();
        payload.put("name", "Bryant");
        payload.put("job", "BA");
        System.out.println("Payload is"+payload);
    }

    @When("POST HTTP request to URI {string} and resource {string}")
    public void post_HTTP_request_to_URI_and_resource(String string, String resource) {
        response=given().spec(request).body(payload.toString()).when().post(resource).then().extract().response();
    }



    @Then("Verify that id is generated")
    public void verify_that_id_is_generated() {
        response.then().body("id", notNullValue());
        //Either of these
        Assert.assertNotNull(response.body().jsonPath().get("id"));

    }

    @Then("Verify response JSON schema")
    public void verify_response_JSON_schema() throws IOException {
        if (response.getContentType().contains("application/json")) {
            File source = new File(System.getProperty("user.dir")+"/src/test/resources/payload");
            File dest = new File(System.getProperty("user.dir")+"/target/classes");
            FileUtils.copyDirectory(source, dest);
            MatcherAssert.assertThat(response.getBody().asString(), matchesJsonSchemaInClasspath("post_schema.json"));
            logger.log(LogStatus.INFO,"Response JSON schema is matched ");

        }
    }

    @Then("Verify that GET status code is {int}")
    public void verifyThatGETStatusCodeIs(int expectedStatusCode) {
            int actualStatusCode = response.getStatusCode();
            Assert.assertEquals(actualStatusCode, expectedStatusCode);
        logger.log(LogStatus.INFO,"GET Status code is equal to: "+ "actualStatusCode");
    }



    @Then("Verify that POST status code is {int}")
    public void verifyThatPOSTStatusCodeIs(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(actualStatusCode, expectedStatusCode);
        //logger.log(LogStatus.INFO,"POST Status code is equal to : "+ actualStatusCode);
    }
}
