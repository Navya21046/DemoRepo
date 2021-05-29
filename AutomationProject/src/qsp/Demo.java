package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="E:\\Selenium\\KCSA4\\AutomationProject\\Drivers\\chromedriver.exe";
		System.setProperty(key,value);
		new ChromeDriver().close();
		
		String key1="webdriver.gecko.driver";
		String value1="E:\\Selenium\\KCSA4\\AutomationProject\\Drivers\\geckodriver.exe";
		System.setProperty(key1,value1);
		FirefoxDriver driver=new FirefoxDriver();
        driver.close();

	}

}
