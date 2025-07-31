package Amazon_Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;

public class Amazon_TC03 extends _Launch_Quit{
	
	@Test
	public void Testing_InvalidCreds() throws IOException, InterruptedException
	{
    Amazon_HomePage hp = new Amazon_HomePage(driver);
    hp.HoverOverOnAccounts_Lists(driver);
    hp.SignInButton();
    
    Amazon_DDT ddt = new Amazon_DDT();
    ddt.AmazonLoginData();
    Amazon_LoginPage lp = new Amazon_LoginPage(driver);
    lp.Invalid_username();
    lp.Continue_Button();
    lp.Invalid_password();
    lp.submit_buton();
 
   Thread.sleep(6000);
   
   Reporter.log("TestCase3 is passed");
   
	}
}
