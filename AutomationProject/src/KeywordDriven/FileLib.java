package KeywordDriven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
   //Generic reusable method for reading the data
	public String getCelldata(String path,String Sheetname,int row,int cell) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String val=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return val;
	}
	//Generic reusable method for write data into excel
	public void setCelldata(String path,String Sheetname,int row,int cell,String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(Sheetname).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
    }
	//Generic reusable method to count rows filled in a particular sheet of an excel file
	public int getRowCount(String path,String Sheet) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(Sheet).getLastRowNum();
		return 0;
		
	}
	//Generic reusable method to read the data from property file
	public String getPropertyValue(String path,String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String propvalue = prop.getProperty(key);
		return propvalue;
	}
}