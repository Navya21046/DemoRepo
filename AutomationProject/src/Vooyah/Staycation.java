 package Vooyah;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Staycation {
	@Test
	public void staycation() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://web-int.stg.voyaah.com/#/");
	String hometitle = driver.getTitle();
	String exphmetitle="Voyaah";
	System.out.println(hometitle);
	if(hometitle.equalsIgnoreCase(exphmetitle))
	{
		System.out.println("Home page is displayed");
	}
	else {
		System.out.println("Home page is not displayed");
	}
	driver.findElement(By.xpath("//a[text()='Staycations']")).click();
//	boolean page = driver.findElement(By.xpath("//*[text()='Advance Filters']']")).isEnabled();
//	if(page==true) {
//		System.out.println("Staycations module open sucessfully");
//	}
//	else {
//		System.out.println("Staycations page not opened sucessfully");
//	}
	Reporter.log("Test case passed",true);
	
	}

}
//a[text()='Staycations']