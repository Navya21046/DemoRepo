package testScript;

import org.openqa.selenium.support.ui.Select;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import helperPackage.ReusableMethods;

public class Searchotel extends ReusableMethods{

	public static void main(String[] args) {
		ReusableMethods re=new ReusableMethods();
		LoginPage lp=new LoginPage();
		HomePage hp=new HomePage();
		re.OpenApp();
		driver.findElement(lp.usernameTextbox).sendKeys("rameshadepu");
		driver.findElement(lp.passwordTextbox).sendKeys("ramesh");
		driver.findElement(lp.loginbutton).click();
		new Select(driver.findElement(hp.locationlistbox)).selectByIndex(2);
		new Select(driver.findElement(hp.roomnoslistbox)).selectByIndex(2);
		driver.findElement(hp.checkintextbox).clear();
		driver.findElement(hp.checkintextbox).sendKeys("08/03/2021");
		driver.findElement(hp.checkouttextbox).clear();
		driver.findElement(hp.checkouttextbox).sendKeys("09/03/2021");
		new Select(driver.findElement(hp.adultsroonlistbox)).selectByIndex(1);
		driver.findElement(hp.SearchButton).click();
		driver.findElement(hp.logoutlink).click();
		
		
	}

}
