package com.cg.conferenceRegistration.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Shruthi\\conferenceRegistrationApplication\\src\\main\\java\\com\\cg\\conferenceRegistration\\feature\\ConferenceRegistration.feature",
glue="com.cg.conferenceRegistration.stepDefinition")
public class ConferenceRegistrationRunner {

}
