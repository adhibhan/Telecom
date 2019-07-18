package ObjRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefn.Hooks;

public class PageAddTariff {
	
	PageAddTariff(){
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy (id ="customer_id")
	private WebElement lnk_custId;
	
	@FindBy (name ="submit")
	private WebElement btn_submit;

	public WebElement getLnk_custId() {
		return lnk_custId;
	}

	public WebElement getBtn_submit() {
		return btn_submit;
	}
	
	
}
