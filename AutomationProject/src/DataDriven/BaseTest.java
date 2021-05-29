package DataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoconsts{
	public static WebDriver driver;
	public void openBrowser()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
    }
	public void closeBrowser()
	{
		driver.close();
	}

}
