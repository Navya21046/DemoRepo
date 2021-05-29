package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadriventestNG {
	@DataProvider(name="db1")
	    public Object[][] databank1()
	    {
	    	Object[][] obj=new Object[3][3];
	    	obj[0][0]="admin1";
	    	obj[0][1]="manager1";
	    	obj[0][2]="Hyderabad";
	    	
	    	obj[1][0]="admin2";
	    	obj[1][1]="manager2";
	    	obj[1][2]="Bangalore";
	    	
	    	obj[2][0]="admin3";
	    	obj[2][1]="manager3";
	    	obj[2][2]="Vizag";
	    	return obj;
	    }
	@Test(dataProvider="db1")
	    public void getCredentials(String un,String pwd,String city)
	    {
	    	Reporter.log(un,true);
	    	Reporter.log(pwd,true);
	    	Reporter.log(city,true);
	    }
	}
