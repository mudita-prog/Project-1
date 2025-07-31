package Amazon_Test;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;
public class Amazon_TC05 extends _Launch_Quit{
@Test	
public void SearchProduct() throws IOException
	
     {
	        Amazon_HomePage hp = new Amazon_HomePage(driver);
		    hp.HoverOverOnAccounts_Lists(driver);
		    hp.SignInButton();
		    
		    Amazon_DDT ddt = new Amazon_DDT();
		    ddt.AmazonLoginData();  
		    
		   Amazon_LoginPage lp = new Amazon_LoginPage(driver);
		   lp.valid_username();
		   lp.Continue_Button();
		   lp.valid_password();
		   lp.submit_buton();
		   
		   hp.SearchProduct();
		   
		   Reporter.log("TestCase5 is passed");
     }
     
		  
	
}
