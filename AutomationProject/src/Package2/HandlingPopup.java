package Package2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingPopup {

	public static void main(String[] args) throws InterruptedException {
		     //Handling Alert Popup
		
//		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
//		 WebDriver driver=new ChromeDriver();	
//		 driver.manage().window().maximize();
//		 driver.get("file:///E:/HTML/AlertPopup.html");
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//button[text()='Login']")).click();;
//		 Thread.sleep(3000);
//		Alert a1 = driver.switchTo().alert();
//		System.out.println(a1.getText());
//		//a1.accept();
//		a1.dismiss();
		
		
		//Handling Confirmation Popup
		
//		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
//		 WebDriver driver=new ChromeDriver();	
//		 driver.manage().window().maximize();
//		 driver.get("file:///E:/HTML/Confirmation%20Popup.html");
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//button[text()='I Love Jesus']")).click();;
//		 Thread.sleep(3000);
//		Alert a1 = driver.switchTo().alert();
//		System.out.println(a1.getText());
//		//a1.accept();
//		a1.dismiss();
		
		
		//Handling Hidden Divison Popup
		//Handling Browser Notification Popup
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("start-maximized");
		//openChrome Browser with the Settings
		 WebDriver driver=new ChromeDriver(co);	
//		 driver.manage().window().maximize();
		 driver.get("https://www.cleartrip.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.id("DepartDate")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//td[@data-month='10']//a[text()='20']")).click();;
		

	}

}
