package Amazon_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Amazon_Source.Amazon_AccountPage;
import Amazon_Source.Amazon_DDT;
import Amazon_Source.Amazon_HomePage;
import Amazon_Source.Amazon_LoginPage;
import Amazon_Source.Edit_Profile_Page;


public class Amazon_TC04 extends _Launch_Quit {
	@Test
	public void Edit_Profile() throws IOException
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
		   
		   hp.HoverOverOnAccounts_Lists(driver);
		   Assert.assertTrue(hp.YourAccount.isEnabled(), "Your asscount is not displayed");
		   hp.YourAccount();
		   
		   Amazon_AccountPage ap= new Amazon_AccountPage(driver);
		   Assert.assertTrue(ap.ClickOnAddress.isEnabled(), "Your account is not displayed");
		   ap.Your_Addresses();
		   
		   Edit_Profile_Page ep = new Edit_Profile_Page(driver);
		   Assert.assertTrue(ep.EditButton.isEnabled(), "Edit button is not displayed");
		   ep.EditButton();
		   
		   Assert.assertTrue(ep.CountryDropdown.isEnabled(), "country dropdown is not working");
		   ep.CountryDropdown();
		   
		   Assert.assertTrue(ep.Edit_Name.isEnabled(), "editname is not working");
		   ep.EditName();
		   
		   Assert.assertTrue(ep.EditMobileNo.isEnabled(), "editmobile is not working");
		   ep.EditMobileNo();
		   
		   Assert.assertTrue(ep.PostalCode.isEnabled(), "postalcode is not working");
		   ep.Postal_Code();
		   
		   Assert.assertTrue(ep.FlatNo.isEnabled(), "flatno is not working");
		   ep.Flat_No();
		   
		   Assert.assertTrue(ep.area.isEnabled(), "area is not working");
		   ep.area_();
		   
		   Assert.assertTrue(ep.landmark.isEnabled(), "landmark is not working");
		   ep.landmark_();
		   
		   Assert.assertTrue(ep.city.isEnabled(), "city is not working");
		   ep.Entercity();
		   
		   Assert.assertTrue(ep.UpdateButton.isEnabled(), "update is not working");
		   ep.Update();
	
		   Reporter.log("TestCase4 is passed");
	}
	
	

}
