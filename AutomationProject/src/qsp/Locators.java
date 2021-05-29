package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/HTML/Locators.html");
		 Thread.sleep(2000);
		// WebElement ele=driver.findElement(By.tagName("a"));
		 WebElement ele=driver.findElement(By.tagName("a"));
		 System.out.println(ele);
		 ele.click();
//		 driver.findElement(By.id("i2")).click();
//		 driver.findElement(By.name("n2")).click();
//		 driver.findElement(By.className("c2")).click();
//		 driver.findElement(By.linkText("Googly")).click();
//		 driver.findElement(By.partialLinkText("Goog")).click();
		 

	}

}
