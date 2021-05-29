package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void runChrome()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
            new ChromeDriver();
	}

}
