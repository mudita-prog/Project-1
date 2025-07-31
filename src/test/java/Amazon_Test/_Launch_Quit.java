package Amazon_Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import Amazon_Source.Listeners_Logic;

@Listeners(Amazon_Source.Listeners_Logic.class)
public class _Launch_Quit extends Listeners_Logic {

    @BeforeMethod
    @Parameters("browser")
    public void Launch(@Optional("Edge") String nameofbrowser) {

        if (nameofbrowser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (nameofbrowser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + nameofbrowser);
        }

       
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");

        // Handle popup
        handleContinueShoppingPopup();
    }

    public void handleContinueShoppingPopup() {
        try {
            // Wait for "Continue Shopping" button to be present for max 5 seconds
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement continueButton = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[contains(text(), 'Continue shopping')]")));

            // Check if visible and clickable, then click
            if (continueButton.isDisplayed() && continueButton.isEnabled()) {
                continueButton.click();
                System.out.println("✅ Clicked 'Continue shopping' button.");
            }
        } catch (Exception e) {
            System.out.println("'Continue shopping' button not present or not clickable. Continuing normally.");
        }
    }

    @AfterMethod
    public void quit() throws InterruptedException {
       
            Thread.sleep(3000); // Optional wait to see result before quit
           
                driver.quit();
                System.out.println("🛑 Browser closed successfully.");
           
    }
}
