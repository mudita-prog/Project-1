package Amazon_Source;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Edit_Profile_Page extends Amazon_DDT {


	WebDriver driver; 
	
	@FindBy(xpath="(//a[@aria-label=\"Edit this address\"])[2]")
	public
	WebElement EditButton;
	
	@FindBy(xpath="//span[@id=\"address-ui-widgets-countryCode\"]")
	public
	WebElement CountryDropdown;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	public
	WebElement Edit_Name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	public
	WebElement EditMobileNo ;	
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	public
	WebElement PostalCode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	public
	WebElement FlatNo;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	public
	WebElement area;
	
	@FindBy(id="address-ui-widgets-landmark")
	public
	WebElement landmark;
	
	@FindBy(id="address-ui-widgets-enterAddressCity")
	public
	WebElement city;
	
	@FindBy(xpath="//a[.=\"India\"]")
	public
	WebElement SelectIndia;
	
	@FindBy(id="address-ui-widgets-form-submit-button")
	public
	WebElement UpdateButton;
	
	public void EditButton()
	{
		EditButton.click();
	}
	
	public void CountryDropdown()
	 {
	    CountryDropdown.click();
	    SelectIndia.click();  
	}
		
	
	public void EditName()
	{
		Edit_Name.click();
		Edit_Name.clear();
		Edit_Name.sendKeys(Name);
	}
	
	public void EditMobileNo()
	{
		EditMobileNo.click();
		EditMobileNo.clear();
		EditMobileNo.sendKeys(Mobile_number);
	}
	
	public void Postal_Code()
	{
		PostalCode.click();
		PostalCode.clear();
		PostalCode.sendKeys(Pincode);
	}
	
	public void Flat_No()
	{
		FlatNo.click();
		FlatNo.clear();
		FlatNo.sendKeys(Flat);
	}
	
	public void area_()
	{
		area.click();
		area.clear();
		area.sendKeys(Area);
	}
	
	public void landmark_()
	{
		landmark.click();
		landmark.clear();
		landmark.sendKeys(Landmark);
	}
	
	public void Entercity()
	{
		city.click();
		city.clear();
		city.sendKeys(City);
	}
	
	public void Update()
	{
		UpdateButton.click();
	}
	
	
	public Edit_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
