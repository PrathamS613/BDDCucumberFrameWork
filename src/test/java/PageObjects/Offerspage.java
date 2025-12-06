package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Offerspage {

	public WebDriver driver;
	WebDriverWait wait;

	By search = By.xpath("//input[@type='search']");
//    By productName = By.cssSelector("tr td:nth-child(1)");

	By productName = By.cssSelector("tr td:first-child");
	By noDataCell = By.xpath("//td[contains(text(),'No data')]");

	public Offerspage(WebDriver driverinstance) {
		this.driver = driverinstance;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void searchItem(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(search)).clear();
		driver.findElement(search).sendKeys(name);

		// Wait for table results to refresh
		wait.until(ExpectedConditions.presenceOfElementLocated(productName));
	}

	public String getProductName() {
		// If table shows "No data"
		if (!driver.findElements(noDataCell).isEmpty()) {
			return "No data";
		}

		return wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText();
	}

}
