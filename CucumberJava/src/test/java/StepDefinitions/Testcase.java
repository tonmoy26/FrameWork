package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testcase {
	
	@Given("Im in Homepage")
	public void im_in_homepage() {
	    System.out.println("I'm in Homepage!");
    
	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() {
		System.out.println("I entered my username and password");
	   
	}

	@And("I click on the login button")
	public void i_click_on_the_login_button() {
		System.out.println("Cliked on login button");
	   
	}

	@Then("Im able to login and see the Dashboard")
	public void im_able_to_login_and_see_the_dashboard() {
		System.out.println("Im in! and able to see the dashbaord");
	   
	}
	

}
