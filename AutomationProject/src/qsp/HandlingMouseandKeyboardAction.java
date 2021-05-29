package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseandKeyboardAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
//		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
//		 WebDriver driver=new ChromeDriver();	
//		 driver.manage().window().maximize();
//		 driver.get("https://www.flipkart.com/");
//		 Thread.sleep(2000);
//   // Mouse hover Actions
//		 driver.findElement(By.xpath("//button[text()='✕']")).click();
//         WebElement elec=driver.findElement(By.xpath("//span[text()='Electronics']"));
//         Thread.sleep(3000);
//         Actions a=new Actions(driver);
//         a.moveToElement(elec).perform();
//         Thread.sleep(3000);
//         driver.findElement(By.xpath("//a[text()='Memory Cards']")).click();
     //  WebElement mc = driver.findElement(By.xpath("//div[@class='gl5Kwg']"));
        
     //  System.out.println(mc.getLocation());
         
         
		
		//Performing Double actions
//         System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
//		 WebDriver driver=new ChromeDriver();	
//		 driver.manage().window().maximize();
//		 driver.get("https://demo.actitime.com/login.do");
//		 Thread.sleep(3000);
//		WebElement navya = driver.findElement(By.xpath("//input[@name='username']"));
//		 navya.sendKeys("admin");
//		 Thread.sleep(3000);
//		 Actions a=new Actions(driver);
//		 a.doubleClick(navya).perform();
		
		
		//Performing Drag and Drop Actions
//		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
//		 WebDriver driver=new ChromeDriver();	
//		 driver.manage().window().maximize();
//		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		 Thread.sleep(3000);
//		WebElement navya = driver.findElement(By.id("box3"));
//		WebElement vijay = driver.findElement(By.id("box103"));
//		 Thread.sleep(3000);
//		 Actions a=new Actions(driver);
//		 a.dragAndDrop(navya,vijay).perform();
		 
		 //Performing Right Click
		 System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("file:///E:/HTML/LoginTest.html");
		 Thread.sleep(3000);
		WebElement navya = driver.findElement(By.xpath("//a[text()='Google']"));
		
		 
		 Actions a=new Actions(driver);
		 a.contextClick(navya).perform();
		 Thread.sleep(3000);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);  
	

       
         
	}

}
