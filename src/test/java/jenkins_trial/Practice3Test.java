package jenkins_trial;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import jenkins_practice.Webdriverutility;

public class Practice3Test {

	@Test
	public void main3()
	{
		String browser = System.getProperty("ky");
		String url = System.getProperty("ul");
		System.out.println(browser);
		System.out.println(url);
		WebDriver driver = new Webdriverutility().openBrowserWithApplication(browser, 15, url);
	}
}
