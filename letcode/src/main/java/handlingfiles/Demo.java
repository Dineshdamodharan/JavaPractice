package handlingfiles;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\user\\Documents.txt");
		if(file.exists()) {
			System.out.println(file.getAbsolutePath());
		}else {
			System.out.println("the file is not available");
		}
	}

}
