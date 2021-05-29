package KeywordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable  {
		FileInputStream fis=new FileInputStream("E:\\Selenium\\KCSA4\\AutomationProject\\Data\\config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("password");
		//String value=prop.getProperty("plyer", "Incorrect Key");
		System.out.println(value);

	}

}
