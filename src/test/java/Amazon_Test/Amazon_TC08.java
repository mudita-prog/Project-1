package Amazon_Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;
import Amazon_Source.Filter_Page;

public class Amazon_TC08 extends _Launch_Quit {
	@Test
	public void Sorting() throws IOException, InterruptedException
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
		   Thread.sleep(6000);
			 
		   Filter_Page fp = new Filter_Page(driver);
		   fp.sorting_bestSellers(); 
		   Thread.sleep(6000);
		   
		   fp.sorting_reviews();
		   Thread.sleep(6000);
		   
		   fp.sorting_price();
		 
		   Reporter.log("TestCase8 is passed");
	}
	

}
