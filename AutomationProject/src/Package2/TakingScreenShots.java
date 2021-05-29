package Package2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakingScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException{
		 System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
		 Thread.sleep(3000);
		 
		 //Through TypeCasting
//		  TakesScreenshot ts = (TakesScreenshot)driver;
//		  File ss=ts.getScreenshotAs(OutputType.FILE);
//		  File f=new File("C:\\Users\\Navyavijay\\Downloads\\ScreenShots\\AmazonImg.png");
//		  Files.copy(ss,f);
		 
		 //Through Downloading
		 RemoteWebDriver rwd = (RemoteWebDriver)driver;
		 File src = rwd.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\Navyavijay\\Downloads\\ScreenShots\\AmazonImg.jpg");
		 Files.copy(src,dest);
		  
		  //Through EventFiringWebDriver class
//		  EventFiringWebDriver ef = new EventFiringWebDriver(driver);
//		  File src=ef.getScreenshotAs(OutputType.FILE);
//		  File dest=new File("C:\\Users\\Navyavijay\\Downloads\\ScreenShots\\AmazonImg.png");
//		  Files.copy(src,dest);
		 
		 //Taking Screenshot of a Particular Element
//		 Thread.sleep(3000);
//		 WebElement amzon = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//		 File src = amzon.getScreenshotAs(OutputType.FILE);
//		 File dest = new File("C:\\\\Users\\\\Navyavijay\\\\Downloads\\\\ScreenShots\\\\AmazonImg.jpg");
//		 Files.copy(src,dest);
	}

}
