package Amazon_Test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Filter_Page;

public class Amazon_TC06 extends _Launch_Quit{

	@Test
public void SearchingWithFilters() throws IOException, InterruptedException, AWTException
	
     {
	       Amazon_HomePage hp = new Amazon_HomePage(driver);
		   hp.SearchProduct();
		  
		   Filter_Page fp = new Filter_Page(driver);
		   fp.BrandCheckbox1();
		   fp.BrandCheckbox2();
		   fp.Price_Range(driver);
	       fp.Go();
	       
	
	       System.out.println("Test case ended");
	      
	       Reporter.log("TestCase6 is passed");
     }
}
