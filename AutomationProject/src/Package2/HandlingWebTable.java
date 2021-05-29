package Package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("file:///E:/HTML/WebTable.html");
		// Total Tables
//		  List<WebElement> alltds = driver.findElements(By.tagName("td"));
//		 System.out.println("Total tds:"+alltds.size());
		 
		 WebElement table2 = driver.findElement(By.id("t2"));
		 List<WebElement> tab2tds = table2.findElements(By.tagName("td"));
		 System.out.println("Tds inside table2: "+tab2tds.size());

	}

}