package Amazon_Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;
import Amazon_Source.Orders_Page;

public class Amazon_TC14 extends _Launch_Quit {
	
	
@Test
	
	public void Rating() throws InterruptedException, IOException
	
	{
	Amazon_HomePage hp = new Amazon_HomePage(driver);
	
    hp.HoverOverOnAccounts_Lists(driver);
    hp.SignInButton();
    
    Amazon_DDT ddt = new Amazon_DDT();
    ddt.AmazonLoginData();  
    
   Amazon_LoginPage lp = new Amazon_LoginPage(driver);
   lp.valid_un();
   lp.Continue_Button();
   lp.valid_pw();
   lp.submit_buton();
   
   Thread.sleep(500);;
  
   hp.HoverOverOnAccounts_Lists(driver);
   hp.Your_Orders();
   
   Orders_Page op = new Orders_Page(driver);
   op.Write_Review();
   op.Rating();
   op.Submit();
  
   Reporter.log("TestCase14 is passed");
	}
}



