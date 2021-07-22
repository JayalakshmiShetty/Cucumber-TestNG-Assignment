package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;



import java.io.File;


@CucumberOptions( glue = {"stepdefs.API_Steps"}, plugin = {"pretty","html:de.monochromata.cucumber.report.PrettyReports:target/cucumber" ,
        "html:target/cucumber-reports/API_Test/cucumber-pretty/report.html","json:target/json-cucumber-reports/API_Test/cukejson.json",
        "testng:target/testng-cucumber-reports/API_Test/cuketestng.xml" }, monochrome = true,
        features = {"src/test/resources/features/API_Test"})
public class APIRunner extends  AbstractTestNGCucumberTests{


    @BeforeClass
    public static void before() {
        System.out.println("Before - "+System.currentTimeMillis());
    }


    @AfterClass
    public static void after() {
        System.out.println("After - "+System.currentTimeMillis()
        );
    }

}
