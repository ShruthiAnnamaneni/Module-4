package com.cg.conferenceRegistration.stepDefinition;

import org.junit.Assert;

import com.cg.conferenceRegistration.Module;
import com.cg.conferenceRegistration.pom.ConferenceRegistration;
import com.cg.conferenceRegistration.pom.PaymentDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRegistrationStepDefinition {
	 static ConferenceRegistration conferenceRegistration=null;
	 static PaymentDetails paymentDetails=null;
	 
@Given("^user is registering$")
public void user_is_registering() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Module.setBrowser();
	Module.setBrowserConfig();
	Module.runTest();
    conferenceRegistration=new ConferenceRegistration(Module.driver);
    paymentDetails=new PaymentDetails(Module.driver);
	
}

@When("^the title of page is Conference Registration$")
public void the_title_of_page_is_Conference_Registration() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String title = Module.driver.getTitle();
	Assert.assertEquals("Conference Registration", title);
}

@Then("^user enters first name$")
public void user_enters_first_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveFirstName();
}

@Then("^user enters last name$")
public void user_enters_last_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveLastName();
}

@Then("^user enters email$")
public void user_enters_email() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveEmail();
}

@Then("^user enters contact number$")
public void user_enters_contact_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveContactNo();
}

@Then("^user selects number of people$")
public void user_selects_number_of_people() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveNoOfPeople();
}

@Then("^user enters name of the building and room number$")
public void user_enters_name_of_the_building_and_room_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveBuildingName();
}

@Then("^user enters area name$")
public void user_enters_area_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveAreaName();
}

@Then("^user selects city$")
public void user_selects_city() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveCity();
}

@Then("^user selects state$")
public void user_selects_state() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveState();
}

@Then("^user selects conference access$")
public void user_selects_conference_access() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
	conferenceRegistration.giveConferenceAccess();
}

@Then("^click on next$")
public void click_on_next() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	conferenceRegistration.clickNext();
}

@Then("^title of the page is Payment Details$")
public void title_of_the_page_is_Payment_Details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	String title = Module.driver.getTitle();
	Assert.assertEquals("Payment Details", title);
}

@Then("^user enters card holder name$")
public void user_enters_card_holder_name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	paymentDetails.clickNext();
	paymentDetails.giveCardHolderName();
}

@Then("^user enters debit card number$")
public void user_enters_debit_card_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	paymentDetails.clickNext();
	paymentDetails.giveDebitCardName();
}

@Then("^user enters cvv number$")
public void user_enters_cvv_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	paymentDetails.clickNext();
	paymentDetails.giveCvvNumber();
}

@Then("^user enters card expiration month$")
public void user_enters_card_expiration_month() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	paymentDetails.clickNext();
	paymentDetails.giveCardExpiryMonth();
}

@Then("^user enters card expiration year$")
public void user_enters_card_expiration_year() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	paymentDetails.clickNext();
	paymentDetails.giveCardExpiryYear();
}

@Then("^click on make payment$")
public void click_on_make_payment() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	   paymentDetails.clickNext();
	   Module.driver.close();
}


}
