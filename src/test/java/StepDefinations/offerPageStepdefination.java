package StepDefinations;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.Offerspage;
import PageObjects.PageObjectManager;
import io.cucumber.java.en.Then;
import utils.TestContextsetup;

public class offerPageStepdefination {
	public String offerPageproductName;
	public TestContextsetup TestContextsetup;
	PageObjectManager pageObjectManager;

	// constructor for linking Cucumber dependeny injection
	public offerPageStepdefination(TestContextsetup testContextsetup) {
		this.TestContextsetup = testContextsetup;
	}

	@Then("^user Searched for (.+)  same short name in offers page$")
	public void user_searched_for_same_short_name_in_offers_page(String shortname) throws InterruptedException {
	    
	    switchToOffersPage();
	    Offerspage offerspage = TestContextsetup.pageObjectManager.Offerspage();

	    offerspage.searchItem(shortname);

	    // Get product (handles both valid product OR "No data")
	    offerPageproductName = offerspage.getProductName();

	    TestContextsetup.offerPageProductName = offerPageproductName;
	}


	public void switchToOffersPage() {
	//	pageObjectManager = new PageObjectManager(TestContextsetup.driver);
		LandingPage LandingPage = TestContextsetup.pageObjectManager.getlandingPage();
		LandingPage.selectTopDealsPage();
		TestContextsetup.genericUtils.SwitchWindowToChild();
	}

	@Then("validate product name in offers page matched with landing page")
	public void validate_product_name_in_offers_page_matched_with_landing_page() {
		Assert.assertEquals(TestContextsetup.landingPageProductname, TestContextsetup.offerPageProductName);
	}

}
