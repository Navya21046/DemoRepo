package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsofTestNG {
	@Test
	public void run()
	{
		Reporter.log("run method",true);
	}
	@Test
	public void bun1()
	{
		Reporter.log("bun1 method",true);
	}
	@Test(priority=2,description="This flag is used to write brief description")
	public void bun()
	{
		Reporter.log("bun method",true);
	}
	@Test(priority=1,invocationCount=3,enabled=true,description="verify create customer")
	public void gun()
	{
		Reporter.log("gun method",true);
	}
	

}
