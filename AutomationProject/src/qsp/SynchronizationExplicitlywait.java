package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationExplicitlywait {

	public static void main(String[] args) throws InterruptedException {
		//set the system property
				System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
				//open the browser
				 WebDriver driver=new ChromeDriver();
				 //enter the test URL
				 driver.get("https://demo.actitime.com/login.do");
				 driver.manage().window().maximize();
				 String logintitle=driver.getTitle();
				 if(logintitle.equals("actiTIME - Login"))
				 {
					 System.out.println("Login page is Displayed, Test step PASSED");
				 }
				 else {
					 System.out.println("Login page is not Displayed, Test step FAILED");
				 }
				 Thread.sleep(2000);
				 driver.findElement(By.id("username")).sendKeys("admin");
				 Thread.sleep(2000);
				 driver.findElement(By.name("pwd")).sendKeys("manager");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//div[text()='Login ']")).click();
				 //Thread.sleep(5000);
				 //How to wait Explicitly
				 WebDriverWait wait=new WebDriverWait(driver,20);
				 wait.until(ExpectedConditions.titleContains("Enter"));
				 String  hometitle = driver.getTitle();
				 
				 if(hometitle.equals("actiTIME - Enter Time-Track"))
				 {
					 System.out.println("Home page is Displayed, Test step PASSED");
				 }
				 else {
					 System.out.println("Home page is not Displayed, Test step FAILED");
				  
				 }
			

	}

}
