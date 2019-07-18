package ObjRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefn.Hooks;

public class PageHome {
	
	public PageHome(){
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement lnk_addCustomer;

	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement lnk_addTariffPlan;
	
	@FindBy (xpath="(//a[text()='Add Tariff Plan to Customer'])[1]")
	private WebElement lnk_addTariffPlanToCustomer;
	
	@FindBy (xpath= "(//a[text()='Pay Billing'])[1]")
	private WebElement lnk_payBilling;

	public WebElement getLnk_addCustomer() {
		return lnk_addCustomer;
	}

	public WebElement getLnk_addTariffPlan() {
		return lnk_addTariffPlan;
	}

	public WebElement getLnk_addTariffPlanToCustomer() {
		return lnk_addTariffPlanToCustomer;
	}

	public WebElement getLnk_payBilling() {
		return lnk_payBilling;
	}
	
}
