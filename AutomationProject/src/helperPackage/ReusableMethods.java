package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethods {
	public static WebDriver driver;
	public void OpenApp() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
	}
	public void closeApp() {
		driver.close();
	}
	public static void main(String[] args) {
		
		
		
	}
	

}
