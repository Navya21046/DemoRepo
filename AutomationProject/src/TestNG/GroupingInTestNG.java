package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingInTestNG {
	@Test(groups="SmokeGrp")
	public void smoke1()
	{
		Reporter.log("Smoke Testing1",true);
	}
	@Test(groups="FT")
	public void fT1()
	{
		Reporter.log("Functional Testing1",true);
	}
	@Test(groups="IT")
	public void iT1()
	{
		Reporter.log("Integration Testing1",true);
	}
	@Test(groups="SmokeGrp")
	public void smoke2()
	{
		Reporter.log("Smoke Testing2",true);
	}
	@Test(groups="System")
	public void system1()
	{
		Reporter.log("System Testing1",true);
	}
	@Test(groups="FT")
	public void fT2()
	{
		Reporter.log("Functional Testing2",true);
	}
	@Test(groups="SmokeGrp")
	public void smoke3()
	{
		Reporter.log("Smoke Testing3",true);
	}
	@Test(groups="IT")
	public void iT2()
	{
		Reporter.log("Integration Testing2",true);
	}
	@Test(groups="System")
	public void system2()
	{
		Reporter.log("System Testing2",true);
	}
	@Test(groups="IT")
	public void iT3()
	{
		Reporter.log("Integration Testing3",true);
	}

}
