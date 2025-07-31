package Amazon_Test;

import java.awt.AWTException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Product_Page;

public class Amazon_TC07 extends _Launch_Quit{
	
	@Test
	public void Product_Details() throws InterruptedException, AWTException
	{
		Amazon_HomePage hp = new Amazon_HomePage(driver);
		   hp.SearchProduct();
	       Product_Page pg = new Product_Page(driver);
	       pg.Select_Product();
	       pg.Product_Price();
	       pg.Product_Description(driver);
	       pg.SeeTheReviews();
	    
	       Reporter.log("TestCase7 is passed");
	}

}
