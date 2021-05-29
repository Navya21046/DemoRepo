package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 {
	@Test
	public void runChrome()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
            new ChromeDriver();
	}

}
