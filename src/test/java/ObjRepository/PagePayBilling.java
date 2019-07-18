package ObjRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefn.Hooks;

public class PagePayBilling {
	
	PagePayBilling (){
		
		PageFactory.initElements(Hooks.driver, this);
	}

	
	@FindBy (id ="customer_id")
	private WebElement cust_Id_Bill;
	
	@FindBy (name= "submit")
	private WebElement btn_Submit;

	public WebElement getCust_Id_Bill() {
		return cust_Id_Bill;
	}

	public WebElement getBtn_Submit() {
		return btn_Submit;
	}
	
}
