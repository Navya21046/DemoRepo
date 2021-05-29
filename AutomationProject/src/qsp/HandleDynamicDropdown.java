package qsp;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver(co);	
		 driver.manage().window().maximize();
		 driver.get("https://www.cleartrip.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 WebElement ddAddr = driver.findElement(By.id("FromTag"));
		 ddAddr.sendKeys("del");
		 Thread.sleep(6000);
		 
//		 ddAddr.sendKeys(Keys.DOWN);
//		 Thread.sleep(3000);
//		 ddAddr.sendKeys(Keys.DOWN);
//		 Thread.sleep(3000);
//		 ddAddr.sendKeys(Keys.ENTER);
		List<WebElement> allOptions =driver.findElements(By.xpath("//a[contains(@id,'ui-id')]"));
		// allOptions.get(allOptions.size()-1).click();
		 System.out.println(allOptions.size());
		 for(WebElement oneopt:allOptions)
		 {
			 System.out.println(oneopt.getText());
		 }
		 
		 

	}

}
