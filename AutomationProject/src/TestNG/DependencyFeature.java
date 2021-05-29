package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyFeature {
	@Test
	public void transfer1()
	{
		//Assert.fail();//Intentionally fail a test method
		Reporter.log("Sucessfully transferred1",true);
	}
	@Test
	public void transfer2()
	{
		//Assert.fail();//Intentionally fail a test method
		Reporter.log("Sucessfully transferred2",true);
	}
	@Test(dependsOnMethods= {"transfer1","transfer2"})
	public void delete()
	{
		Reporter.log("Sucessfully Deleted",true);
	}
	@Test(dependsOnMethods= "transfer1",alwaysRun=false,enabled=true)
	public void important()
	{
		Reporter.log("Important",true);
	}
	

}
