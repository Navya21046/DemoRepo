package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///E:/HTML/LoginTest.html");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links:"+allLinks.size());
		
		         //printing text of all elements
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement oneLink=allLinks.get(i);
			String text=oneLink.getText();
			System.out.println(text);
		}
		            //clicking on the last link
		//allLinks.get(allLinks.size()-1).click();
		
		              //Handling single Element
		 //WebElement gLink=driver.findElement(By.linkText("Google"));
		// System.out.println("TagName is: "+gLink.getTagName());
		 //System.out.println("Text is: "+gLink.getText());
		// System.out.println("Attribute value: "+gLink.getAttribute("href"));
		 
		 }

}
