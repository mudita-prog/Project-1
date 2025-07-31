package Amazon_Source;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_HomePage {
	
	WebDriver driver;
	//step 1
	@FindBy(xpath = "//span[@id=\"nav-link-accountList-nav-line-1\"]")
	public
	//public
	WebElement Accounts_Lists; 
	
	@FindBy(xpath="//a[.='Start here.']")
	public
	WebElement StartHereButton;
	
	@FindBy(xpath="//a[@class=\"nav-action-signin-button\"]")
	public
	WebElement SelectSignINButton;
	
	@FindBy(xpath="//span[.=\"Your Account\"]")
	public
	WebElement YourAccount;
	
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement YourOrders;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement ProductSearch;

	@FindBy(xpath="//span[.=\"Sign Out\"]")
	WebElement Logout;
	
	@FindBy(xpath="(//div[@class=\"sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20\"][1]")
	WebElement Product;	
	
	@FindBy(xpath="//span[.=\"Sign Out\"]")
	WebElement SignOutButton;
	
	@FindBy(id="nav-cart")
	WebElement CartButton;
	
	
	//step 2

	
	public void HoverOverOnAccounts_Lists(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement Accounts_Lists = wait.until(ExpectedConditions.visibilityOfElementLocated(
	     By.xpath("//span[@id='nav-link-accountList-nav-line-1']")));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Accounts_Lists).perform();	
		
		 

	}
	
	public void StartHereButton()
	{
		StartHereButton.click();
	}
	
	public void SignInButton()
	{
		SelectSignINButton.click();
	}
	
	public void SearchProduct()
	{
		ProductSearch.sendKeys(("Shoe")+Keys.ENTER);	
	}
	
	public void LogOut()
	{
		Logout.click();
	}
	
	public void Your_Orders()
	{
		YourOrders.click();
	}
	
	public void Product_Selection()
	{
		Product.click();		
	}
	
	public void SignOutButton()
	{
		SignOutButton.click();
	}
	
	public void YourAccount() 
	{
		YourAccount.click();
	}
	
	public void Cart_Button()
	{
		CartButton.click();
	}
	
	    
	//step 3
	public Amazon_HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	}

	
