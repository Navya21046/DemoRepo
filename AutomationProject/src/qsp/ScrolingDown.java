package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrolingDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Upcasting Chromedriver class to WebDriver Interface
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/downloads/");
		 Thread.sleep(3000);
		 
		 
//		 
    	WebElement ele=driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		Point loc=ele.getLocation();
		 System.out.println(ele.getRect().x);
		 System.out.println(ele.getRect().y);
		System.out.println(loc);
	
		//Through TypeCasting
		 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy"+loc);
//		
//		//Through DownCasting
		 
//		RemoteWebDriver rwd = (RemoteWebDriver)driver;
//		rwd.executeScript("window.scrollBy"+loc);
		

	}

}
