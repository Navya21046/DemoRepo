package KeywordDriven;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Thread.sleep(5000);
		FileLib flib=new FileLib();
		String un = flib.getPropertyValue(PROP_PATH, "username");
		String pw=flib.getPropertyValue(PROP_PATH, "password");
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
