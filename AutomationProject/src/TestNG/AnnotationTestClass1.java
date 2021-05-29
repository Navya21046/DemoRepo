package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

//BC
public class AnnotationTestClass1 extends AnnotationsInTestNG{
	//BM
	@Test
	public void run()
	{
		Reporter.log("I am Run Method",true);
	}
	//AM
}
//AC
	//BC
	


