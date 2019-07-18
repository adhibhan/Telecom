package StepDefn;

import ObjRepository.PageHome;
import cucumber.api.java.en.Given;


public class Home {
	
		
	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		PageHome home = new PageHome();
		home.getLnk_addTariffPlan().click();
	}

}
