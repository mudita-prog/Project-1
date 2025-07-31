package Amazon_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Product_Page;


public class Amazon_TC15 extends _Launch_Quit {
@Test
	
	public void ReachTillCartWithoutLogin()
	{
	Amazon_HomePage hp = new Amazon_HomePage(driver);
	hp.SearchProduct();
	
	 
	   Product_Page pp = new Product_Page(driver);
	   pp.Select_Product();
	   pp.Add_To_Cart(driver);
	   hp.Cart_Button();
	   
	   Reporter.log("TestCase15 is passed");
	   
	 
}
}