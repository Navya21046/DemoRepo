package Package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindowPopups {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.gecko.driver","./Drivers//geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();	
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/downloads/");
		 Thread.sleep(3000);
		 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_P);
		 
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_P);
		 Thread.sleep(3000);
		 //Executing the autoIT Script
		 //Integrating AutoIT script with our selenium script
		 Runtime.getRuntime().exec("file:///E:/Selenium/KCSA4/Print.au3");
		
		}

}
