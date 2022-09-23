package jenkins_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriverutility {
	
	private WebDriver driver;
	
	public WebDriver openBrowser(String browser) 
	{
		
		switch (browser) {
		case "firefox":WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
			break;
		case "chrome":WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		break;
		default:System.out.println("Please Enter Valid Browser Key");
			break;
		}
		return driver;
	}
	
	/**
	 * This method is to maximize the browser
	 * @param driver
	 */
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is use to wait till page gets load.
	 * @param driver
	 * @param time
	 */
	public void pageWaitTillLoad(WebDriver driver, long time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	/**
	 * this method is used to navigate to the application by passing url
	 * @param driver
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	/**
	 * This  method is used to close the application.
	 * @param driver
	 */
	public void closeTheApplication(WebDriver driver)
	{
		driver.quit();
	}
	/**
	 * This method is used to launch the browser, maximize, wait till the page gets load, then open application with the help of url.
	 * @param browser
	 * @param time
	 * @param url
	 * @return
	 */
	public WebDriver openBrowserWithApplication(String browser,long time,String url)
	{
		driver = openBrowser(browser);
		maximizeBrowser(driver);
		pageWaitTillLoad(driver,time);
		navigateToApplication(driver,url);
		return driver;
	}

}
