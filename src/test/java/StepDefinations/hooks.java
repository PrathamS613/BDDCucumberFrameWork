package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextsetup;

public class hooks {

	public TestContextsetup testContextsetup;

	public hooks(TestContextsetup testContextSetupPara)
	{
		this.testContextsetup = testContextSetupPara;
	}

	@After
	public void AfterScenerio() throws IOException
	{
		testContextsetup.testBase.WebDriverManager().quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testContextsetup.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
		File sourcefile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 byte[] fileContent= FileUtils.readFileToByteArray(sourcefile);
		scenario.attach(fileContent, "image/png", "errorScreenshot");
		}

	}
}
