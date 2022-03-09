package dp_integration;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] getexcel()  {
	String filelocation = "./test data/login-data.xlsx";
	XSSFWorkbook wbook = null;
	try {
		wbook = new XSSFWorkbook(filelocation);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	XSSFSheet sheet = wbook.getSheetAt(0);
	int lastrownum = sheet.getLastRowNum();
	System.out.println("lastroll num=="+lastrownum);
	int physicalrownumber = sheet.getPhysicalNumberOfRows();
	System.out.println("including header=="+physicalrownumber);
	short lastcellnum = sheet.getRow(0).getLastCellNum();
	System.out.println("lastcellnum==="+lastcellnum);
	String[][]data = new String[lastrownum][lastcellnum];
	  //  for (int i = 1; i <=2; i++)      for specified numbers
		for (int i = 1; i <= lastrownum; i++)/* for changing value */ {
		XSSFRow row = sheet.getRow(i);
		/* for (int j = 0; j < 2; j++) */ 
		for (int j = 0; j < lastcellnum; j++){
			XSSFCell cell = row.getCell(j);
			//String value = cell.getStringCellValue();
			DataFormatter dtf= new DataFormatter();
	
				String value = dtf.formatCellValue(cell);
		//	System.out.println(value);
		data [i-1][j]= value ;
		
		} 
	}
	try {
		wbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data;
	
}
}
