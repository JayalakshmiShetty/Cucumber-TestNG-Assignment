package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


@CucumberOptions( tags = {"@appium_tests"},glue = {"stepdefs/MobileApp_Steps"}, plugin = {"pretty","html:de.monochromata.cucumber.report.PrettyReports:target/cucumber" ,"html:target/cucumber-reports/Mobile_Test/cucumber-pretty","json:target/json-cucumber-reports/Mobile_Test/cukejson.json",
        "testng:target/testng-cucumber-reports/Mobile_Test/cuketestng.xml" },
        features = {"src/test/resources/features/Mobile_Test"})
public class AppiumRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void before() {
        System.out.println("Before - "+System.currentTimeMillis());
    }

    @AfterClass
    public static void after() {
        System.out.println("After - "+System.currentTimeMillis());
    }

}
