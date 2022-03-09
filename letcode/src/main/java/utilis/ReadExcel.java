package utilis;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws IOException {
	String filelocation = "./test data/login-data.xlsx";
	XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
	XSSFSheet sheet = wbook.getSheetAt(0);
	int lastrownum = sheet.getLastRowNum();
	System.out.println("lastroll num=="+lastrownum);
	int physicalrownumber = sheet.getPhysicalNumberOfRows();
	System.out.println("including header=="+physicalrownumber);
	short lastcellnum = sheet.getRow(0).getLastCellNum();
	System.out.println("lastcellnum==="+lastcellnum);
	  //  for (int i = 1; i <=2; i++)      for specified numbers
		for (int i = 1; i <= lastrownum; i++)/* for changing value */ {
		XSSFRow row = sheet.getRow(i);
		/* for (int j = 0; j < 2; j++) */ 
		for (int j = 0; j < lastcellnum; j++){
			XSSFCell cell = row.getCell(j);
			//String value = cell.getStringCellValue();
			DataFormatter dtf= new DataFormatter();
			String value = dtf.formatCellValue(cell);
			System.out.println(value);
		} 
	}
	
	
}
}
