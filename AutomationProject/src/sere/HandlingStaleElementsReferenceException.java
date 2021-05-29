package sere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaleElementsReferenceException {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo.actitime.com/login.do");
     Thread.sleep(3000);
//     WebElement untb=driver.findElement(By.id("username"));
//     driver.navigate().refresh();
//     Thread.sleep(3000);
//     untb.sendKeys("admin");
     LoginPage lp=new LoginPage(driver);
     driver.navigate().refresh();
     //lp.getUntb().sendKeys("admin");
     //  (or)
     lp.setUntb("admin");
	}

} 
