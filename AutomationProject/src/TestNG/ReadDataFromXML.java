package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXML {
	@Parameters({"browser","username"})
	@Test
	public void getDataFromXML(String br,String un)
	{
		Reporter.log(br,true);
		Reporter.log(un,true);
	}

}
