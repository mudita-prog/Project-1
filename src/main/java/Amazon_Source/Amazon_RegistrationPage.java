package Amazon_Source;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_RegistrationPage extends Amazon_DDT{
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id=\"ap_email_login\"]")
	public
	//public
	WebElement Enter_Email;
	
	@FindBy(xpath="//input[@aria-labelledby='intention-submit-button-announce']")
	public
	//public
	WebElement ProceedButton;
	
	@FindBy(xpath="//span[@data-action='a-dropdown-button']")
	WebElement CountryCode;
	
	@FindBy(id="ap_phone_number")
	WebElement Mobile_Number;
	
	@FindBy(id="ap_customer_name")
	WebElement Name;
	
	@FindBy(xpath="//input[@autocomplete=\"new-password\"]")
	WebElement NewPassword;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	WebElement Verify;
	
	public void EnterEmail()
	{
		Enter_Email.sendKeys(("manikgoyal782@gmail.com")+Keys.ENTER);
	
	}
	
	public void Proceed()
	{
		ProceedButton.click();
	}
	
	public void SelectCountryCode()
	{
	  Select s1 = new Select(CountryCode);
	  s1.selectByVisibleText("+91");
	  WebElement Selection = driver.findElement(By.xpath("//span[.='+91']"));
	  Selection.click();
	}
	
	public void EnterMobileNumber()
	{
		Mobile_Number.click();
		Mobile_Number.sendKeys(MobileNumber);
	}
	
	public void EnterName()
	{
		Name.click();
		Name.sendKeys(FullName);
	}
	
	public void EnterNewPassword()
	{
		NewPassword.click();
		NewPassword.sendKeys(New_Password);
	}
	
	public void VerifyButton()
	{
		Verify.click();
	}
	

	public Amazon_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
