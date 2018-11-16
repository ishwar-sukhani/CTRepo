package com.example.serenity.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
				 glue = {"com.example.serenity.stepDefinitions"}
				)
public class MainRunner {
}
