package letcode;

import java.util.Scanner;

public class Ifelsessstatement {

	public static void main(String[] args) {
		
Scanner scanner= new Scanner(System.in);
System.out.println("enter a number");
int number =scanner.nextInt();
if (number<0) {System.out.println("the number "+number+" is negative");
}
else if (number>0){
		
	System.out.println("the number "+number+" is positive");
}
	
scanner.close();

}
}
