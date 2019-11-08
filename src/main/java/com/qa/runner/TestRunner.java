package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "/Users/himaliabeykoon/eclipse-workspace2/HimaliSampleBDDFramework/src/test/java/Features/login.feature",//the path of feature file
 glue= {"com.qa.stepDefinitions"},//path to step definition file
 format = {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},// to generate the different types of reporting
 monochrome = true, //display the console output in a proper readable format
 strict = true, // it will check if any step is not defined in step definition file
 dryRun = false // to check the mapping is proper between feature file and step definition file
 //tags = { "@smokeTest","@RegrssionTest"}//to define what tests to include or exclude from test suits
)
public class TestRunner {

}
