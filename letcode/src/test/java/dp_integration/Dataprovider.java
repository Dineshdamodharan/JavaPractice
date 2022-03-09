package dp_integration;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name = "learn", /* indices = {1,2}, */ parallel = true)
	public String[][] getdata() {
		String[][] exceldata = ReadExcel.getexcel();
		
	/*	String[][]array = new String[3][2];
		array[0][0]= "dineshdamodharan@gmail.com";
		array[0][1]="pass123$";
		array[1][0]= "dineshdamodharan0@gmail.com";
		array[1][1]="pass123$";
		array[2][0]="dineshdamodharan00@gmail.com";
		array[2][1]= "pass123$";*/
		return getdata();
	}
}
