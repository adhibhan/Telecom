package ObjRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefn.Hooks;

public class PageAddCustomer {

	public PageAddCustomer() {
		PageFactory.initElements(Hooks.driver, this);
	}

	public WebElement getRdo_done() {
		return rdo_done;
	}

	public WebElement getTxt_fname() {
		return txt_fname;
	}

	public WebElement getTxt_lname() {
		return txt_lname;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_adress() {
		return txt_adress;
	}

	public WebElement getTxt_phnum() {
		return txt_phnum;
	}

	public WebElement getBtn_submit() {
		return btn_submit;
	}

	public WebElement getBtn_reset() {
		return btn_reset;
	}

	public WebElement getCust_Id() {
		return cust_Id;
	}

	@FindBy(xpath = "//label[text()='Done']")
	private WebElement rdo_done;

	@FindBy(tagName = "h3")
	private WebElement cust_Id;

	@FindBy(id = "fname")
	private WebElement txt_fname;

	@FindBy(id = "lname")
	private WebElement txt_lname;

	@FindBy(id = "email")
	private WebElement txt_email;

	@FindBy(name = "addr")
	private WebElement txt_adress;

	@FindBy(name = "telephoneno")
	private WebElement txt_phnum;

	@FindBy(name = "submit")
	private WebElement btn_submit;

	@FindBy(xpath = "//input[@value='Reset']")
	private WebElement btn_reset;

}
