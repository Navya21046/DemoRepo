package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();		 
		 driver.get("file:///E:/HTML/Single-selectDD.html");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 WebElement ddAddr=driver.findElement(By.id("Paradise"));
		 Select sel=new Select(ddAddr);//Address of DropDown
		 
		// sel.selectByVisibleText("Noodles");
		 //sel.selectByValue("h");
		 sel.selectByIndex(5);
		 ddAddr.click();

	}

}
