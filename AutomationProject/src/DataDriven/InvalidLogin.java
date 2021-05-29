package DataDriven;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest{

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
		int rCount = flib.getRowCount(EXCEL_PATH, "Invalid");
		System.out.println(rCount);
		for(int i=1;i<=4;i++)
		{
			String un = flib.getCelldata(EXCEL_PATH,"Invalid",i,0);
			String pwd = flib.getCelldata(EXCEL_PATH, "Invalid",i,1);
			
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
		}

	}

}
