package methodDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //Declaration
	@FindBy(id="username") private WebElement untb;
	@FindBy(name="pwd") private WebElement pwtb;
	@FindBy(xpath="//div[text()='Login ']") private WebElement loginBtn;
	
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
	public WebElement getPwtb() {
		return pwtb;
	}
	public void setPwtb(String pw) {
		pwtb.sendKeys(pw);
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	public void login(String un, String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		loginBtn.click();
	}
	

}
