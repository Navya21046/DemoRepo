package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		//Upcasting Chromedriver class to WebDriver Interface
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("file:///E:/HTML/DisabledElement.html");
		 Thread.sleep(3000);
		 WebElement untb = driver.findElement(By.id("i1"));
		 if(untb.isEnabled())
		 {
			 System.out.println("Username textbox is Enabled");
			 untb.sendKeys("admin");
		 }
		 else {
			 System.out.println("Username textbox is not Enabled");
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i1').value='admin'");
		 }
		 Thread.sleep(3000);
		 
		 WebElement pwtb = driver.findElement(By.id("i2"));
		 if(pwtb.isEnabled())
		 {
			 System.out.println("Password textbox is Enabled");
			 pwtb.sendKeys("admin");
		 }
		 else {
			 System.out.println("password textbox is not Enabled");
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='manager'");
		 }
		 

	}

}
