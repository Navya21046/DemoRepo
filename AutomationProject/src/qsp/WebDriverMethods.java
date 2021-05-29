package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		//open chrome browser
		WebDriver driver=new ChromeDriver();
		//enter the test url
		driver.get("https://www.google.com");
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//String pgsrc=driver.getPageSource();
		//System.out.println(pgsrc);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("Google Page is Displayed, Test Step PASSED");
		}
			else {
				System.out.println("Google Page is not Displayed, Test Step FAILED");
			}
		}

	}


