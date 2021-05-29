package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("file:///E:/HTML/Multi-selectDD.html");
		 
		    //print all the options as it is..
		 
//		 WebElement ddAddr = driver.findElement(By.id("Kritunga"));
//		 Select s=new Select(ddAddr);
//		 List<WebElement> alloptions = s.getOptions();
//		 for(WebElement oneopt:alloptions)
//		 {
//			 System.out.println(oneopt.getText());
//		 }
		 
		      //Print all the options without duplicate
		 
//		 WebElement ddAddr = driver.findElement(By.id("Kritunga"));
//     	 Select s=new Select(ddAddr);
//     	 List<WebElement> alloptions = s.getOptions();
//     	 Set<String> st = new HashSet<>();
//     	 for(WebElement oneopt:alloptions)
//     	 {
//     		 String text=oneopt.getText();
//     		 st.add(text);
//     	 }
//     	 for(String oneText:st)
//     	 {
//     		 System.out.println(oneText);
//     	 }
		 
		    //Print options without duplicates+order should be maintained
		 
//		 WebElement ddAddr = driver.findElement(By.id("Kritunga"));
//     	 Select s=new Select(ddAddr);
//     	 List<WebElement> alloptions = s.getOptions();
//     	 Set<String> st = new LinkedHashSet<>();
//     	 for(WebElement oneopt:alloptions)
//     	 {
//     		 String text=oneopt.getText();
//     		 st.add(text);
//     	 }
//     	 for(String oneText:st)
//     	 {
//     		 System.out.println(oneText);
//     	 }
		 
		 //Print options without duplicates+sorted order
		 
		 WebElement ddAddr = driver.findElement(By.id("Kritunga"));
     	 Select s=new Select(ddAddr);
     	 List<WebElement> alloptions = s.getOptions();
     	 Set<String> st = new TreeSet<>();
     	 for(WebElement oneopt:alloptions)
     	 {
     		 String text=oneopt.getText();
     		 st.add(text);
     	 }
     	 for(String oneText:st)
     	 {
     		 System.out.println(oneText);
     	 }

	}

}
