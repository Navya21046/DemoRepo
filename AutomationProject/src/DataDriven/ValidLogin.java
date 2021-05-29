package DataDriven;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Thread.sleep(8000);
		FileLib flib=new FileLib();
		String un = flib.getCelldata(EXCEL_PATH, "Valid", 1, 0);
		String pwd=flib.getCelldata(EXCEL_PATH, "Valid", 1, 1);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

	}

}
