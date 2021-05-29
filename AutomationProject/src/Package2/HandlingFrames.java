package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("file:///E:/HTML/FrameDefaultPage.html");
		 Thread.sleep(3000);
		 //index-->index starts from 0
		//driver.switchTo().frame(0);
		
		//String arg --->id or name of the frame
		//driver.switchTo().frame("frid");//id
		
		//driver.switchTo().frame("frnm");//name
		
		//if other Attribute Values are given
		//driver.switchTo().frame("frd");//class name so we will get NosuchFrameException
		
		WebElement frAddr = driver.findElement(By.className("frd"));
		driver.switchTo().frame(frAddr);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("pwd")).sendKeys("manager");
		//Switching from a frame to its immediate parent frame
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("un")).sendKeys("admin");
		

	}

}
