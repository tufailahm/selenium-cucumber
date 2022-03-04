package com.training.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {


	
	@Given("new browser is open")
	public void new_browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("user enters a text search page")
	public void user_enters_a_text_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // new io.cucumber.java.PendingException();
	}

	@When("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	  // new io.cucumber.java.PendingException();
	}

}
