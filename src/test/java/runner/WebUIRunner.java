package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


@CucumberOptions( glue = {"stepdefs.WebUI_Steps"}, plugin = {"pretty","html:de.monochromata.cucumber.report.PrettyReports:target/cucumber" ,
		"html:target/cucumber-reports/Web_Test/cucumber-pretty/report.html","json:target/json-cucumber-reports/Web_Test/cukejson.json",
		"testng:target/testng-cucumber-reports/Web_Test/cuketestng.xml" }, monochrome = true,
		features = {"src/test/resources/features/Web_Test"})
public class WebUIRunner extends  AbstractTestNGCucumberTests{


	@BeforeClass
	public static void before() {
		System.out.println("Before - "+System.currentTimeMillis());
	}
	
	@AfterClass
	public static void after() {
		System.out.println("After - "+System.currentTimeMillis()
		);
	}
//tags = {"@ui_tests"},
}
