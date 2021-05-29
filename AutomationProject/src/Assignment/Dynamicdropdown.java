package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		WebElement serbtn = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		serbtn.sendKeys("Qspiders");
		 List<WebElement> seares = driver.findElements(By.xpath("//li[contains(@class,'sbct')]"));
		 
		int aloptions = driver.findElements(By.xpath("//li[contains(@class,'sbct')]")).size();
		System.out.println("No.of options found:"+aloptions);
		for(WebElement text:seares)
		{
			System.out.println(text.getText());
			}
//		for(WebElement print:seares) {
//			if(print.equals("Qspiders Banglore")) {
//				print.click();
//			}
//				else {
//					System.out.println("No such option found");
//				}
			
//			}
		       //driver.close();
		}
		
	
	}
		

	


