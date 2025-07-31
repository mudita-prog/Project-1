package Amazon_Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import Amazon_Source.Listeners_Logic;

@Listeners(Amazon_Source.Listeners_Logic.class)
public class _Launch_Quit extends Listeners_Logic{
 
	
	@BeforeMethod
/*	@Parameters("browser")
	public void Launch(String nameofbrowser)
	{
		 {
				if (nameofbrowser.equals("Chrome"))
				{
			    driver =  new ChromeDriver();
				}
				if (nameofbrowser.equals("Edge"))
				{
		        driver =  new EdgeDriver();
				}
		  		driver.manage().window().maximize();
				driver.get("http://amazon.in");
		 }
	}*/
	
	public void Launch()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();		
}
}