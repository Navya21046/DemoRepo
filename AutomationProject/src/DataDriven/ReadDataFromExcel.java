package DataDriven;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
      public static void main(String[] args) throws Throwable    {
    	  //Open the file in read mode
		FileInputStream fis=new FileInputStream("E:\\Selenium\\KCSA4\\AutomationProject\\Data\\inputData.xlsx");
		//Prepare the file for reading
		Workbook wb=WorkbookFactory.create(fis);
		//Go to Particular Sheet
		Sheet sh = wb.getSheet("Sheet1");
		//Go to Particular row
		Row r = sh.getRow(0);
		//Go to Particular Cell
		Cell c = r.getCell(1);
		//Get the String value present in the Cell
		String val = c.getStringCellValue();
		System.out.println(val);   
		}
     }
