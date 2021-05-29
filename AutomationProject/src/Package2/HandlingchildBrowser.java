package Package2;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingchildBrowser {

	public static void main(String[] args) throws InterruptedException, IOException{
		 System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/");
		 Thread.sleep(3000);
//	1.can you close a parent browser window only
//		 driver.close();
		 
//	2.can you close all the browser windows without using quit()
//		 driver.quit();
		 
		 
//	3.can you close all the browser windows without using quit()
//		 Set<String> allwhs = driver.getWindowHandles();
//		 System.out.println(allwhs.size());
//		 for(String wh:allwhs)
//		 {
//			 driver.switchTo().window(wh);
//			 driver.close();
//		 }
		 
//  4.can you perform action on a particular browser
//		 Set<String> allwh = driver.getWindowHandles();
//		 for(String wh1:allwh)
//		 {
//			String title=driver.switchTo().window(wh1).getTitle();
//			System.out.println(title);
//			if(title.equals("Ellie MAE"))
//			{
//				Thread.sleep(3000);
//				driver.manage().window().maximize();
//				Thread.sleep(3000);
//				driver.close();
//				break;
//				}
//		 }
		 
//	 5.can you close all the child browsers only
		 String parentTitle = driver.getTitle();
		 Set<String> allwhs2 = driver.getWindowHandles();
		 for(String wh2:allwhs2)
		 {
			 String title=driver.switchTo().window(wh2).getTitle();
			 if(!title.equals(parentTitle))
			 {
				 driver.close();
	//			 driver.switchTo().window(wh2);//NoSuchWindowException
			 }
		 }
		 
		}
      }
