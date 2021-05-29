package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();;
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("laptops");
//		List<WebElement> alloptions = driver.findElements(By.xpath("//[contains(@id,'lrtEPN _17d0yO')]"));//div[@class='lrtEPN _17d0yO']
//		System.out.println(alloptions.size());
//		for(WebElement op:alloptions)
//		{
//			System.out.println(op.getText());
//		}
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.DOWN);
	    search.sendKeys(Keys.ENTER);
	//WebElement dd=driver.findElement(By.xpath("//div/span[contains(text(),'laptops')]"));
	   // Select sel=new Select(dd);
	    //List<WebElement> alloptions = sel.getOptions();
			//System.out.println("Total option:"+alloptions.size());
	  driver.findElement(By.xpath("//span[text()='RETRY']")).click();
	  
	    WebElement dd = driver.findElement(By.xpath("(//select[@class='_2YxCDZ'])[1]"));
	    dd.click();
	    Select sel=new Select(dd);
	    sel.selectByIndex(4);
	    Thread.sleep(3000);
	WebElement processor = driver.findElement(By.xpath("//div[text()='Core i3']/preceding-sibling::div[@class='_24_Dny']"));
	     processor.click();
	     Thread.sleep(3000);
	    
	WebElement brand = driver.findElement(By.xpath("//div[text()='Dell']/preceding-sibling::div[@class='_24_Dny']"));
	    brand.click();
	    Thread.sleep(3000);
	 
	    driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Operating System']")).click();
    WebElement os = driver.findElement(By.xpath("//div[text()='Windows 10']/preceding-sibling::div[@class='_24_Dny']"));
        os.click();
        Thread.sleep(3000);
      WebElement ram = driver.findElement(By.xpath("//li[@class='rgWa7D'][2]"));
      System.out.println("Ram size: "+ram.getText());
      
      WebElement price = driver.findElement(By.xpath("//div[@class='_25b18c']"));
      System.out.println("Price Details: "+price.getText());
	    driver.close(); 
	    
		
		

	}

}
//input[@class='_3704LK']
//(//select[@class='_2YxCDZ'])[1]
//		(//select[@class='_2YxCDZ'])[2]