package Amazon_Source;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners_Logic implements ITestListener{
	
	public static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	ITestListener.super.onTestStart(result);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test Case Passed");
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\hp\\Desktop\\Amazon_Project_Screenshots\\Passed" + Math.random()+".jpg");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test Case Failed");
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\hp\\Desktop\\Amazon_Project_Screenshots\\Failed"+Math.random()+".jpg");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test Case Skipped");
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\hp\\Desktop\\Amazon_Project_Screenshots\\Skipped"+Math.random()+".jpg");
		try {
			FileHandler.copy(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
