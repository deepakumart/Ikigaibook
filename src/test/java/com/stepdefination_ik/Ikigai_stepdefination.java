package com.stepdefination_ik;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.pageobjmodel.Singleton_ikigaibook;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Ikigai_stepdefination extends com.baseclass.Baseclass_ikiga {
	public static WebDriver driver=com.runner_ik.Ikigai_runnercls.driver;
	public static  Singleton_ikigaibook Bd = new Singleton_ikigaibook(driver);


	   @BeforeStep
	    public void beforeScreenshot(Scenario src) {
	
	        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	        src.attach(screenshot, "image/png", "sucessfuly takescreenshot before testcaes");
	
	    }



	   @AfterStep
	    public void afterScreenShot(Scenario src) {
	//         if (src.isFailed()) {
	        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	        src.attach(screenshot, "image/png", "sucessfuly takescreenshot after testcaes");
//	         }



	   }

	   @Given("user launch the Amazon website")
		public void user_launch_the_Amazon_website() {
			implicit();
		    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			maximize();
		}

		@When("User Enter the UserName {string}")
		public void user_Enter_the_UserName(String id) {
			inputvalue(Bd.p().getValidemail(), id);
		}

		@When("User click on the sign in button and its navigate to password page")
		public void user_click_on_the_sign_in_button_and_its_navigate_to_password_page() {
			ClickOnElement(Bd.p().getContinue1());
		}

		@When("User Enter the password {string}")
		public void user_Enter_the_password(String password) {
			inputvalue(Bd.p().getValidpswd(), password);
		}

		@Then("User click on the login button and its navigate to my account page")
		public void user_click_on_the_login_button_and_its_navigate_to_my_account_page() {
			ClickOnElement(Bd.p().getLogin());
		}

		@When("User click on signout buttons")
		public void user_click_on_signout_buttons() {
			ClickOnElement(Bd.p().getLogout());
			   
			javascript(Bd.p().getSignout());
		}

		@When("User Enters the Username {string}")
		public void user_Enters_the_Username(String username) {
			inputvalue(Bd.p().getValidemail(), username);
		}

		@When("User clicks on the sign in button and its navigate to password page")
		public void user_clicks_on_the_sign_in_button_and_its_navigate_to_password_page() {
			ClickOnElement(Bd.p().getContinue1());
		}

		@When("User click on signout button in the signout field")
		public void user_click_on_signout_button_in_the_signout_field() throws InterruptedException {
			ClickOnElement(Bd.p().getLogout());
			   
			javascript(Bd.p().getSignout());
		}


		@When("User Enter the valid Usernames {string}")
		public void user_Enter_the_valid_Usernames(String username) throws InterruptedException {
		
			inputvalue(Bd.p().getValidemail(),"9976188853");
		}

		@When("User clicks on the signin button and its navigates to password page")
		public void user_clicks_on_the_signin_button_and_its_navigates_to_password_page() {
			ClickOnElement(Bd.p().getContinue1());
		}

		@When("User Enters the passwords {string}")
		public void user_Enters_the_passwords(String password) throws InterruptedException {
			
			inputvalue(Bd.p().getValidpswd(),"9788188673");
		}


		@Then("User click on  login button and its navigates to my account page")
		public void user_click_on_login_button_and_its_navigates_to_my_account_page() throws InterruptedException {
		
			ClickOnElement(Bd.p().getLogin());
			ClickOnElement(Bd.p().getLogout());
			   
			javascript(Bd.p().getSignout());
			
		}

	@When("user click on the categories drop down and user select on the book option")
	public void user_click_on_the_categories_drop_down_and_user_select_on_the_book_option() throws InterruptedException {
		
		dropdown(Bd.r().getDropdown(), "10", "byindex");
	}

	@When("user enter the ikigai on search box")
	public void user_enter_the_ikigai_on_search_box() {
		inputvalue(Bd.r().getSend(), "ikigai");
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
	public void user_click_on_add_to_cart_button_and_It_Navigate_to_add_to_cart_page() {
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
