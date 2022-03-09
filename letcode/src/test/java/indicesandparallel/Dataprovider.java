package indicesandparallel;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	@DataProvider(name="learn", indices = {0,2}, parallel = true)
	public String[][] getdata() {
		String[][]array = new String[3][2];
		array[0][0]= "dineshdamodharan@gmail.com";
		array[0][1]="pass123$";
		array[1][0]= "dineshdamodharan0@gmail.com";
		array[1][1]="pass123$";
		array[2][0]="dineshdamodharan00@gmail.com";
		array[2][1]= "pass123$";
		return array;
	}
}
