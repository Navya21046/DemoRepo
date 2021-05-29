package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;
public class Browsertest {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.out.println("Enter Browser Name:");
		Scanner s=new Scanner(System.in);
		String browserName= s.next();
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
        driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers//geckodriver.exe");
	        driver=new FirefoxDriver();	
		}
		else {
			System.out.println("Enter Proper Browser name");
		}
	}

}
