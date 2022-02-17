package StepDefiniation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "/Selenium_Cucumber/src/test/resources/Features/Facebook_Login.feature",
   //path of step definition file
   glue = "/Selenium_Cucumber/src/test/java/StepDefiniation/Facebook_Login.java"
   )
public class TestRunner_Facebook {

}
