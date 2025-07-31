package Amazon_Test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_RegistrationPage;

public class Amazon_TC01 extends _Launch_Quit
{
	
	@Test
	public void login_to_amazon() throws IOException {
	    System.out.println("🟢 Starting Amazon login test");

	    Amazon_HomePage hp = new Amazon_HomePage(driver);
	    hp.HoverOverOnAccounts_Lists(driver);
	   
	    Assert.assertTrue(hp.Accounts_Lists.isDisplayed(), "'Accounts & Lists' is not visible after hover");
	    System.out.println("✅ Hover worked — 'Accounts & Lists' is visible");
	   
	    Assert.assertTrue(hp.StartHereButton.isDisplayed(), "Start here button is not visible");
		Assert.assertTrue(hp.StartHereButton.isEnabled(), "Start here button is not clickable");
		System.out.println("Account_List HoverOver is visible and clickable");
		hp.StartHereButton(); 
		  
	    Amazon_DDT ddt = new Amazon_DDT();
	    ddt.AmazonLoginData();

	    Amazon_RegistrationPage rp = new Amazon_RegistrationPage(driver);
	    
		Assert.assertTrue(rp.Enter_Email.isDisplayed(), "Email field is not visible");
		Assert.assertTrue(rp.Enter_Email.isEnabled(), "Email field is not enabled");
		System.out.println("Email field HoverOver is visible and clickable");
		
		rp.EnterEmail();
		 
	/*	Assert.assertTrue(rp.ProceedButton.isDisplayed(), "PROCEED BUTTON is not visible");
		Assert.assertTrue(rp.ProceedButton.isEnabled(), "Proceed button is not enabled");
		System.out.println("Proceed button is visible and clickable");

		Assert.assertEquals(driver.getTitle(), "Amazon Registration", "Registration Page is showing");
		*/
	    rp.Proceed();
	    rp.EnterMobileNumber();
	    rp.EnterName();
	    rp.EnterNewPassword();
	    rp.VerifyButton();
	   
	 
		driver.close();
		
		Reporter.log("TestCase1 is passed");
	}
}
