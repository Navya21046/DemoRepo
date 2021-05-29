package assignment2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazonScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		String hometitle = driver.getTitle();
		System.out.println(hometitle);
	//	Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
//		TakesScreenshot ts=(TakesScreenshot)driver;
//        File ss=ts.getScreenshotAs(OutputType.FILE);
//	    File f=new File("E:\\Selenium\\KCSA4\\AutomationProject\\Screenshots\\AmazonImg.png");
//		Files.copy(ss,f);
		driver.findElement(By.xpath("//a[@class='nav-a  ']")).click();
		Thread.sleep(3000);
		String todaysdeal = driver.getTitle();
		//International Shopping: Shop special offers and deals that ship internationally
		System.out.println(todaysdeal);
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]")).click();
		String custservice = driver.getTitle();
		System.out.println(custservice);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")).click();
		String giftcards = driver.getTitle();
		System.out.println(giftcards);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click();
		String sell = driver.getTitle();
		System.out.println(sell);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]")).click();
		String registry = driver.getTitle();
		System.out.println(registry);
//		Amazon.com Help: Help
//		Amazon.com Gift Cards
//		Amazon.com: Sell Products Online with Selling on Amazon.
//		Amazon Registry & Gifting
				 
		

	}

}
