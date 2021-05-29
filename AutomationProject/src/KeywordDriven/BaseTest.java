package KeywordDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoconsts{
	public static WebDriver driver;
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browser=flib.getPropertyValue(PROP_PATH,"Browser");
		if(browser.equals("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();	
		}
		
		String appurl=flib.getPropertyValue(PROP_PATH, "url");
		driver.get(appurl);
		driver.manage().window().maximize();
		
    }
	public void closeBrowser()
	{
		driver.quit();
	}

}
