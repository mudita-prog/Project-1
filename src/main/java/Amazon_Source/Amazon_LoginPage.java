package Amazon_Source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_LoginPage extends Amazon_DDT {

	WebDriver driver;
	
	@FindBy (xpath = "//input[@name='email']")
	public
	WebElement Username_field;
	
	@FindBy (xpath="//input[@class='a-button-input']")
	
	WebElement Continue_Button;
	
	@FindBy (xpath="//input[@id='ap_password']")
	public
	WebElement PasswordField;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	WebElement Submit;
	
	public void valid_username()
	{
		Username_field.click();
		Username_field.sendKeys(ValidUsername);
	}
	
	public void valid_un()
	{
		Username_field.click();
		Username_field.sendKeys(ValidUn);
	}
	
	public void Continue_Button()
	{
		Continue_Button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(PasswordField));
	}
	
	
	public void Invalid_username()
	{
		Username_field.click();
		Username_field.sendKeys(InvalidUserName);
	}
	
	public void valid_password()
	{
		PasswordField.click();
		PasswordField.sendKeys(ValidPassword);
	}
	
	public void valid_pw()
	{
		PasswordField.click();
		PasswordField.sendKeys(ValidPw);
	}
	public void Invalid_password()
	{
		PasswordField.click();
		PasswordField.sendKeys(InvalidPassword);
	}
	
	public void submit_buton()
	{
		Submit.click();
	}
	
	public Amazon_LoginPage(WebDriver driver) 
	{this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
