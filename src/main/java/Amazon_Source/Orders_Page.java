package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"a-autoid-7-announce\"]")
	WebElement WriteReview;
	
	@FindBy(xpath="(//span[@class='in-context-ryp__form-field--starRating-single'])[5]")
	WebElement Fivestar;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[2]")
	WebElement SubmitButton;
	
	
	public void Write_Review()
	{
		WriteReview.click();
	}

	public void Submit()
	{
		SubmitButton.click();
	}
	
	public void Rating()
	{
		Fivestar.click();
	}
	public Orders_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
