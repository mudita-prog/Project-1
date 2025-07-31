package Amazon_Source;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Filter_Page {
	
	WebDriver driver;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[7]")
	WebElement Checkbox_1;

	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[5]")
	WebElement Checkbox_2;
	
	@FindBy(id="p_36/range-slider_slider-item_upper-bound-slider")
	WebElement PriceRange;
	
	@FindBy(xpath="//input[@aria-label='Go - Submit price range']")
	WebElement Go_Button;
	
	@FindBy(id="s-result-sort-select") 
	WebElement sort;
	
	public void BrandCheckbox1()
	{
		Checkbox_1.click();
	}
	
	public void BrandCheckbox2()
	{
		Checkbox_2.click();
	}
	
	public void Price_Range(WebDriver driver) throws InterruptedException, AWTException
	
	{
		Actions Ac = new Actions(driver);
		Ac.doubleClick(PriceRange).perform();
				
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		for(int i=0;i<=100;i++)
		{
			Thread.sleep(100);
			r1.keyPress(KeyEvent.VK_LEFT);
		}
	}
	
	public void Go() throws InterruptedException
	{
		Thread.sleep(2000);
		Go_Button.click();
	}
	
	  public void sorting_price() 
		{
			Select s1 = new Select(sort);
			s1.selectByIndex(1);
			WebElement e1 = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small a-text-right\"]"));
			e1.click();
	}
	  
	  public void sorting_reviews() 
		{
			Select s1 = new Select(sort);
			s1.selectByVisibleText("Avg. Customer Review");
			WebElement e1 = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small a-text-right\"]"));
			e1.click();
	}
		
	  public void sorting_bestSellers() 
		{
			Select s1 = new Select(sort);
			s1.selectByVisibleText("Best Sellers");
			WebElement e1 = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small a-text-right\"]"));
			e1.click();
	} 

	public Filter_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	}

