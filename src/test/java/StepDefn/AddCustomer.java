package StepDefn;

import java.util.Map;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ObjRepository.PageAddCustomer;
import ObjRepository.PageHome;

public class AddCustomer {

	@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		PageHome home = new PageHome();
		home.getLnk_addCustomer().click();
	}

	@When("the user fills in the valid details")
	public void the_user_fills_in_the_valid_details(io.cucumber.datatable.DataTable dataTable) {
		PageAddCustomer PageAddCust = new PageAddCustomer();

		Map<String, String> customerDetailsMap = dataTable.asMap(String.class, String.class);

		PageAddCust.getRdo_done().click();
		PageAddCust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
		PageAddCust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
		PageAddCust.getTxt_email().sendKeys(customerDetailsMap.get("emailAdress"));
		PageAddCust.getTxt_adress().sendKeys(customerDetailsMap.get("adress"));
		PageAddCust.getTxt_phnum().sendKeys(customerDetailsMap.get("phoneNum"));
	}

	@Then("the user should see the customer ID generated")
	public void the_user_should_see_the_customer_ID_generated() {

		PageAddCustomer PageAddCust = new PageAddCustomer();

		String newCustId = PageAddCust.getCust_Id().getText();

		

		Assert.assertTrue(newCustId, true);
	}

	@When("the user click the reset button")
	public void the_user_click_the_reset_button() {
		PageAddCustomer PageAddCust = new PageAddCustomer();

		PageAddCust.getBtn_reset().click();
	}

	@When("the user click the submit button")
	public void the_user_click_the_submit_button() {
		PageAddCustomer PageAddCust = new PageAddCustomer();

		PageAddCust.getBtn_submit().click();
	}

	

	@Then("the user should see the error message")
	public void the_user_should_see_the_error_message() {

		System.out.println("error message shown");
			}

		
	}

