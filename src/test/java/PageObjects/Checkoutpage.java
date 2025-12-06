package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Checkoutpage {

    public WebDriver driver;
    WebDriverWait wait;

    public Checkoutpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By cartbag = By.cssSelector("[alt='Cart']");
    By checkoutbutton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By promobutton = By.cssSelector(".promoBtn");
    By placeorder = By.xpath("//button[contains(text(),'Place Order')]");

    public void checkoutItems() {
        wait.until(ExpectedConditions.elementToBeClickable(cartbag)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutbutton)).click();
    }

    public Boolean verifyPromoButton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(promobutton)).isDisplayed();
    }

    public Boolean verifyPlaceOrder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(placeorder)).isDisplayed();
    }
}
