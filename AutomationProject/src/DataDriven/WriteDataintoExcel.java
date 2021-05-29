package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataintoExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("E:\\Selenium\\KCSA4\\AutomationProject\\Data\\inputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(2).createCell(0).setCellValue("Navya");
		//open the file in write mode
		FileOutputStream fos=new FileOutputStream("E:\\Selenium\\KCSA4\\AutomationProject\\Data\\inputData.xlsx");
		wb.write(fos);
		System.out.println("Done");
	}

}
