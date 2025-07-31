package Amazon_Test;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;

public class Amazon_TC02  extends _Launch_Quit {
	
	@Test	
		
	public void Verify_ValidCreds() throws IOException
	{
	        Amazon_HomePage hp = new Amazon_HomePage(driver);
		    hp.HoverOverOnAccounts_Lists(driver);
		    hp.SignInButton();
		    
		    Amazon_DDT ddt = new Amazon_DDT();
		    ddt.AmazonLoginData();  
		    
		    
			Amazon_LoginPage lp = new Amazon_LoginPage(driver);
			
		//	Assert.assertTrue(lp.Username_field.isEnabled(), "UsernameField is not enabled");
			lp.valid_username();
		    
		//    Assert.assertTrue(lp.Continue_Button.isEnabled(), "continue button is noy enabled");
		    lp.Continue_Button();
		    
		    
		    
		//    Assert.assertTrue(lp.PasswordField.isEnabled(), "password button is noy enabled");
		    lp.valid_password();
		    lp.submit_buton();
		    Reporter.log("TestCase2 is passed");
		
	}
	}
