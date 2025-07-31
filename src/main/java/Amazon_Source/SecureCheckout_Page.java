package Amazon_Source;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class SecureCheckout_Page extends Amazon_DDT {

	WebDriver driver;
	
	@FindBy(xpath="//a[@aria-label='Change delivery address']")
	WebElement ChangeAddress;
	
	@FindBy(xpath="//span[.='Other UPI Apps']")
	WebElement SelectUPI;
	
	@FindBy(xpath="//span[.='Credit or debit card']")
	WebElement SelectCard;
	
	@FindBy(xpath="(//a[.='Add a new credit or debit card'])[1]")
	WebElement CardPayment;
	

	@FindBy(xpath="(//input[@type='submit'])[4]")
	WebElement PaymentMethodSubmit;
	
	@FindBy(xpath="//*[@id=\"checkout-item-block-panel\"]/div[2]/div/div[2]/span/a")
	WebElement Review;
	
	@FindBy(xpath="//input[@placeholder=\"Enter UPI ID\"]")
	WebElement EnterUPI;
	
	@FindBy(xpath="(//input[@type='submit'])[3]")
	WebElement VerifyButton;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-close']")
	WebElement ClosePopup;
			
	@FindBy(xpath="(//span[.='EMI'])[4]")
	WebElement SelectEMI;
	
	@FindBy(xpath="(//span[.='Cash on Delivery/Pay on Delivery'])[3]")
	WebElement SelectCOD;
	
	@FindBy(name="ppw-claimCode")
	WebElement CouponCode;
	
	@FindBy(xpath="//input[@value='Apply']")
	WebElement ApplyButton;
	
	public void Apply_Button()
	{
		ApplyButton.click();
	}
	public void Change_Address()
	{
		ChangeAddress.click();
	}
	
	public void DeliverToAddress(WebDriver driver)
	{
		WebElement DeliverToAddress = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		DeliverToAddress.click();
	}
	
	public void scroll(WebDriver driver)
	{
		Point p1 = SelectUPI.getLocation();
		int y = p1.getY();
		System.out.println(y);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
	    js.executeScript("window.scrollBy(0,620 )"); 
	}
	
	public void Select_UPI()
	{
		SelectUPI.click();
		System.out.println("UPI Selected");
		
	}
	
	public void Select_EMI()
	{
		SelectEMI.click();
		System.out.println("EMI Selected");
	}
	
	public void Select_Card()
	{
		SelectCard.click();
		System.out.println("Card Selected");;
	}
	
	public void EnterCouponCode()
	{
		CouponCode.sendKeys("Amazon10");	
	}
	
	public void Select_COD()
	{
		SelectCOD.click();
		System.out.println("COD Selected");
	}
	
	public void VerifyButton()
	{
		VerifyButton.click();
	}
	
	public void Enter_UPI()
	{
		EnterUPI.sendKeys(("muditag2600-1@okicici")+Keys.ENTER);
	}
	
	public void PaymentMethodSubmitButton() 
	{
		PaymentMethodSubmit.click();
	}
	
	public void Card_Payment(WebDriver driver) throws InterruptedException
	{
		CardPayment.click();
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='ApxSecureIframe']"));
	    driver.switchTo().frame(iframe);
	    
	    WebElement Card_Number = driver.findElement(By.xpath("//input[@name='addCreditCardNumber']"));
	    Card_Number.click();
	    Card_Number.sendKeys(CardNumber);
	   
	    WebElement MonthDD = driver.findElement(By.name("ppw-expirationDate_month"));
	    Select selectMonth = new Select(MonthDD);
	    selectMonth.selectByValue("5"); // May
	    WebElement EnterMonth = driver.findElement(By.xpath("//a[.='05']"));
	    EnterMonth.sendKeys(Keys.ENTER);
	    
        WebElement ExpiryYear = driver.findElement(By.name("ppw-expirationDate_year"));
        Select SelectYear = new Select(ExpiryYear);
	    SelectYear.selectByValue("2030");
	    WebElement EnterYear = driver.findElement(By.xpath("//a[.='2030']"));
	    EnterYear.sendKeys(Keys.ENTER);
	  
	    WebElement Continue = driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent']"));
	    Continue.click();
	}
	
	public void CloseButton()
	{
		ClosePopup.click();
	}
	
	public void ReviewButton()
	{
		Review.click();
	}
	
	
	

	
public SecureCheckout_Page(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
}
