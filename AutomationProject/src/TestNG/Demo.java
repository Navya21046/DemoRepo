package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void run()
	{
//		System.out.println("console Msg");
//		Reporter.log("Report Msg");
//		Reporter.log("Report+console",true);
		Reporter.log("run meth of Demo class",true);
	}

}
