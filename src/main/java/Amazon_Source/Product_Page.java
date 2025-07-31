package Amazon_Source;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Product_Page{
	
	
	WebDriver driver;
	@FindBy(xpath="//div[@class='sg-col-4-of-4 sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-8 sg-col-4-of-20'][1]")
	WebElement SelectProduct;
	
	@FindBy(xpath="//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")
	WebElement Price;
	
	@FindBy(xpath="(//span[@id=\"acrCustomerReviewText\"])[1]")
	WebElement ClickOnSeeReviews;
	
	@FindBy(xpath="//h3[.='Customers say']")
    WebElement VerifyReviews;	
	
	@FindBy(xpath="//h2[.=' Product description  ']")
	WebElement ProductDescription;
	
	@FindBy(id="add-to-cart-button")
	WebElement AddToCartButton;
	
	@FindBy(id="buy-now-button")
	WebElement BuyNowButton;
	
	public void Select_Product()
	{
		SelectProduct.click();
		
	}
	
	public void Product_Price()
	{
		Assert.assertTrue(Price.isDisplayed(), "Price is not showing");
		System.out.println("Price is showing");
	}
	
	public void SeeTheReviews()
	{
		ClickOnSeeReviews.click();
		Assert.assertTrue(VerifyReviews.isDisplayed(), "Reviews are not showing");
		System.out.println("Reviews are showing");
	}

	public void Product_Description(WebDriver driver)
	{
		Point p1 = ProductDescription.getLocation();
		int y = p1.getY();
		System.out.println(y);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
	    js.executeScript("window.scrollBy(0,3924 )"); 
	    
	    Assert.assertTrue(ProductDescription.isDisplayed(),"Product Description is not showing");
	    System.out.println("Product Description is showing");
	}
	
	public void Add_To_Cart(WebDriver driver)
	{
		AddToCartButton.click();
		WebElement e1 = driver.findElement(By.xpath("(//span[.='1'])[1]"));
		Assert.assertTrue(e1.isDisplayed(), "Item is not added to cart");
		System.out.println("Item is added to the cart");
	}
	
	public void BuyNow()
	{
		BuyNowButton.click();
	}
	
	
	public Product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
