package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com");
		 //To maximise the browser window
		
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 //enter the url
		
		 driver.navigate().to("https://accounts.google.com/");
		 Thread.sleep(3000);
		 //navigate to previous page
		
		 driver.navigate().back();
		 Thread.sleep(3000);
		 //navigate to next page
		
		 driver.navigate().forward();
		 //method chaining
		 //Return type of current method should be same as parent of next method
		 //To change the size of the browser window
		
		 Dimension d=new Dimension(600,200);
		 driver.manage().window().setSize(d);
		 Thread.sleep(3000);
		 //To change the position of the browser
		
		 Point p=new Point(500,600);
		 driver.manage().window().setPosition(p);
		 //to delete all the cookies stored by the browser window
		 driver.manage().deleteAllCookies();

	}

}
