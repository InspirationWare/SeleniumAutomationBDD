package com.techbeetraining.ExercisePart1;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={""})
public class TestRunner {

	public TestRunner() {

	}
 }