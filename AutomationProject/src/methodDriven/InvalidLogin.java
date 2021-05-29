package methodDriven;

public class InvalidLogin extends BaseTest{

	public static void main(String[] args) throws Throwable {
    BaseTest bt=new BaseTest();
    bt.openBrowser();
    LoginPage lp=new LoginPage(driver);
    FileLib flib=new FileLib();
    int rc = flib.getRowCount(EXCEL_PATH,"Invalid");
    System.out.println(rc);
    for(int i=1;i<=rc;i++)
    {
    	String un=flib.getCelldata(EXCEL_PATH,"Invalid",i,0);
    	String pw = flib.getCelldata(EXCEL_PATH,"Invalid",i,1);
    	lp.login(un,pw);
    	Thread.sleep(3000);
    }
    
	}

}
