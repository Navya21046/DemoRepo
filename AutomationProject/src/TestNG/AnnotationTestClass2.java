package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationTestClass2 extends AnnotationsInTestNG{
	@Test
	//BM
	public void gun()
	{
		Reporter.log("I am Gun Method",true);
	}
	//AM
}
//AC
