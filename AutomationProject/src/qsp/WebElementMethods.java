package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(3000);
//		 WebElement chkbox = driver.findElement(By.id("keepLoggedInLabel"));
//		 chkbox.click(); 
//		 if(chkbox.isDisplayed())
//		 {
//			 System.out.println("Checkbox is Displayed");
//			 if(chkbox.isEnabled())
//			 {
//				 System.out.println("Checkbox is Enabled");
//				 if(chkbox.isSelected())
//				 {
//					 System.out.println("It is already selected, don't touch");
//				 }
//				 else {
//					 System.out.println("It is not selected,click now");
//					 chkbox.click();
//				 }
//			 }
//				 else {
//					 System.out.println("Checkbox is not Enabled");
//				 }
//			 }
//			 else {
//				 System.out.println("Checkbox is not Displayed");
//			 }
		 
		 WebElement untb = driver.findElement(By.id("username"));
		 untb.sendKeys("admin");
		 WebElement pwtb = driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
		 pwtb.sendKeys("manager");
		 Thread.sleep(3000);
//		 untb.clear();
		 System.out.println("Tag:"+untb.getTagName());
		 System.out.println("Attribute:"+untb.getAttribute("class"));
		 
		 WebElement header = driver.findElement(By.id("headerContainer"));
		 System.out.println("Text:"+header.getTagName());
		 
		 System.out.println("Size:"+untb.getSize());
		 System.out.println("Width:"+untb.getRect().width);
		 System.out.println("Height:"+untb.getRect().height);
		 System.out.println("Location:"+untb.getLocation());
		 System.out.println("X axis:"+untb.getRect().x);
		 System.out.println("Y axis:"+untb.getRect().y);
		 System.out.println("Font-size:"+untb.getCssValue("font-size"));
		 }

	}


