package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDD {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();		 
		 driver.get("file:///E:/HTML/Multi-selectDD.html");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		 WebElement ddAddr=driver.findElement(By.id("Kritunga"));
		 Select sel=new Select(ddAddr);//Address of DropDown
		  
		 List<WebElement> alloptions = sel.getOptions();
          System.out.println(alloptions.size());
          
        //  for(int i=0;i<alloptions.size();i++)
        // {
       //  System.out.println(alloptions.get(i).getText());
       //  sel.selectByIndex(i);
       //   }
          
//          for(int j=0;j<alloptions.size();j++)
//          {
//        	  
//        	  sel.selectByIndex(j);
//          }
 //         sel.deselectAll();
          
//          for(int j=alloptions.size()-1;j>=0;j--)
//          {
//        	  sel.selectByIndex(j);
//        	  sel.deselectByIndex(j);
//          }
//          Thread.sleep(3000);
          for(int k=1;k<=5;k++)
          {
        	  sel.selectByIndex(k);
          }
         List<WebElement> alselop = sel.getAllSelectedOptions();
          System.out.println(alselop.size());
          
//          WebElement firstselop = sel.getFirstSelectedOption();
//          System.out.println(firstselop.getText());
          
 //         WebElement wrapEle = sel.getWrappedElement();
//          System.out.println(wrapEle.getLocation());
//          System.out.println(wrapEle.getAttribute("id"));
//          System.out.println(wrapEle.getTagName());
//          System.out.println(wrapEle.getText());
//          System.out.println(wrapEle.getClass());
//          System.out.println(wrapEle.getCssValue("e"));
          for(WebElement oneop:alselop)
          {
        	  System.out.println(oneop.getText());
          }
          if(sel.isMultiple())
          {
        	  System.out.println("It is Multi-Select DropDown");
          }
          else {
        	  System.out.println("It is Single-select DropDown");
          }
//          sel.selectByValue("d");
//          sel.selectByVisibleText("Biryani");
//          sel.selectByIndex(9);
//          sel.deselectByVisibleText("Biryani");
          
	}

}
