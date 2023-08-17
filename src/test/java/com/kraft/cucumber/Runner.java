package com.kraft.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/kraft/cucumber/Calculator.feature",
        glue = "com/kraft/cucumber"
)
public class Runner extends AbstractTestNGCucumberTests {

}
