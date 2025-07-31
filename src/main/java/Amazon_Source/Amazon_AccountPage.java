package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AccountPage {
	
	WebDriver driver;

	@FindBy(xpath="//div[@data-card-identifier=\"AddressesAnd1Click\"]")
	public
	WebElement ClickOnAddress;

	public void Your_Addresses()
	{
		ClickOnAddress.click();
	}
	
	public Amazon_AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
