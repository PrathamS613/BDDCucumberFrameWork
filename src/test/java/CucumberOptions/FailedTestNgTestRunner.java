package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="@C:/Users/prath/SeleniumAutomation/Automation Practicals/BDDCucumberFrameWork/target/failed_scenarios.txt",glue="StepDefinations",monochrome=true,plugin = {"html:target/cucumber.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestNgTestRunner extends AbstractTestNGCucumberTests { 

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
