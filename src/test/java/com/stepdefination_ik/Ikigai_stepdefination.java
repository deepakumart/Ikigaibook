package com.stepdefination_ik;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.pageobjmodel.Singleton_ikigaibook;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Ikigai_stepdefination extends com.baseclass.Baseclass_ikiga {
	public static WebDriver driver = com.runner_ik.Ikigai_runnercls.driver;
	public static Singleton_ikigaibook Bd = new Singleton_ikigaibook(driver);

	@Before
	public void Beforehooks(Scenario Name) {
		String name = Name.getName();
		System.out.println("Name" + name);
	}

//	   @BeforeStep
//	    public void beforeScreenshot(Scenario src) {
//	
//	        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//	        src.attach(screenshot, "image/png", "sucessfuly takescreenshot before testcaes");
//	
//	    }

	@After
	public void afterScreenShot(Scenario src) {
		if (src.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			src.attach(screenshot, "image/png", "sucessfuly takescreenshot after testcaes");
		}

	}

	@Given("User should launch the Amazon website")
	public void user_should_launch_the_amazon_website() {

		implicit();
		driver.get("https://www.amazon.in/");
		maximize();

	}

	@Given("User should click the signIn Link")
	public void user_should_click_the_sign_in_link() {
		ClickOnElement(Bd.p().getUserName());

	}

	@Given("User should enter invalid username {string}")
	public void user_should_enter_invalid_username(String string) {
		inputvalue(Bd.p().getValidemail(), string);

	}

	@Then("User should verify the Username credentials")
	public void user_should_verify_the_Username_credentials() {
		ClickOnElement(Bd.p().getContinue1());
		ass(Bd.p().getvalidationusername(),"Incorrect phone number");

	}

	@Given("User should enter valid username {string} and Invalid password {string}")
	public void user_should_enter_valid_username_and_Invalid_password(String username, String string2) {
		inputvalue(Bd.p().getValidemail(), username);
		ClickOnElement(Bd.p().getContinue1());
		inputvalue(Bd.p().getValidpswd(), string2);

	}

	@Then("User should verify the password credentials")
	public void user_should_verify_the_password_credentials() {
		ClickOnElement(Bd.p().getLogin());
		ass(Bd.p().getValidationPassword(), "Your password is incorrect");
	}

	@Given("User should enter valid username {string} and password {string}")
	public void user_should_enter_valid_username_and_password(String string, String string2) throws IOException {
		inputvalue(Bd.p().getValidemail(), string);
		ClickOnElement(Bd.p().getContinue1());
		inputvalue(Bd.p().getValidpswd(), string2);

	}

	@Then("User should verify the homePage")
	public void user_should_verify_the_homePage() {
		ClickOnElement(Bd.p().getLogin());
		ass(Bd.p().getvalidationHome(), "Hello, deepak");
		ClickOnElement(Bd.p().getLogout());
		javascript(Bd.p().getSignout());
	
	}

	@Given("user launch the Amazon website")
	public void user_launch_the_amazon_website() {
		implicit();
		driver.get("https://www.amazon.in/");
		maximize();
	}

	@When("User Enter the UserName {string} in input field")
	public void user_enter_the_user_name_in_input_field(String string) {
		inputvalue(Bd.p().getValidemail(), string);
	}

	@When("User click on the sign in button and its navigate to password page")
	public void user_click_on_the_sign_in_button_and_its_navigate_to_password_page() {
		ClickOnElement(Bd.p().getContinue1());
	}

	@When("User Enter the password {string} in input field")
	public void user_enter_the_password_in_input_field(String string) {
		inputvalue(Bd.p().getValidpswd(), string);
	}

	@Then("User click on the login button and its navigate to my account page")
	public void user_click_on_the_login_button_and_its_navigate_to_my_account_page() {
		ClickOnElement(Bd.p().getLogin());
		
	}

	@When("user click on the categories drop down and user select on the book option")
	public void user_click_on_the_categories_drop_down_and_user_select_on_the_book_option() {
		
		dropdown(Bd.r().getDropdown(), "10", "byindex");
	}
	
	@When("user enter the {string} on search box")
	public void user_enter_the_on_search_box(String string) {
		inputvalue(Bd.r().getSend(),string);
	}


	@When("user click the search button")
	public void user_click_the_search_button() {
		ClickOnElement(Bd.r().getSearch());
	}

	@When("user select  the ikigai book")
	public void user_select_the_ikigai_book() {
		ClickOnElement(Bd.r().getSelect());
	}

	@Then("user click on  add to cart button and It Navigate to add to cart page")
	public void user_click_on_add_to_cart_button_and_it_navigate_to_add_to_cart_page() {
		windowhandle();
		ClickOnElement(Bd.r().getAddtocart());
	}

	@Then("User click on log out buttons")
	public void user_click_on_log_out_buttons() {
		ClickOnElement(Bd.p().getLogout());
		javascript(Bd.p().getSignout());
	}

	@When("user enter the ikgi on search box")
	public void user_enter_the_ikgi_on_search_box() {
		inputvalue(Bd.r().getSend1(), "hklhshsjssjjsjjqsdcs");
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
		ClickOnElement(Bd.r().getSearch1());
	}

	@Then("user verify the book and get unavailability message")
	public void user_verify_the_book_and_get_unavailability_message() {
		ass(Bd.r().getGet1(), "No results for");
	}

}
