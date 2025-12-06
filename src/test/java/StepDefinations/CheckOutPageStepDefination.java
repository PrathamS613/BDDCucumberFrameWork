package StepDefinations;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.Checkoutpage;
import io.cucumber.java.en.Then;
import utils.TestContextsetup;

public class CheckOutPageStepDefination {
	public WebDriver driver;
	public String offerPageProductName ;
	public TestContextsetup testContextsetup;
	public Checkoutpage checkoutpage;

    // constructor for linking Cucumber dependency injection
	public CheckOutPageStepDefination(TestContextsetup testContextsetup)
	{
		this.testContextsetup= testContextsetup;
		this.checkoutpage = testContextsetup.pageObjectManager.getcheckoutPage();
	}


	@Then("verify user has ability to enter promo code and place order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_order() {

		Assert.assertTrue(checkoutpage.verifyPromoButton());
		Assert.assertTrue(checkoutpage.verifyPlaceOrder());
	}

	@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_tom_items_in_checkout_page(String name) throws InterruptedException {
		checkoutpage.checkoutItems();
		//Assertion to extract name from screen and compare with name string
	}



}
