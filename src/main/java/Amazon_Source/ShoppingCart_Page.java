package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart_Page extends Amazon_DDT {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
	WebElement AddButton;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-remove']")
	WebElement DeleteButton;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement ProceedToCheckoutButton;
	
	
	public void Add_Button()
	{
		AddButton.click();
	}
	
	public void Delete_Button()
	{
		DeleteButton.click();
	}
	
	public void ProceedtoCheckoutButton(WebDriver driver)
	{
		ProceedToCheckoutButton.click();
	}
	
	
	public ShoppingCart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
