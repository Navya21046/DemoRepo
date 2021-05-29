 package sere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //Declaration
	@FindBy(id="username") private WebElement untb;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
   
     }
	//Utilization
	//Address returning method
	public WebElement getUntb()
	{
		return untb;
	}
	//Action performing method
	public void setUntb(String un)
	{
		untb.sendKeys(un);
	}

}
