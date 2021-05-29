package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	@Test
	public void runChrome1()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
            new ChromeDriver();
	}
	@Test
	public void runChrome2()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
            new ChromeDriver();
	}
	@Test
	public void runChrome3()
	{
	System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
            new ChromeDriver();
	}

}
