package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;

	public GenericUtils(WebDriver driverinst)
	{
		this.driver = driverinst;
	}
	public void SwitchWindowToChild()
	{
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> l1 = s1.iterator();
		String parentWindow = l1.next();
		String childWindow = l1.next();
		driver.switchTo().window(childWindow);
	}
}
