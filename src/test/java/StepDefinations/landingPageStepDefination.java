package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.TestContextsetup;

public class landingPageStepDefination {
	public WebDriver driver;
	public String offerPageProductName;
	public TestContextsetup testContextsetup;
	public LandingPage landingPage;


	// constructor for linking Cucumber dependency injection
	public landingPageStepDefination(TestContextsetup testContextsetup) {
		this.testContextsetup = testContextsetup;
		this.landingPage = testContextsetup.pageObjectManager.getlandingPage();
	}

	@Given("user is on GreenCart landing Page")
	public void user_is_on_green_cart_landing_page() {
//		WebDriverManager.chromedriver().setup();
//		testContextsetup.driver = new ChromeDriver();
//		testContextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));

	}

	@When("^user Searched with shortname (.+) and  extracted actual name of the product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_the_product(String shortname)
			throws InterruptedException {
		landingPage.searchItem(shortname);
		Thread.sleep(5000);
		testContextsetup.landingPageProductname = landingPage.getProductName().split("-")[0].trim();
		System.out.println(testContextsetup.landingPageProductname + " is extracted from Home page ");
	}

	@When("Added {string} items to the selected product to cart")
	public void added_items_to_the_selected_product_to_cart(String quantity) {
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}

}
