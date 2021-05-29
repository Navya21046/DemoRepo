package methodDriven;

public class ValidLogin  extends BaseTest{

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		LoginPage lp=new LoginPage(driver);
		FileLib flib=new FileLib();
		String un = flib.getPropertyValue(PROP_PATH, "username");
		String pw = flib.getPropertyValue(PROP_PATH, "password");
		lp.setUntb(un);
		lp.setPwtb(pw);
		lp.clickLoginBtn();

	}

}
