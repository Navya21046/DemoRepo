package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserParallel {
	@Parameters("browser")
	@Test
	public void openBrowser(String browser)
	{
	       WebDriver driver;
	       if(browser.equals("chrome"))
	       {
	    	   System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
	            driver=new ChromeDriver();
	       }
	       else if(browser.equals("firefox"))
	       {
	    	   System.setProperty("webdriver.gecko.driver","./Drivers//geckodriver.exe");
	            driver=new FirefoxDriver();
	       }
	}

}
