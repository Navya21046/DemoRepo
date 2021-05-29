package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
	@Test
	public void verifyTitle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Programs\\Selenium\\KCSA4\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://demo.actitime.com/login.do");
		//Assert(Hard Assert)
		String loginTitle=driver.getTitle();
//		Assert.assertEquals(loginTitle, "actiTIME - Login");
		//softAssert(verify)
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(loginTitle, "actiTIME - Logi");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		sa.assertAll();
		
	}

}
