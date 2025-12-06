package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage LandingPage;
	public Offerspage offerspage;
	public WebDriver driver;
	public Checkoutpage checkoutPage;

	public PageObjectManager(WebDriver driverinst)
	{
		 this.driver= driverinst;
	}

	public LandingPage getlandingPage()
	{
		LandingPage = new LandingPage(driver);
		return LandingPage;
	}

	public Offerspage  Offerspage()
	{
		offerspage = new Offerspage(driver);
		return offerspage;
	}

	public Checkoutpage getcheckoutPage()
	{
		checkoutPage = new Checkoutpage(driver);
		return checkoutPage;

	}
}
