package Amazon_Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;
import Amazon_Source.Product_Page;
import Amazon_Source.ShoppingCart_Page;

public class Amazon_TC10 extends _Launch_Quit{

	@Test
	public void UpdateQty() throws IOException, InterruptedException
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
	   
	   Product_Page pp = new Product_Page(driver);
	   pp.Select_Product();
	   pp.Add_To_Cart(driver);
			   
	   hp.Cart_Button();
	   Thread.sleep(3000);
	   
	   ShoppingCart_Page sc = new ShoppingCart_Page(driver);
	   sc.Add_Button();
	  
	   
	   Thread.sleep(3000);
	   sc.Delete_Button();   
	   
	   Reporter.log("TestCase10 is passed");
	}
}
